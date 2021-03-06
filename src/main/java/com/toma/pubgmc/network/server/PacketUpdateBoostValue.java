package com.toma.pubgmc.network.server;

import com.toma.pubgmc.common.capability.IPlayerData;
import com.toma.pubgmc.common.capability.IPlayerData.PlayerDataProvider;
import io.netty.buffer.ByteBuf;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class PacketUpdateBoostValue implements IMessage {
    private float boost;

    public PacketUpdateBoostValue() {
    }

    public PacketUpdateBoostValue(float boost) {
        this.boost = boost;
    }

    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeFloat(boost);
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        boost = buf.readFloat();
    }

    public static class Handler implements IMessageHandler<PacketUpdateBoostValue, IMessage> {
        @Override
        public IMessage onMessage(PacketUpdateBoostValue message, MessageContext ctx) {
            ctx.getServerHandler().player.getServer().addScheduledTask(() ->
            {
                IPlayerData data = ctx.getServerHandler().player.getCapability(PlayerDataProvider.PLAYER_DATA, null);
                data.setBoost(message.boost);
            });
            return null;
        }
    }
}
