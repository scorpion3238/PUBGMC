package com.toma.pubgmc.network.sp;

import com.toma.pubgmc.Pubgmc;
import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class PacketDelayedSound implements IMessage {
    private SoundEvent event;
    private float volume;
    private double x, y, z;

    public PacketDelayedSound() {
    }

    public PacketDelayedSound(SoundEvent sound, float volume, double x, double y, double z) {
        this.event = sound;
        this.volume = volume;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeInt(SoundEvent.REGISTRY.getIDForObject(this.event));
        buf.writeFloat(this.volume);
        buf.writeDouble(this.x);
        buf.writeDouble(this.y);
        buf.writeDouble(this.z);
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        event = SoundEvent.REGISTRY.getObjectById(buf.readInt());
        volume = buf.readFloat();
        x = buf.readDouble();
        y = buf.readDouble();
        z = buf.readDouble();
    }

    public static class Handler implements IMessageHandler<PacketDelayedSound, IMessage> {
        @Override
        public IMessage onMessage(PacketDelayedSound message, MessageContext ctx) {
            if (ctx.side.isClient()) {
                EntityPlayerSP player = Minecraft.getMinecraft().player;
                Minecraft.getMinecraft().addScheduledTask(() -> Pubgmc.proxy.playDelayedSound(message.event, message.x, message.y, message.z, message.volume));
            }
            return null;
        }
    }
}
