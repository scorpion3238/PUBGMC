package com.toma.pubgmc.client.models.weapons;

import com.toma.pubgmc.client.models.ModelGun;
import com.toma.pubgmc.common.capability.IPlayerData.PlayerDataProvider;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.item.ItemStack;

public class ModelSKS extends ModelGun
{
	private final ModelRenderer base;
	private final ModelRenderer mag;
	private final ModelRenderer magsh;
	private final ModelRenderer base1;
	private final ModelRenderer trigger;
	private final ModelRenderer handle;
	private final ModelRenderer stock;
	private final ModelRenderer rail;
	private final ModelRenderer ironsight;

	public ModelSKS()
	{
		textureWidth = 128;
		textureHeight = 128;

		base = new ModelRenderer(this);
		base.setRotationPoint(0.0F, 24.0F, 0.0F);
		base.cubeList.add(new ModelBox(base, 0, 0, -3.0F, -22.0F, -37.0F, 6, 5, 45, 0.0F, false));
		base.cubeList.add(new ModelBox(base, 64, 80, -1.0F, -20.0F, -56.0F, 2, 2, 19, 0.0F, false));
		base.cubeList.add(new ModelBox(base, 64, 80, -1.0F, -21.0F, -45.0F, 2, 1, 8, 0.0F, false));
		base.cubeList.add(new ModelBox(base, 64, 80, -1.5F, -20.5F, -63.0F, 3, 3, 7, 0.0F, false));
		base.cubeList.add(new ModelBox(base, 0, 0, -3.0F, -23.0F, -36.0F, 6, 1, 6, 0.0F, false));
		base.cubeList.add(new ModelBox(base, 64, 79, -3.0F, -23.0F, -30.0F, 6, 1, 26, 0.0F, false));
		base.cubeList.add(new ModelBox(base, 64, 79, -3.0F, -23.0F, -4.0F, 6, 1, 10, 0.0F, false));
		base.cubeList.add(new ModelBox(base, 64, 80, -2.0F, -15.0F, -5.04F, 4, 2, 1, 0.0F, false));
		base.cubeList.add(new ModelBox(base, 64, 80, -2.0F, -13.0F, -4.04F, 4, 1, 1, 0.0F, false));
		base.cubeList.add(new ModelBox(base, 64, 80, -2.0F, -12.0F, -3.04F, 4, 1, 4, 0.0F, false));
		base.cubeList.add(new ModelBox(base, 0, 64, -2.0F, -21.0F, 8.0F, 4, 5, 2, 0.0F, false));
		base.cubeList.add(new ModelBox(base, 0, 0, -3.0F, -17.0F, -28.0F, 6, 2, 36, 0.0F, false));
		base.cubeList.add(new ModelBox(base, 0, 0, -3.0F, -17.1F, -33.0F, 6, 1, 5, 0.0F, false));
		base.cubeList.add(new ModelBox(base, 64, 80, -2.0F, -15.0F, 0.96F, 4, 3, 1, 0.0F, false));
		base.cubeList.add(new ModelBox(base, 0, 0, -2.0F, -21.0F, 10.0F, 4, 5, 28, 0.0F, false));
		base.cubeList.add(new ModelBox(base, 0, 0, -2.0F, -16.0F, 35.0F, 4, 12, 3, 0.0F, false));
		base.cubeList.add(new ModelBox(base, 0, 0, -2.0F, -17.0F, 22.0F, 4, 4, 13, 0.0F, false));
		base.cubeList.add(new ModelBox(base, 0, 0, -2.0F, -13.0F, 28.0F, 4, 4, 7, 0.0F, false));

		mag = new ModelRenderer(this);
		mag.setRotationPoint(0.0F, 24.0F, 0.0F);
		mag.cubeList.add(new ModelBox(mag, 0, 64, -2.0F, -15.0F, -17.04F, 4, 7, 8, 0.0F, false));

		magsh = new ModelRenderer(this);
		magsh.setRotationPoint(0.0F, 24.0F, 0.0F);
		setRotationAngle(magsh, -0.1745F, 0.0F, 0.0F);
		magsh.cubeList.add(new ModelBox(magsh, 0, 64, -2.0F, -6.5581F, -18.3088F, 4, 7, 8, 0.0F, false));

		base1 = new ModelRenderer(this);
		base1.setRotationPoint(0.0F, 24.0F, 0.0F);
		setRotationAngle(base1, -0.1745F, 0.0F, 0.0F);
		base1.cubeList.add(new ModelBox(base1, 0, 0, -3.0F, -11.1F, -39.35F, 6, 1, 10, 0.0F, false));

		trigger = new ModelRenderer(this);
		trigger.setRotationPoint(0.0F, 24.0F, 0.0F);
		setRotationAngle(trigger, -0.1745F, 0.0F, 0.0F);
		trigger.cubeList.add(new ModelBox(trigger, 64, 80, -1.0F, -15.0F, -4.04F, 2, 2, 1, 0.0F, false));

		handle = new ModelRenderer(this);
		handle.setRotationPoint(0.0F, 24.0F, 0.0F);
		setRotationAngle(handle, 0.1745F, 0.0F, 0.0F);
		handle.cubeList.add(new ModelBox(handle, 0, 0, -2.0F, -15.0F, 5.0F, 4, 10, 5, 0.0F, false));

		stock = new ModelRenderer(this);
		stock.setRotationPoint(0.0F, 24.0F, 0.0F);
		setRotationAngle(stock, -0.4363F, 0.0F, 0.0F);
		stock.cubeList.add(new ModelBox(stock, 0, 0, -2.0F, -24.0F, 2.0F, 4, 5, 28, 0.0F, false));

		rail = new ModelRenderer(this);
		rail.setRotationPoint(0.0F, 24.0F, 0.0F);
		rail.cubeList.add(new ModelBox(rail, 64, 80, -2.5F, -23.4F, 4.0F, 5, 1, 1, 0.0F, false));
		rail.cubeList.add(new ModelBox(rail, 64, 80, -2.5F, -23.4F, 2.0F, 5, 1, 1, 0.0F, false));
		rail.cubeList.add(new ModelBox(rail, 64, 80, -2.5F, -23.4F, 0.0F, 5, 1, 1, 0.0F, false));
		rail.cubeList.add(new ModelBox(rail, 64, 80, -2.5F, -23.4F, -2.0F, 5, 1, 1, 0.0F, false));
		rail.cubeList.add(new ModelBox(rail, 64, 80, -2.5F, -23.4F, -4.0F, 5, 1, 1, 0.0F, false));
		rail.cubeList.add(new ModelBox(rail, 64, 80, -2.5F, -23.4F, -6.0F, 5, 1, 1, 0.0F, false));
		rail.cubeList.add(new ModelBox(rail, 64, 80, -2.5F, -23.4F, -8.0F, 5, 1, 1, 0.0F, false));
		rail.cubeList.add(new ModelBox(rail, 64, 80, -2.5F, -23.4F, -10.0F, 5, 1, 1, 0.0F, false));
		rail.cubeList.add(new ModelBox(rail, 64, 80, -2.5F, -23.4F, -12.0F, 5, 1, 1, 0.0F, false));
		rail.cubeList.add(new ModelBox(rail, 64, 80, -2.5F, -23.4F, -14.0F, 5, 1, 1, 0.0F, false));
		rail.cubeList.add(new ModelBox(rail, 64, 80, -2.5F, -23.4F, -16.0F, 5, 1, 1, 0.0F, false));
		rail.cubeList.add(new ModelBox(rail, 64, 80, -2.5F, -23.4F, -18.0F, 5, 1, 1, 0.0F, false));
		rail.cubeList.add(new ModelBox(rail, 64, 80, -2.5F, -23.4F, -20.0F, 5, 1, 1, 0.0F, false));
		rail.cubeList.add(new ModelBox(rail, 64, 80, -2.5F, -23.4F, -22.0F, 5, 1, 1, 0.0F, false));
		rail.cubeList.add(new ModelBox(rail, 64, 80, -2.5F, -23.4F, -24.0F, 5, 1, 1, 0.0F, false));
		rail.cubeList.add(new ModelBox(rail, 64, 80, -2.5F, -23.4F, -26.0F, 5, 1, 1, 0.0F, false));
		rail.cubeList.add(new ModelBox(rail, 64, 80, -2.5F, -23.4F, -28.0F, 5, 1, 1, 0.0F, false));
		rail.cubeList.add(new ModelBox(rail, 64, 79, -2.5F, -15.7F, -27.9F, 5, 1, 11, 0.0F, false));
		rail.cubeList.add(new ModelBox(rail, 64, 79, -2.5F, -15.2F, -27.9F, 5, 1, 1, 0.0F, false));
		rail.cubeList.add(new ModelBox(rail, 64, 79, -2.5F, -15.2F, -25.9F, 5, 1, 1, 0.0F, false));
		rail.cubeList.add(new ModelBox(rail, 64, 79, -2.5F, -15.2F, -23.9F, 5, 1, 1, 0.0F, false));
		rail.cubeList.add(new ModelBox(rail, 64, 79, -2.5F, -15.2F, -21.9F, 5, 1, 1, 0.0F, false));
		rail.cubeList.add(new ModelBox(rail, 64, 79, -2.5F, -15.2F, -19.9F, 5, 1, 1, 0.0F, false));
		rail.cubeList.add(new ModelBox(rail, 64, 79, -2.5F, -15.2F, -17.9F, 5, 1, 1, 0.0F, false));

		ironsight = new ModelRenderer(this);
		ironsight.setRotationPoint(0.0F, 24.0F, 0.0F);
		ironsight.cubeList.add(new ModelBox(ironsight, 64, 83, -0.5F, -24.5F, -52.0F, 1, 5, 1, 0.0F, false));
		ironsight.cubeList.add(new ModelBox(ironsight, 64, 83, -0.5F, -23.0F, -51.0F, 1, 3, 1, 0.0F, false));
		ironsight.cubeList.add(new ModelBox(ironsight, 64, 83, -1.5F, -24.0F, 0.0F, 3, 1, 4, 0.0F, false));
		ironsight.cubeList.add(new ModelBox(ironsight, 64, 83, -1.5F, -25.0F, 1.0F, 1, 1, 2, 0.0F, false));
		ironsight.cubeList.add(new ModelBox(ironsight, 64, 83, 0.5F, -25.0F, 1.0F, 1, 1, 2, 0.0F, false));
		ironsight.cubeList.add(new ModelBox(ironsight, 64, 83, -0.5F, -26.0F, 1.0F, 1, 1, 2, 0.0F, false));
	}
	
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) 
	{
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
	
	@Override
	public void render(ItemStack stack)
	{
		EntityPlayerSP player = Minecraft.getMinecraft().player;
		
		if(player != null && player.hasCapability(PlayerDataProvider.PLAYER_DATA, null))
		{
			boolean aim = player.getCapability(PlayerDataProvider.PLAYER_DATA, null).isAiming();
			renderSKS(aim, stack);
		}
	}
	
	private void renderSKS(boolean aim, ItemStack stack)
	{
		GlStateManager.pushMatrix();
		transform.defaultSRTransform();
		GlStateManager.translate(0.0, 1.0, 3.0);
		
		if(aim && enableADS(stack))
		{
			GlStateManager.rotate(0.2f, 0, 1f, 0);
			GlStateManager.rotate(0.5f, 1f, 0, 0);
			GlStateManager.translate(26.6, -12.5, 13.0);
			
			if(hasRedDot(stack))
				GlStateManager.translate(0.0, 3.3, 0.0);
			else if(hasHoloSight(stack))
				GlStateManager.translate(0.0, 5.5, 0.0);
		}
		
		renderParts(hasScopeAtachment(stack));
		GlStateManager.popMatrix();
		
		if(hasSilencer(stack))
			renderSilencer(aim, stack);
		if(hasVerticalGrip(stack))
			renderVerticalGrip(aim, stack);
		else if(hasAngledGrip(stack))
			renderAngledGrip(aim, stack);
		if(hasRedDot(stack))
			renderRedDot(aim, stack);
		else if(hasHoloSight(stack))
			renderHolo(aim, stack);
		else if(has2X(stack))
			render2x(stack);
		else if(has4X(stack))
			render4x(stack);
		else if(has8X(stack))
			render8x(stack);
		else if(has15X(stack))
			render15x(stack);
	}
	
	private void renderRedDot(boolean aim, ItemStack stack)
	{
		if(aim)
		{
			renderRedDot(28.25, -16.9, 20, 1.3f, stack);
		}
		else renderRedDot(-0.4, -7, 5, 1.3f, stack);
	}
	
	private void renderHolo(boolean aim, ItemStack stack)
	{
		if(aim)
		{
			renderHolo(22.4, -13.8, 11, 1.3f, stack);
		}
		else renderHolo(-1.6, -7.6, 0, 1.3f, stack);
	}
	
	private void render2x(ItemStack stack)
	{
		renderScope2X(7.9, 10, -4, 1f, stack);
	}
	
	private void render4x(ItemStack stack)
	{
		renderScope4X(7.9, 10, -4, 1f, stack);
	}
	
	private void render8x(ItemStack stack)
	{
		renderScope8X(-0.1, 0, 1, 1f, stack);
	}
	
	private void render15x(ItemStack stack)
	{
		renderScope15X(0, 0, 5, 1f, stack);
	}
	
	private void renderSilencer(boolean aim, ItemStack stack)
	{
		if(aim && enableADS(stack))
		{
			if(hasRedDot(stack))
			{
				renderSniperSilencer(-16, 5.4, 7, 1f, stack);
			}
			
			else if(hasHoloSight(stack))
			{
				renderSniperSilencer(-16, 3.5, 7, 1f, stack);
			}
			
			else renderSniperSilencer(-16, 7.5, 7, 1f, stack);
		}
		
		else renderSniperSilencer(-0.2, 0, 0, 1f, stack);
	}
	
	private void renderVerticalGrip(boolean aim, ItemStack stack)
	{
		if(aim && enableADS(stack))
		{
			if(hasRedDot(stack))
			{
				renderVerticalGrip(26.2, -4, 21, 1f, stack);
			}
			
			else if(hasHoloSight(stack))
			{
				renderVerticalGrip(26.2, -2, 21, 1f, stack);
			}
			
			else renderVerticalGrip(26.2, -7, 21, 1f, stack);
		}
		
		else renderVerticalGrip(-1, 6, 7, 1f, stack);
	}
	
	private void renderAngledGrip(boolean aim, ItemStack stack)
	{
		if(aim && enableADS(stack))
		{
			if(hasRedDot(stack))
			{
				renderAngledGrip(-21.1, 0.3, -17, 0.85f, stack);
			}
			
			else if(hasHoloSight(stack))
			{
				renderAngledGrip(-21.1, 2, -17, 0.85f, stack);
			}
			
			else renderAngledGrip(-21.1, -3, -17, 0.85f, stack);
		}
		
		else renderAngledGrip(1, 7.7, -7, 0.85f, stack);
	}
	
	private void renderParts(boolean hasScope)
	{
		base.render(1f);
		mag.render(1f);
		magsh.render(1f);
		base1.render(1f);
		trigger.render(1f);
		handle.render(1f);
		stock.render(1f);
		rail.render(1f);
		if(!hasScope) ironsight.render(1f);
	}
}