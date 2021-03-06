package com.toma.pubgmc.core;

import com.toma.pubgmc.Pubgmc;
import net.minecraft.launchwrapper.IClassTransformer;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.*;

public class PMCClassTransformer implements IClassTransformer {

    @Override
    public byte[] transform(String name, String transformedName, byte[] basicClass) {
        // checks if is in obfuscated environment for specific object names
        boolean isObfEnv = !name.equals(transformedName);
        // if found class is the ModelPlayer.class
        switch (transformedName) {
            case "net.minecraft.client.model.ModelBiped":
                // proceed to patching
                return this.patchModelBiped(basicClass, isObfEnv);
            case "net.minecraft.client.renderer.entity.layers.LayerHeldItem":
                return this.patchLayerHeldItem(basicClass, isObfEnv);
        }
        // return the class
        return basicClass;
    }

    public byte[] patchModelBiped(byte[] bytes, boolean isObf) {
        long l = System.currentTimeMillis();
        Pubgmc.logger.info("Transforming net.minecraft.client.model.ModelBiped");

        ClassNode classNode = new ClassNode();
        ClassReader classReader = new ClassReader(bytes);
        classReader.accept(classNode, 0);
        // specific method name I need to patch
        Name methodName = new Name("setRotationAngles", "func_78087_a");
        // method params - 6x Float, 1x Entity, returns nothing -> V
        String methodParams = "(FFFFFFLnet/minecraft/entity/Entity;)V";
        // iterate through all methods
        for(MethodNode methodNode : classNode.methods) {
            if(methodNode.name.equals(methodName.getName(isObf)) && methodNode.desc.equals(methodParams)) {
                AbstractInsnNode target = null;
                // iterate through all instructions
                for(AbstractInsnNode abstractInsnNode : methodNode.instructions.toArray()) {
                    if(abstractInsnNode instanceof LineNumberNode && ((LineNumberNode) abstractInsnNode).line == 281) {
                        // we found the last static method call inside the method
                        target = abstractInsnNode;
                        break;
                    }
                }
                if(target != null) {
                    Pubgmc.logger.info("Patching #setRotationAngles method");
                    // new instruction list
                    InsnList eventInsns = new InsnList();
                    eventInsns.add(new LabelNode());
                    // get the EventBus instance
                    eventInsns.add(new FieldInsnNode(Opcodes.GETSTATIC, "net/minecraftforge/common/MinecraftForge", "EVENT_BUS", "Lnet/minecraftforge/fml/common/eventhandler/EventBus;"));
                    // create new event instance
                    eventInsns.add(new TypeInsnNode(Opcodes.NEW, "com/toma/pubgmc/event/client/SetupAnglesEvent"));
                    eventInsns.add(new InsnNode(Opcodes.DUP));
                    // load ModelBiped instance
                    eventInsns.add(new VarInsnNode(Opcodes.ALOAD, 0));
                    // load the Entity reference
                    eventInsns.add(new VarInsnNode(Opcodes.ALOAD, 7));
                    // call the event constructor
                    eventInsns.add(new MethodInsnNode(Opcodes.INVOKESPECIAL, "com/toma/pubgmc/event/client/SetupAnglesEvent", "<init>", "(Lnet/minecraft/client/model/ModelBiped;Lnet/minecraft/entity/Entity;)V", false));
                    // execute the event on the EventBus
                    eventInsns.add(new MethodInsnNode(Opcodes.INVOKEVIRTUAL, "net/minecraftforge/fml/common/eventhandler/EventBus", "post", "(Lnet/minecraftforge/fml/common/eventhandler/Event;)Z", false));
                    eventInsns.add(new InsnNode(Opcodes.POP));
                    eventInsns.add(new LineNumberNode(282, new LabelNode()));
                    // insert set of instructions before the targetNode
                    methodNode.instructions.insertBefore(target, eventInsns);
                    Pubgmc.logger.info("Patching successful. Took {} ms", System.currentTimeMillis() - l);
                } else Pubgmc.logger.fatal("Patching failed, things are not going to work!");
                break;
            }
        }
        ClassWriter classWriter = new ClassWriter(ClassWriter.COMPUTE_FRAMES);
        classNode.accept(classWriter);
        // convert to bytes
        return classWriter.toByteArray();
    }

