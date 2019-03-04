package com.toma.pubgmc.common.items.heal;

import com.toma.pubgmc.common.capability.IPlayerData;
import com.toma.pubgmc.common.capability.IPlayerData.PlayerDataProvider;
import com.toma.pubgmc.common.items.PMCItem;
import com.toma.pubgmc.common.tileentity.TileEntityGunWorkbench;
import com.toma.pubgmc.common.tileentity.TileEntityGunWorkbench.CraftMode;
import com.toma.pubgmc.util.ICraftable;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public abstract class ItemHealing extends PMCItem implements ICraftable
{
	public float health;
	public float boost;
	
	public ItemHealing(String name)
	{
		super(name);
		TileEntityGunWorkbench.HEALING.add(this);
		setMaxStackSize(1);
	}
	
	public abstract Action getAction();
	
	public abstract int getUseTime();
	
	public abstract EnumAction getUseAction();
	
	@Override
	public int getMaxItemUseDuration(ItemStack stack)
	{
		return getUseTime();
	}
	
	@Override
	public EnumAction getItemUseAction(ItemStack stack)
	{
		return getUseAction();
	}
	
	@Override
	public CraftMode getCraftMode()
	{
		return CraftMode.Healing;
	}
	
	@Override
	public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving)
	{
		if(entityLiving instanceof EntityPlayer)
		{
			EntityPlayer player = (EntityPlayer)entityLiving;
			IPlayerData data = player.getCapability(PlayerDataProvider.PLAYER_DATA, null);
			
			if(getAction() == Action.HEAL && canPlayerHeal(player))
			{
				float health = getHealAmount(player);
				health = player.getHealth() + health > 20 ? 20 - player.getHealth() : health;
				player.heal(health);
			}
			
			else if(getAction() == Action.BOOST)
			{
				data.addBoost(getBoostAmount());
			}
			
			if(!player.capabilities.isCreativeMode)
				stack.shrink(1);
		}
		return stack;
	}
	
	@Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
    {
        playerIn.setActiveHand(handIn);
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }
	
	public float getHealAmount(EntityPlayer player)
	{
		return health;
	}
	
	public float getBoostAmount()
	{
		return boost;
	}
	
	public boolean canPlayerHeal(EntityPlayer player)
	{
		return true;
	}
	
	public enum Action
	{	
		HEAL,
		BOOST;
	}
}
