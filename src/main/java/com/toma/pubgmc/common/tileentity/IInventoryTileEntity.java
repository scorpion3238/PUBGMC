package com.toma.pubgmc.common.tileentity;

import com.toma.pubgmc.Pubgmc;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public interface IInventoryTileEntity extends IInventory {
    NonNullList<ItemStack> getInventory();

    @Override
    default void clear() {
        this.getInventory().clear();
    }

    @Override
    default boolean isEmpty() {
        for (ItemStack stack : this.getInventory()) {
            if (!stack.isEmpty()) {
                return false;
            }
        }

        return true;
    }

    @Override
    default int getSizeInventory() {
        return this.getInventory().size();
    }

    @Override
    default void closeInventory(EntityPlayer player) {
    }

    @Override
    default void openInventory(EntityPlayer player) {
    }

    @Override
    default ItemStack getStackInSlot(int index) {
        return index >= 0 && index < this.getInventory().size() ? this.getInventory().get(index) : ItemStack.EMPTY;
    }

    @Override
    default ItemStack decrStackSize(int index, int count) {
        ItemStack stack = ItemStackHelper.getAndSplit(this.getInventory(), index, count);
        if (!stack.isEmpty()) {
            this.markDirty();
        }
        Pubgmc.proxy.notifyWorkbenchUpdate();
        return stack;
    }

    @Override
    default ItemStack removeStackFromSlot(int index) {
        ItemStack stack = this.getInventory().get(index);
        if (stack.isEmpty()) {
            Pubgmc.proxy.notifyWorkbenchUpdate();
            return ItemStack.EMPTY;
        } else {
            this.getInventory().set(index, ItemStack.EMPTY);
            Pubgmc.proxy.notifyWorkbenchUpdate();
            return stack;
        }
    }

    @Override
    default void setInventorySlotContents(int index, ItemStack stack) {
        this.getInventory().set(index, stack);
        if (!stack.isEmpty() && stack.getCount() > this.getInventoryStackLimit()) {
            stack.setCount(this.getInventoryStackLimit());
        }
        this.markDirty();
        Pubgmc.proxy.notifyWorkbenchUpdate();
    }

    @Override
    default int getInventoryStackLimit() {
        return 64;
    }

    @Override
    default boolean isUsableByPlayer(EntityPlayer player) {
        return true;
    }

    @Override
    default boolean isItemValidForSlot(int index, ItemStack stack) {
        return true;
    }

    @Override
    default int getField(int id) {
        return 0;
    }

    @Override
    default void setField(int id, int value) {
    }

    @Override
    default int getFieldCount() {
        return 0;
    }

    @Override
    default boolean hasCustomName() {
        return false;
    }
}