    public byte[] patchLayerHeldItem(byte[] bytes, boolean isObf) {
        long l = System.currentTimeMillis();
        Pubgmc.logger.info("Transforming net.minecraft.client.renderer.entity.layers.LayerHeldItem");
        ClassNode node = new ClassNode();
        ClassReader reader = new ClassReader(bytes);
        reader.accept(node, 0);
        Name methodName = new Name("renderHeldItem", "func_188358_a");
        String params = "(Lnet/minecraft/entity/EntityLivingBase;Lnet/minecraft/item/ItemStack;Lnet/minecraft/client/renderer/block/model/ItemCameraTransforms$TransformType;Lnet/minecraft/util/EnumHandSide;)V";
        for(MethodNode methodNode : node.methods) {
            if(methodNode.name.equals(methodName.getName(isObf)) && methodNode.desc.equals(params)) {
                AbstractInsnNode target = null;
                for(AbstractInsnNode abstractInsnNode : methodNode.instructions.toArray()) {
                    if(abstractInsnNode.getOpcode() == Opcodes.INVOKESTATIC && abstractInsnNode.getNext() instanceof LabelNode && abstractInsnNode.getNext().getNext() instanceof LineNumberNode && abstractInsnNode.getNext().getNext().getNext().getOpcode() == Opcodes.INVOKESTATIC) {
                        target = abstractInsnNode;
                        break;
                    }
                }
                if(target != null) {
                    Pubgmc.logger.info("Patching #renderHeldItem method");
                    InsnList list = new InsnList();
                    list.add(new LabelNode());
                    list.add(new FieldInsnNode(Opcodes.GETSTATIC, "net/minecraftforge/common/MinecraftForge", "EVENT_BUS", "Lnet/minecraftforge/fml/common/eventhandler/EventBus;"));
                    list.add(new TypeInsnNode(Opcodes.NEW, "com/toma/pubgmc/event/client/RenderItemInHandEvent"));
                    list.add(new InsnNode(Opcodes.DUP));
                    list.add(new VarInsnNode(Opcodes.ALOAD, 1));
                    list.add(new VarInsnNode(Opcodes.ALOAD, 2));
                    list.add(new VarInsnNode(Opcodes.ALOAD, 4));
                    list.add(new MethodInsnNode(Opcodes.INVOKESPECIAL, "com/toma/pubgmc/event/client/RenderItemInHandEvent", "<init>", "(Lnet/minecraft/entity/EntityLivingBase;Lnet/minecraft/item/ItemStack;Lnet/minecraft/util/EnumHandSide;)V", false));
                    list.add(new MethodInsnNode(Opcodes.INVOKEVIRTUAL, "net/minecraftforge/fml/common/eventhandler/EventBus", "post", "(Lnet/minecraftforge/fml/common/eventhandler/Event;)Z", false));
                    list.add(new InsnNode(Opcodes.POP));
                    methodNode.instructions.insert(target, list);
                    Pubgmc.logger.info("Patching successful. Took {} ms", System.currentTimeMillis() - l);
                } else Pubgmc.logger.fatal("Patching failed, things are not going to work!");
                break;
            }
        }
        ClassWriter writer = new ClassWriter(ClassWriter.COMPUTE_FRAMES);
        node.accept(writer);
        return writer.toByteArray();
    }

    private class Name {

        private final String obf, deobf;

        public Name(final String deobf, final String obf) {
            this.obf = obf;
            this.deobf = deobf;
        }

        public String getName(boolean isObfEnv) {
            return isObfEnv ? this.obf : this.deobf;
        }
    }
}
