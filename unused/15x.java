//Made with Blockbench
//Paste this code into your mod.

import org.lwjgl.opengl.GL11;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class 15x extends ModelBase {
	private final ModelRenderer scope;
	private final ModelRenderer ring1;
	private final ModelRenderer bone;
	private final ModelRenderer bone2;
	private final ModelRenderer bone3;
	private final ModelRenderer ring2;
	private final ModelRenderer bone4;
	private final ModelRenderer bone5;
	private final ModelRenderer bone6;
	private final ModelRenderer ring3;
	private final ModelRenderer bone7;
	private final ModelRenderer bone8;
	private final ModelRenderer bone9;
	private final ModelRenderer ring4;
	private final ModelRenderer bone10;
	private final ModelRenderer bone11;
	private final ModelRenderer bone12;
	private final ModelRenderer ring5;
	private final ModelRenderer bone13;
	private final ModelRenderer bone14;
	private final ModelRenderer bone15;
	private final ModelRenderer ring6;
	private final ModelRenderer bone52;
	private final ModelRenderer bone53;
	private final ModelRenderer bone54;
	private final ModelRenderer ring7;
	private final ModelRenderer bone55;
	private final ModelRenderer bone56;
	private final ModelRenderer bone57;
	private final ModelRenderer ring8;
	private final ModelRenderer bone58;
	private final ModelRenderer bone59;
	private final ModelRenderer bone60;
	private final ModelRenderer ring9;
	private final ModelRenderer bone61;
	private final ModelRenderer bone62;
	private final ModelRenderer bone63;
	private final ModelRenderer detail1;
	private final ModelRenderer bone32;
	private final ModelRenderer bone31;
	private final ModelRenderer bone30;
	private final ModelRenderer bone29;
	private final ModelRenderer bone28;
	private final ModelRenderer bone27;
	private final ModelRenderer bone26;
	private final ModelRenderer bone25;
	private final ModelRenderer bone24;
	private final ModelRenderer bone23;
	private final ModelRenderer bone21;
	private final ModelRenderer bone33;
	private final ModelRenderer bone20;
	private final ModelRenderer bone19;
	private final ModelRenderer bone18;
	private final ModelRenderer bone17;
	private final ModelRenderer bone16;
	private final ModelRenderer bone22;
	private final ModelRenderer detail2;
	private final ModelRenderer bone34;
	private final ModelRenderer bone35;
	private final ModelRenderer bone36;
	private final ModelRenderer bone37;
	private final ModelRenderer bone38;
	private final ModelRenderer bone39;
	private final ModelRenderer bone40;
	private final ModelRenderer bone41;
	private final ModelRenderer bone42;
	private final ModelRenderer bone43;
	private final ModelRenderer bone44;
	private final ModelRenderer bone45;
	private final ModelRenderer bone46;
	private final ModelRenderer bone47;
	private final ModelRenderer bone48;
	private final ModelRenderer bone49;
	private final ModelRenderer bone50;
	private final ModelRenderer bone51;
	private final ModelRenderer cover;

	public 15x() {
		textureWidth = 128;
		textureHeight = 128;

		scope = new ModelRenderer(this);
		scope.setRotationPoint(0.0F, 24.0F, 0.0F);

		ring1 = new ModelRenderer(this);
		ring1.setRotationPoint(0.0F, 0.0F, -6.0F);
		scope.addChild(ring1);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 0.0F, 0.0F);
		ring1.addChild(bone);
		bone.cubeList.add(new ModelBox(bone, 70, 70, -1.5F, 3.5981F, -2.0F, 3, 2, 4, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 70, 70, -1.5F, -5.5981F, -2.0F, 3, 2, 4, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 70, 70, 3.5981F, -1.5F, -2.0F, 2, 3, 4, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 70, 70, -5.5981F, -1.5F, -2.0F, 2, 3, 4, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 70, 70, -1.0F, 5.5981F, -1.5F, 2, 3, 3, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 70, 70, -2.5F, 8.5981F, -2.0F, 5, 2, 16, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 70, 70, 1.7031F, 9.0356F, -2.0F, 1, 2, 16, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 70, 70, -2.7031F, 9.0356F, -2.0F, 1, 2, 16, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 70, 70, -2.6563F, 8.8949F, -2.0F, 1, 1, 16, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 70, 70, -2.5938F, 8.6918F, -2.0F, 1, 1, 16, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 70, 70, 1.5938F, 8.6918F, -2.0F, 1, 1, 16, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 70, 70, 1.6563F, 8.8949F, -2.0F, 1, 1, 16, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone2, 0.0F, 0.0F, 0.5236F);
		ring1.addChild(bone2);
		bone2.cubeList.add(new ModelBox(bone2, 70, 70, -1.5F, 3.5981F, -2.0F, 3, 2, 4, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 70, 70, 3.5981F, -1.5F, -2.0F, 2, 3, 4, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 70, 70, -5.5981F, -1.5F, -2.0F, 2, 3, 4, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 70, 70, -1.5F, -5.5981F, -2.0F, 3, 2, 4, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone3, 0.0F, 0.0F, -0.5236F);
		ring1.addChild(bone3);
		bone3.cubeList.add(new ModelBox(bone3, 70, 70, -1.5F, 3.5981F, -2.0F, 3, 2, 4, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 70, 70, -1.5F, -5.5981F, -2.0F, 3, 2, 4, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 70, 70, -5.5981F, -1.5F, -2.0F, 2, 3, 4, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 70, 70, 3.5981F, -1.5F, -2.0F, 2, 3, 4, 0.0F, false));

		ring2 = new ModelRenderer(this);
		ring2.setRotationPoint(0.0F, 0.0F, 6.0F);
		scope.addChild(ring2);

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.0F, 0.0F, 0.0F);
		ring2.addChild(bone4);
		bone4.cubeList.add(new ModelBox(bone4, 70, 70, -1.5F, 3.5981F, -2.0F, 3, 2, 4, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 70, 70, -1.5F, -5.5981F, -2.0F, 3, 2, 4, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 70, 70, 3.5981F, -1.5F, -2.0F, 2, 3, 4, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 70, 70, -5.5981F, -1.5F, -2.0F, 2, 3, 4, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 70, 70, -1.0F, 5.5981F, -1.5F, 2, 3, 3, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone5, 0.0F, 0.0F, 0.5236F);
		ring2.addChild(bone5);
		bone5.cubeList.add(new ModelBox(bone5, 70, 70, -1.5F, 3.5981F, -2.0F, 3, 2, 4, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 70, 70, 3.5981F, -1.5F, -2.0F, 2, 3, 4, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 70, 70, -5.5981F, -1.5F, -2.0F, 2, 3, 4, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 70, 70, -1.5F, -5.5981F, -2.0F, 3, 2, 4, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone6, 0.0F, 0.0F, -0.5236F);
		ring2.addChild(bone6);
		bone6.cubeList.add(new ModelBox(bone6, 70, 70, -1.5F, 3.5981F, -2.0F, 3, 2, 4, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 70, 70, -1.5F, -5.5981F, -2.0F, 3, 2, 4, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 70, 70, -5.5981F, -1.5F, -2.0F, 2, 3, 4, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 70, 70, 3.5981F, -1.5F, -2.0F, 2, 3, 4, 0.0F, false));

		ring3 = new ModelRenderer(this);
		ring3.setRotationPoint(0.0F, 0.0F, 0.0F);
		scope.addChild(ring3);

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(0.0F, 0.0F, 0.0F);
		ring3.addChild(bone7);
		bone7.cubeList.add(new ModelBox(bone7, 66, 65, -1.0F, 2.7321F, -14.0F, 2, 2, 22, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 66, 65, -1.0F, -4.7321F, -14.0F, 2, 2, 22, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 66, 65, 2.7321F, -1.0F, -14.0F, 2, 2, 22, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 66, 65, -4.7321F, -1.0F, -14.0F, 2, 2, 22, 0.0F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone8, 0.0F, 0.0F, 0.5236F);
		ring3.addChild(bone8);
		bone8.cubeList.add(new ModelBox(bone8, 66, 65, -1.0F, -4.7321F, -14.0F, 2, 2, 22, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 66, 65, -1.0F, 2.7321F, -14.0F, 2, 2, 22, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 66, 65, -4.7321F, -1.0F, -14.0F, 2, 2, 22, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 66, 65, 2.7321F, -1.0F, -14.0F, 2, 2, 22, 0.0F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone9, 0.0F, 0.0F, 1.0472F);
		ring3.addChild(bone9);
		bone9.cubeList.add(new ModelBox(bone9, 66, 65, -1.0F, 2.7321F, -14.0F, 2, 2, 22, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 66, 65, -1.0F, -4.7321F, -14.0F, 2, 2, 22, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 66, 65, -4.7321F, -1.0F, -14.0F, 2, 2, 22, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 66, 65, 2.7321F, -1.0F, -14.0F, 2, 2, 22, 0.0F, false));

		ring4 = new ModelRenderer(this);
		ring4.setRotationPoint(0.0F, 0.0F, 22.0F);
		scope.addChild(ring4);

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(0.0F, 0.0F, 0.0F);
		ring4.addChild(bone10);
		bone10.cubeList.add(new ModelBox(bone10, 66, 65, -1.0F, 2.7321F, -14.0F, 2, 2, 10, 0.0F, false));
		bone10.cubeList.add(new ModelBox(bone10, 66, 65, -1.0F, -4.7321F, -14.0F, 2, 2, 10, 0.0F, false));
		bone10.cubeList.add(new ModelBox(bone10, 66, 65, 2.7321F, -1.0F, -14.0F, 2, 2, 10, 0.0F, false));
		bone10.cubeList.add(new ModelBox(bone10, 66, 65, -4.7321F, -1.0F, -14.0F, 2, 2, 10, 0.0F, false));

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone11, 0.0F, 0.0F, 0.5236F);
		ring4.addChild(bone11);
		bone11.cubeList.add(new ModelBox(bone11, 66, 65, -1.0F, -4.7321F, -14.0F, 2, 2, 10, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 66, 65, -1.0F, 2.7321F, -14.0F, 2, 2, 10, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 66, 65, -4.7321F, -1.0F, -14.0F, 2, 2, 10, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 66, 65, 2.7321F, -1.0F, -14.0F, 2, 2, 10, 0.0F, false));

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone12, 0.0F, 0.0F, 1.0472F);
		ring4.addChild(bone12);
		bone12.cubeList.add(new ModelBox(bone12, 66, 65, -1.0F, 2.7321F, -14.0F, 2, 2, 10, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 66, 65, -1.0F, -4.7321F, -14.0F, 2, 2, 10, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 66, 65, -4.7321F, -1.0F, -14.0F, 2, 2, 10, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 66, 65, 2.7321F, -1.0F, -14.0F, 2, 2, 10, 0.0F, false));

		ring5 = new ModelRenderer(this);
		ring5.setRotationPoint(0.0F, 0.0F, 20.0F);
		scope.addChild(ring5);

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(0.0F, 0.0F, 0.0F);
		ring5.addChild(bone13);
		bone13.cubeList.add(new ModelBox(bone13, 70, 70, -1.5F, 4.0981F, -2.0F, 3, 1, 4, 0.0F, false));
		bone13.cubeList.add(new ModelBox(bone13, 70, 70, -1.5F, -5.0981F, -2.0F, 3, 1, 4, 0.0F, false));
		bone13.cubeList.add(new ModelBox(bone13, 70, 70, 3.5981F, -1.5F, -2.0F, 1, 3, 4, 0.0F, false));
		bone13.cubeList.add(new ModelBox(bone13, 70, 70, -5.0981F, -1.5F, -2.0F, 1, 3, 4, 0.0F, false));
		bone13.cubeList.add(new ModelBox(bone13, 70, 70, -1.5F, -4.5981F, -2.0F, 3, 1, 4, 0.0F, false));
		bone13.cubeList.add(new ModelBox(bone13, 70, 70, 4.0981F, -1.5F, -2.0F, 1, 3, 4, 0.0F, false));
		bone13.cubeList.add(new ModelBox(bone13, 70, 70, -1.5F, 3.5981F, -2.0F, 3, 1, 4, 0.0F, false));
		bone13.cubeList.add(new ModelBox(bone13, 70, 70, -4.5981F, -1.5F, -2.0F, 1, 3, 4, 0.0F, false));

		bone14 = new ModelRenderer(this);
		bone14.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone14, 0.0F, 0.0F, 0.5236F);
		ring5.addChild(bone14);
		bone14.cubeList.add(new ModelBox(bone14, 70, 70, -1.5F, 4.0981F, -2.0F, 3, 1, 4, 0.0F, false));
		bone14.cubeList.add(new ModelBox(bone14, 70, 70, 4.0981F, -1.5F, -2.0F, 1, 3, 4, 0.0F, false));
		bone14.cubeList.add(new ModelBox(bone14, 70, 70, -5.0981F, -1.5F, -2.0F, 1, 3, 4, 0.0F, false));
		bone14.cubeList.add(new ModelBox(bone14, 70, 70, -1.5F, -5.0981F, -2.0F, 3, 1, 4, 0.0F, false));
		bone14.cubeList.add(new ModelBox(bone14, 70, 70, -1.5F, -4.5981F, -2.0F, 3, 1, 4, 0.0F, false));
		bone14.cubeList.add(new ModelBox(bone14, 70, 70, 3.5981F, -1.5F, -2.0F, 1, 3, 4, 0.0F, false));
		bone14.cubeList.add(new ModelBox(bone14, 70, 70, -1.5F, 3.5981F, -2.0F, 3, 1, 4, 0.0F, false));
		bone14.cubeList.add(new ModelBox(bone14, 70, 70, -4.5981F, -1.5F, -2.0F, 1, 3, 4, 0.0F, false));

		bone15 = new ModelRenderer(this);
		bone15.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone15, 0.0F, 0.0F, -0.5236F);
		ring5.addChild(bone15);
		bone15.cubeList.add(new ModelBox(bone15, 70, 70, -1.5F, 4.0981F, -2.0F, 3, 1, 4, 0.0F, false));
		bone15.cubeList.add(new ModelBox(bone15, 70, 70, -1.5F, -5.0981F, -2.0F, 3, 1, 4, 0.0F, false));
		bone15.cubeList.add(new ModelBox(bone15, 70, 70, -5.0981F, -1.5F, -2.0F, 1, 3, 4, 0.0F, false));
		bone15.cubeList.add(new ModelBox(bone15, 70, 70, 4.0981F, -1.5F, -2.0F, 1, 3, 4, 0.0F, false));
		bone15.cubeList.add(new ModelBox(bone15, 70, 70, -1.5F, -4.5981F, -2.0F, 3, 1, 4, 0.0F, false));
		bone15.cubeList.add(new ModelBox(bone15, 70, 70, 3.5981F, -1.5F, -2.0F, 1, 3, 4, 0.0F, false));
		bone15.cubeList.add(new ModelBox(bone15, 70, 70, -1.5F, 3.5981F, -2.0F, 3, 1, 4, 0.0F, false));
		bone15.cubeList.add(new ModelBox(bone15, 70, 70, -4.5981F, -1.5F, -2.0F, 1, 3, 4, 0.0F, false));

		ring6 = new ModelRenderer(this);
		ring6.setRotationPoint(0.0F, 0.0F, -16.0F);
		scope.addChild(ring6);

		bone52 = new ModelRenderer(this);
		bone52.setRotationPoint(0.0F, 0.0F, 0.0F);
		ring6.addChild(bone52);
		bone52.cubeList.add(new ModelBox(bone52, 70, 70, -1.5F, 4.0981F, 0.0F, 3, 1, 2, 0.0F, false));
		bone52.cubeList.add(new ModelBox(bone52, 70, 70, -1.5F, -5.0981F, 0.0F, 3, 1, 2, 0.0F, false));
		bone52.cubeList.add(new ModelBox(bone52, 70, 70, 3.5981F, -1.5F, 0.0F, 1, 3, 2, 0.0F, false));
		bone52.cubeList.add(new ModelBox(bone52, 70, 70, -5.0981F, -1.5F, 0.0F, 1, 3, 2, 0.0F, false));
		bone52.cubeList.add(new ModelBox(bone52, 70, 70, -1.5F, -4.5981F, 0.0F, 3, 1, 2, 0.0F, false));
		bone52.cubeList.add(new ModelBox(bone52, 70, 70, 4.0981F, -1.5F, 0.0F, 1, 3, 2, 0.0F, false));
		bone52.cubeList.add(new ModelBox(bone52, 70, 70, -1.5F, 3.5981F, 0.0F, 3, 1, 2, 0.0F, false));
		bone52.cubeList.add(new ModelBox(bone52, 70, 70, -4.5981F, -1.5F, 0.0F, 1, 3, 2, 0.0F, false));

		bone53 = new ModelRenderer(this);
		bone53.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone53, 0.0F, 0.0F, 0.5236F);
		ring6.addChild(bone53);
		bone53.cubeList.add(new ModelBox(bone53, 70, 70, -1.5F, 4.0981F, 0.0F, 3, 1, 2, 0.0F, false));
		bone53.cubeList.add(new ModelBox(bone53, 70, 70, 4.0981F, -1.5F, 0.0F, 1, 3, 2, 0.0F, false));
		bone53.cubeList.add(new ModelBox(bone53, 70, 70, -5.0981F, -1.5F, 0.0F, 1, 3, 2, 0.0F, false));
		bone53.cubeList.add(new ModelBox(bone53, 70, 70, -1.5F, -5.0981F, 0.0F, 3, 1, 2, 0.0F, false));
		bone53.cubeList.add(new ModelBox(bone53, 70, 70, -1.5F, -4.5981F, 0.0F, 3, 1, 2, 0.0F, false));
		bone53.cubeList.add(new ModelBox(bone53, 70, 70, 3.5981F, -1.5F, 0.0F, 1, 3, 2, 0.0F, false));
		bone53.cubeList.add(new ModelBox(bone53, 70, 70, -1.5F, 3.5981F, 0.0F, 3, 1, 2, 0.0F, false));
		bone53.cubeList.add(new ModelBox(bone53, 70, 70, -4.5981F, -1.5F, 0.0F, 1, 3, 2, 0.0F, false));

		bone54 = new ModelRenderer(this);
		bone54.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone54, 0.0F, 0.0F, -0.5236F);
		ring6.addChild(bone54);
		bone54.cubeList.add(new ModelBox(bone54, 70, 70, -1.5F, 4.0981F, 0.0F, 3, 1, 2, 0.0F, false));
		bone54.cubeList.add(new ModelBox(bone54, 70, 70, -1.5F, -5.0981F, 0.0F, 3, 1, 2, 0.0F, false));
		bone54.cubeList.add(new ModelBox(bone54, 70, 70, -5.0981F, -1.5F, 0.0F, 1, 3, 2, 0.0F, false));
		bone54.cubeList.add(new ModelBox(bone54, 70, 70, 4.0981F, -1.5F, 0.0F, 1, 3, 2, 0.0F, false));
		bone54.cubeList.add(new ModelBox(bone54, 70, 70, -1.5F, -4.5981F, 0.0F, 3, 1, 2, 0.0F, false));
		bone54.cubeList.add(new ModelBox(bone54, 70, 70, 3.5981F, -1.5F, 0.0F, 1, 3, 2, 0.0F, false));
		bone54.cubeList.add(new ModelBox(bone54, 70, 70, -1.5F, 3.5981F, 0.0F, 3, 1, 2, 0.0F, false));
		bone54.cubeList.add(new ModelBox(bone54, 70, 70, -4.5981F, -1.5F, 0.0F, 1, 3, 2, 0.0F, false));

		ring7 = new ModelRenderer(this);
		ring7.setRotationPoint(0.0F, 0.0F, -18.0F);
		scope.addChild(ring7);

		bone55 = new ModelRenderer(this);
		bone55.setRotationPoint(0.0F, 0.0F, 0.0F);
		ring7.addChild(bone55);
		bone55.cubeList.add(new ModelBox(bone55, 70, 70, -1.5F, 3.5981F, 0.0F, 3, 2, 2, 0.0F, false));
		bone55.cubeList.add(new ModelBox(bone55, 70, 70, -1.5F, -5.5981F, 0.0F, 3, 2, 2, 0.0F, false));
		bone55.cubeList.add(new ModelBox(bone55, 70, 70, 3.5981F, -1.5F, 0.0F, 2, 3, 2, 0.0F, false));
		bone55.cubeList.add(new ModelBox(bone55, 70, 70, -5.5981F, -1.5F, 0.0F, 2, 3, 2, 0.0F, false));

		bone56 = new ModelRenderer(this);
		bone56.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone56, 0.0F, 0.0F, 0.5236F);
		ring7.addChild(bone56);
		bone56.cubeList.add(new ModelBox(bone56, 70, 70, -1.5F, 3.5981F, 0.0F, 3, 2, 2, 0.0F, false));
		bone56.cubeList.add(new ModelBox(bone56, 70, 70, 3.5981F, -1.5F, 0.0F, 2, 3, 2, 0.0F, false));
		bone56.cubeList.add(new ModelBox(bone56, 70, 70, -5.5981F, -1.5F, 0.0F, 2, 3, 2, 0.0F, false));
		bone56.cubeList.add(new ModelBox(bone56, 70, 70, -1.5F, -5.5981F, 0.0F, 3, 2, 2, 0.0F, false));

		bone57 = new ModelRenderer(this);
		bone57.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone57, 0.0F, 0.0F, -0.5236F);
		ring7.addChild(bone57);
		bone57.cubeList.add(new ModelBox(bone57, 70, 70, -1.5F, 3.5981F, 0.0F, 3, 2, 2, 0.0F, false));
		bone57.cubeList.add(new ModelBox(bone57, 70, 70, -1.5F, -5.5981F, 0.0F, 3, 2, 2, 0.0F, false));
		bone57.cubeList.add(new ModelBox(bone57, 70, 70, -5.5981F, -1.5F, 0.0F, 2, 3, 2, 0.0F, false));
		bone57.cubeList.add(new ModelBox(bone57, 70, 70, 3.5981F, -1.5F, 0.0F, 2, 3, 2, 0.0F, false));

		ring8 = new ModelRenderer(this);
		ring8.setRotationPoint(0.0F, 0.0F, 1.0F);
		scope.addChild(ring8);

		bone58 = new ModelRenderer(this);
		bone58.setRotationPoint(0.0F, 0.0F, 0.0F);
		ring8.addChild(bone58);
		bone58.cubeList.add(new ModelBox(bone58, 81, 78, -2.0F, 5.4641F, -22.0F, 4, 1, 3, 0.0F, false));
		bone58.cubeList.add(new ModelBox(bone58, 81, 78, -2.0F, -6.4641F, -22.0F, 4, 1, 3, 0.0F, false));
		bone58.cubeList.add(new ModelBox(bone58, 81, 78, -6.4641F, -2.0F, -22.0F, 1, 4, 3, 0.0F, false));
		bone58.cubeList.add(new ModelBox(bone58, 81, 78, 5.4641F, -2.0F, -22.0F, 1, 4, 3, 0.0F, false));

		bone59 = new ModelRenderer(this);
		bone59.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone59, 0.0F, 0.0F, -0.5236F);
		ring8.addChild(bone59);
		bone59.cubeList.add(new ModelBox(bone59, 81, 78, -2.0F, 5.4641F, -22.0F, 4, 1, 3, 0.0F, false));
		bone59.cubeList.add(new ModelBox(bone59, 81, 78, -2.0F, -6.4641F, -22.0F, 4, 1, 3, 0.0F, false));
		bone59.cubeList.add(new ModelBox(bone59, 81, 78, -6.4641F, -2.0F, -22.0F, 1, 4, 3, 0.0F, false));
		bone59.cubeList.add(new ModelBox(bone59, 81, 78, 5.4641F, -2.0F, -22.0F, 1, 4, 3, 0.0F, false));

		bone60 = new ModelRenderer(this);
		bone60.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone60, 0.0F, 0.0F, -1.0472F);
		ring8.addChild(bone60);
		bone60.cubeList.add(new ModelBox(bone60, 81, 78, -2.0F, -6.4641F, -22.0F, 4, 1, 3, 0.0F, false));
		bone60.cubeList.add(new ModelBox(bone60, 81, 78, -2.0F, 5.4641F, -22.0F, 4, 1, 3, 0.0F, false));
		bone60.cubeList.add(new ModelBox(bone60, 81, 78, 5.4641F, -2.0F, -22.0F, 1, 4, 3, 0.0F, false));
		bone60.cubeList.add(new ModelBox(bone60, 81, 78, -6.4641F, -2.0F, -22.0F, 1, 4, 3, 0.0F, false));

		ring9 = new ModelRenderer(this);
		ring9.setRotationPoint(0.0F, 0.0F, -1.0F);
		scope.addChild(ring9);

		bone61 = new ModelRenderer(this);
		bone61.setRotationPoint(0.0F, 0.0F, 0.0F);
		ring9.addChild(bone61);
		bone61.cubeList.add(new ModelBox(bone61, 81, 78, -2.0F, 5.4641F, -24.0F, 4, 2, 4, 0.0F, false));
		bone61.cubeList.add(new ModelBox(bone61, 81, 78, -2.0F, -7.4641F, -24.0F, 4, 2, 4, 0.0F, false));
		bone61.cubeList.add(new ModelBox(bone61, 81, 78, -7.4641F, -2.0F, -24.0F, 2, 4, 4, 0.0F, false));
		bone61.cubeList.add(new ModelBox(bone61, 81, 78, 5.4641F, -2.0F, -24.0F, 2, 4, 4, 0.0F, false));

		bone62 = new ModelRenderer(this);
		bone62.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone62, 0.0F, 0.0F, -0.5236F);
		ring9.addChild(bone62);
		bone62.cubeList.add(new ModelBox(bone62, 81, 78, -2.0F, 5.4641F, -24.0F, 4, 2, 4, 0.0F, false));
		bone62.cubeList.add(new ModelBox(bone62, 81, 78, -2.0F, -7.4641F, -24.0F, 4, 2, 4, 0.0F, false));
		bone62.cubeList.add(new ModelBox(bone62, 81, 78, -7.4641F, -2.0F, -24.0F, 2, 4, 4, 0.0F, false));
		bone62.cubeList.add(new ModelBox(bone62, 81, 78, 5.4641F, -2.0F, -24.0F, 2, 4, 4, 0.0F, false));

		bone63 = new ModelRenderer(this);
		bone63.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone63, 0.0F, 0.0F, -1.0472F);
		ring9.addChild(bone63);
		bone63.cubeList.add(new ModelBox(bone63, 81, 78, -2.0F, -7.4641F, -24.0F, 4, 2, 4, 0.0F, false));
		bone63.cubeList.add(new ModelBox(bone63, 81, 78, -2.0F, 5.4641F, -24.0F, 4, 2, 4, 0.0F, false));
		bone63.cubeList.add(new ModelBox(bone63, 81, 78, 5.4641F, -2.0F, -24.0F, 2, 4, 4, 0.0F, false));
		bone63.cubeList.add(new ModelBox(bone63, 81, 78, -7.4641F, -2.0F, -24.0F, 2, 4, 4, 0.0F, false));

		detail1 = new ModelRenderer(this);
		detail1.setRotationPoint(0.0F, 0.0F, 0.0F);
		scope.addChild(detail1);
		detail1.cubeList.add(new ModelBox(detail1, 98, 117, 5.2321F, -2.0F, -2.0F, 2, 4, 4, 0.0F, false));
		detail1.cubeList.add(new ModelBox(detail1, 114, 102, 4.7321F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));

		bone32 = new ModelRenderer(this);
		bone32.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone32, -1.4835F, 0.0F, 0.0F);
		detail1.addChild(bone32);
		bone32.cubeList.add(new ModelBox(bone32, 98, 117, 5.2321F, -2.0F, -2.0F, 2, 4, 4, 0.0F, false));

		bone31 = new ModelRenderer(this);
		bone31.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone31, -1.3963F, 0.0F, 0.0F);
		detail1.addChild(bone31);
		bone31.cubeList.add(new ModelBox(bone31, 98, 117, 5.2321F, -2.0F, -2.0F, 2, 4, 4, 0.0F, false));

		bone30 = new ModelRenderer(this);
		bone30.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone30, -1.309F, 0.0F, 0.0F);
		detail1.addChild(bone30);
		bone30.cubeList.add(new ModelBox(bone30, 98, 117, 5.2321F, -2.0F, -2.0F, 2, 4, 4, 0.0F, false));

		bone29 = new ModelRenderer(this);
		bone29.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone29, -1.2217F, 0.0F, 0.0F);
		detail1.addChild(bone29);
		bone29.cubeList.add(new ModelBox(bone29, 98, 117, 5.2321F, -2.0F, -2.0F, 2, 4, 4, 0.0F, false));

		bone28 = new ModelRenderer(this);
		bone28.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone28, -1.1345F, 0.0F, 0.0F);
		detail1.addChild(bone28);
		bone28.cubeList.add(new ModelBox(bone28, 98, 117, 5.2321F, -2.0F, -2.0F, 2, 4, 4, 0.0F, false));

		bone27 = new ModelRenderer(this);
		bone27.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone27, -1.0472F, 0.0F, 0.0F);
		detail1.addChild(bone27);
		bone27.cubeList.add(new ModelBox(bone27, 98, 117, 5.2321F, -2.0F, -2.0F, 2, 4, 4, 0.0F, false));

		bone26 = new ModelRenderer(this);
		bone26.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone26, -0.9599F, 0.0F, 0.0F);
		detail1.addChild(bone26);
		bone26.cubeList.add(new ModelBox(bone26, 98, 117, 5.2321F, -2.0F, -2.0F, 2, 4, 4, 0.0F, false));

		bone25 = new ModelRenderer(this);
		bone25.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone25, -0.8727F, 0.0F, 0.0F);
		detail1.addChild(bone25);
		bone25.cubeList.add(new ModelBox(bone25, 98, 117, 5.2321F, -2.0F, -2.0F, 2, 4, 4, 0.0F, false));

		bone24 = new ModelRenderer(this);
		bone24.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone24, -0.7854F, 0.0F, 0.0F);
		detail1.addChild(bone24);
		bone24.cubeList.add(new ModelBox(bone24, 98, 117, 5.2321F, -2.0F, -2.0F, 2, 4, 4, 0.0F, false));

		bone23 = new ModelRenderer(this);
		bone23.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone23, -0.6981F, 0.0F, 0.0F);
		detail1.addChild(bone23);
		bone23.cubeList.add(new ModelBox(bone23, 98, 117, 5.2321F, -2.0F, -2.0F, 2, 4, 4, 0.0F, false));

		bone21 = new ModelRenderer(this);
		bone21.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone21, -0.5236F, 0.0F, 0.0F);
		detail1.addChild(bone21);
		bone21.cubeList.add(new ModelBox(bone21, 98, 117, 5.2321F, -2.0F, -2.0F, 2, 4, 4, 0.0F, false));

		bone33 = new ModelRenderer(this);
		bone33.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone33, -0.6109F, 0.0F, 0.0F);
		detail1.addChild(bone33);
		bone33.cubeList.add(new ModelBox(bone33, 98, 117, 5.2321F, -2.0F, -2.0F, 2, 4, 4, 0.0F, false));

		bone20 = new ModelRenderer(this);
		bone20.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone20, -0.4363F, 0.0F, 0.0F);
		detail1.addChild(bone20);
		bone20.cubeList.add(new ModelBox(bone20, 98, 117, 5.2321F, -2.0F, -2.0F, 2, 4, 4, 0.0F, false));

		bone19 = new ModelRenderer(this);
		bone19.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone19, -0.3491F, 0.0F, 0.0F);
		detail1.addChild(bone19);
		bone19.cubeList.add(new ModelBox(bone19, 98, 117, 5.2321F, -2.0F, -2.0F, 2, 4, 4, 0.0F, false));

		bone18 = new ModelRenderer(this);
		bone18.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone18, -0.2618F, 0.0F, 0.0F);
		detail1.addChild(bone18);
		bone18.cubeList.add(new ModelBox(bone18, 98, 117, 5.2321F, -2.0F, -2.0F, 2, 4, 4, 0.0F, false));

		bone17 = new ModelRenderer(this);
		bone17.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone17, -0.1745F, 0.0F, 0.0F);
		detail1.addChild(bone17);
		bone17.cubeList.add(new ModelBox(bone17, 98, 117, 5.2321F, -2.0F, -2.0F, 2, 4, 4, 0.0F, false));

		bone16 = new ModelRenderer(this);
		bone16.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone16, -0.0873F, 0.0F, 0.0F);
		detail1.addChild(bone16);
		bone16.cubeList.add(new ModelBox(bone16, 98, 117, 5.2321F, -2.0F, -2.0F, 2, 4, 4, 0.0F, false));

		bone22 = new ModelRenderer(this);
		bone22.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone22, -0.6109F, 0.0F, 0.0F);
		bone16.addChild(bone22);
		bone22.cubeList.add(new ModelBox(bone22, 98, 117, 5.2321F, -2.0F, -2.0F, 2, 4, 4, 0.0F, false));

		detail2 = new ModelRenderer(this);
		detail2.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(detail2, 0.0F, 0.0F, -1.5708F);
		scope.addChild(detail2);
		detail2.cubeList.add(new ModelBox(detail2, 98, 117, 5.2321F, -2.0F, -2.0F, 2, 4, 4, 0.0F, false));
		detail2.cubeList.add(new ModelBox(detail2, 114, 102, 4.7321F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));

		bone34 = new ModelRenderer(this);
		bone34.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone34, -1.4835F, 0.0F, 0.0F);
		detail2.addChild(bone34);
		bone34.cubeList.add(new ModelBox(bone34, 98, 117, 5.2321F, -2.0F, -2.0F, 2, 4, 4, 0.0F, false));

		bone35 = new ModelRenderer(this);
		bone35.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone35, -1.3963F, 0.0F, 0.0F);
		detail2.addChild(bone35);
		bone35.cubeList.add(new ModelBox(bone35, 98, 117, 5.2321F, -2.0F, -2.0F, 2, 4, 4, 0.0F, false));

		bone36 = new ModelRenderer(this);
		bone36.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone36, -1.309F, 0.0F, 0.0F);
		detail2.addChild(bone36);
		bone36.cubeList.add(new ModelBox(bone36, 98, 117, 5.2321F, -2.0F, -2.0F, 2, 4, 4, 0.0F, false));

		bone37 = new ModelRenderer(this);
		bone37.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone37, -1.2217F, 0.0F, 0.0F);
		detail2.addChild(bone37);
		bone37.cubeList.add(new ModelBox(bone37, 98, 117, 5.2321F, -2.0F, -2.0F, 2, 4, 4, 0.0F, false));

		bone38 = new ModelRenderer(this);
		bone38.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone38, -1.1345F, 0.0F, 0.0F);
		detail2.addChild(bone38);
		bone38.cubeList.add(new ModelBox(bone38, 98, 117, 5.2321F, -2.0F, -2.0F, 2, 4, 4, 0.0F, false));

		bone39 = new ModelRenderer(this);
		bone39.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone39, -1.0472F, 0.0F, 0.0F);
		detail2.addChild(bone39);
		bone39.cubeList.add(new ModelBox(bone39, 98, 117, 5.2321F, -2.0F, -2.0F, 2, 4, 4, 0.0F, false));

		bone40 = new ModelRenderer(this);
		bone40.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone40, -0.9599F, 0.0F, 0.0F);
		detail2.addChild(bone40);
		bone40.cubeList.add(new ModelBox(bone40, 98, 117, 5.2321F, -2.0F, -2.0F, 2, 4, 4, 0.0F, false));

		bone41 = new ModelRenderer(this);
		bone41.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone41, -0.8727F, 0.0F, 0.0F);
		detail2.addChild(bone41);
		bone41.cubeList.add(new ModelBox(bone41, 98, 117, 5.2321F, -2.0F, -2.0F, 2, 4, 4, 0.0F, false));

		bone42 = new ModelRenderer(this);
		bone42.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone42, -0.7854F, 0.0F, 0.0F);
		detail2.addChild(bone42);
		bone42.cubeList.add(new ModelBox(bone42, 98, 117, 5.2321F, -2.0F, -2.0F, 2, 4, 4, 0.0F, false));

		bone43 = new ModelRenderer(this);
		bone43.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone43, -0.6981F, 0.0F, 0.0F);
		detail2.addChild(bone43);
		bone43.cubeList.add(new ModelBox(bone43, 98, 117, 5.2321F, -2.0F, -2.0F, 2, 4, 4, 0.0F, false));

		bone44 = new ModelRenderer(this);
		bone44.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone44, -0.5236F, 0.0F, 0.0F);
		detail2.addChild(bone44);
		bone44.cubeList.add(new ModelBox(bone44, 98, 117, 5.2321F, -2.0F, -2.0F, 2, 4, 4, 0.0F, false));

		bone45 = new ModelRenderer(this);
		bone45.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone45, -0.6109F, 0.0F, 0.0F);
		detail2.addChild(bone45);
		bone45.cubeList.add(new ModelBox(bone45, 98, 117, 5.2321F, -2.0F, -2.0F, 2, 4, 4, 0.0F, false));

		bone46 = new ModelRenderer(this);
		bone46.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone46, -0.4363F, 0.0F, 0.0F);
		detail2.addChild(bone46);
		bone46.cubeList.add(new ModelBox(bone46, 98, 117, 5.2321F, -2.0F, -2.0F, 2, 4, 4, 0.0F, false));

		bone47 = new ModelRenderer(this);
		bone47.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone47, -0.3491F, 0.0F, 0.0F);
		detail2.addChild(bone47);
		bone47.cubeList.add(new ModelBox(bone47, 98, 117, 5.2321F, -2.0F, -2.0F, 2, 4, 4, 0.0F, false));

		bone48 = new ModelRenderer(this);
		bone48.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone48, -0.2618F, 0.0F, 0.0F);
		detail2.addChild(bone48);
		bone48.cubeList.add(new ModelBox(bone48, 98, 117, 5.2321F, -2.0F, -2.0F, 2, 4, 4, 0.0F, false));

		bone49 = new ModelRenderer(this);
		bone49.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone49, -0.1745F, 0.0F, 0.0F);
		detail2.addChild(bone49);
		bone49.cubeList.add(new ModelBox(bone49, 98, 117, 5.2321F, -2.0F, -2.0F, 2, 4, 4, 0.0F, false));

		bone50 = new ModelRenderer(this);
		bone50.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone50, -0.0873F, 0.0F, 0.0F);
		detail2.addChild(bone50);
		bone50.cubeList.add(new ModelBox(bone50, 98, 117, 5.2321F, -2.0F, -2.0F, 2, 4, 4, 0.0F, false));

		bone51 = new ModelRenderer(this);
		bone51.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone51, -0.6109F, 0.0F, 0.0F);
		bone50.addChild(bone51);
		bone51.cubeList.add(new ModelBox(bone51, 98, 117, 5.2321F, -2.0F, -2.0F, 2, 4, 4, 0.0F, false));

		cover = new ModelRenderer(this);
		cover.setRotationPoint(0.0F, 0.0F, 0.0F);
		scope.addChild(cover);
		cover.cubeList.add(new ModelBox(cover, 77, 105, 2.0F, -0.7679F, 18.1406F, 2, 4, 1, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 77, 105, 2.0F, -3.2321F, 18.1406F, 2, 3, 1, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 77, 105, -4.0F, -0.7679F, 18.1406F, 2, 4, 1, 0.0F, true));
		cover.cubeList.add(new ModelBox(cover, 77, 105, -4.0F, -3.2321F, 18.1406F, 2, 3, 1, 0.0F, true));
		cover.cubeList.add(new ModelBox(cover, 77, 105, -2.0F, -4.0F, 18.1406F, 4, 8, 1, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 77, 105, -3.0F, -6.0F, -22.3906F, 6, 12, 1, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 77, 105, -5.7813F, -4.8481F, -22.3906F, 3, 4, 1, 0.0F, true));
		cover.cubeList.add(new ModelBox(cover, 77, 105, -5.7813F, -1.1519F, -22.3906F, 3, 6, 1, 0.0F, true));
		cover.cubeList.add(new ModelBox(cover, 77, 105, 2.7813F, -1.1519F, -22.3906F, 3, 6, 1, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 77, 105, 2.7813F, -4.8481F, -22.3906F, 3, 4, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		scope.render(f5);
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}