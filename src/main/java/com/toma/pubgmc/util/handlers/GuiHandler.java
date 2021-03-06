package com.toma.pubgmc.util.handlers;

import com.toma.pubgmc.client.gui.*;
import com.toma.pubgmc.common.capability.IWorldData;
import com.toma.pubgmc.common.container.*;
import com.toma.pubgmc.common.items.guns.attachments.ContainerAttachments;
import com.toma.pubgmc.common.items.guns.attachments.GuiAttachments;
import com.toma.pubgmc.common.tileentity.TileEntityAirdrop;
import com.toma.pubgmc.network.PacketHandler;
import com.toma.pubgmc.network.sp.PacketSyncTileEntity;
import com.toma.pubgmc.common.tileentity.*;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {
    public static final int GUI_AIRDROP = 0;
    private static int guiID = 0;
    public static final int PLAYER_INV = getNextGuiID();
    public static final int LOOT_SPAWNER = getNextGuiID();
    public static final int GUI_CRATE = getNextGuiID();
    public static final int GUI_ATTACHMENTS = getNextGuiID();
    public static final int GUI_GUNCRAFTINGTABLE = getNextGuiID();
    public static final int GUI_BIG_AIRDROP = getNextGuiID();
    public static final int GUI_LOOT_SETUP = getNextGuiID();

    private static int getNextGuiID() {
        return guiID += 1;
    }

    public static void update(World world, EntityPlayer player, int x, int y, int z) {
        if (player instanceof EntityPlayerMP) {
            BlockPos p = new BlockPos(x, y, z);
            PacketHandler.sendToClient(new PacketSyncTileEntity(world.getTileEntity(p).serializeNBT(), p), (EntityPlayerMP) player);
        }
    }

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if (ID == GUI_AIRDROP)
            return new ContainerAirdrop(player.inventory, (TileEntityAirdrop) world.getTileEntity(new BlockPos(x, y, z)));

        if (ID == LOOT_SPAWNER)
            return new ContainerLootSpawner(player.inventory, (TileEntityLootGenerator) world.getTileEntity(new BlockPos(x, y, z)));

        if (ID == GUI_CRATE)
            return new ContainerPlayerCrate(player.inventory, (TileEntityPlayerCrate) world.getTileEntity(new BlockPos(x, y, z)));

        if (ID == GUI_ATTACHMENTS) return new ContainerAttachments(player.inventory, player);

        if (ID == GUI_GUNCRAFTINGTABLE) {
            ContainerGunWorkbench c = new ContainerGunWorkbench((TileEntityGunWorkbench) world.getTileEntity(new BlockPos(x, y, z)), player.inventory);
            update(world, player, x, y, z);
            return c;
        }

        if (ID == GUI_BIG_AIRDROP)
            return new ContainerBigAirdrop(player.inventory, (TileEntityAirdrop) world.getTileEntity(new BlockPos(x, y, z)));

        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if (ID == GUI_AIRDROP)
            return new GuiAirdrop(player.inventory, (TileEntityAirdrop) world.getTileEntity(new BlockPos(x, y, z)));

        if (ID == LOOT_SPAWNER)
            return new GuiLootSpawner(player.inventory, (TileEntityLootGenerator) world.getTileEntity(new BlockPos(x, y, z)));

        if (ID == GUI_CRATE)
            return new GuiPlayerCrate(player.inventory, (TileEntityPlayerCrate) world.getTileEntity(new BlockPos(x, y, z)));

        if (ID == GUI_ATTACHMENTS) return new GuiAttachments(player.inventory, player);

        if (ID == GUI_GUNCRAFTINGTABLE)
            return new GuiGunWorkbench((TileEntityGunWorkbench) world.getTileEntity(new BlockPos(x, y, z)), player.inventory);

        if (ID == GUI_BIG_AIRDROP)
            return new GuiBigAirdrop(player.inventory, (TileEntityAirdrop) world.getTileEntity(new BlockPos(x, y, z)));

        if (ID == GUI_LOOT_SETUP) {
            return new GuiLootSetup(world.getCapability(IWorldData.WorldDataProvider.WORLD_DATA, null));
        }
        return null;
    }
}
