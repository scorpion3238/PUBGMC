package com.toma.pubgmc.client.models;

import java.util.Collections;
import java.util.List;

import javax.vecmath.Matrix4f;
import javax.vecmath.Quat4f;
import javax.vecmath.Vector3f;

import org.apache.commons.lang3.tuple.Pair;

import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.BakedQuad;
import net.minecraft.client.renderer.block.model.IBakedModel;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms.TransformType;
import net.minecraft.client.renderer.block.model.ItemOverrideList;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.model.TRSRTransformation;

public class BakedModelGun implements IBakedModel
{	
	@Override
	public boolean isBuiltInRenderer()
	{
		return true;
	}
	
	@Override
	public ItemOverrideList getOverrides()
	{
		return ItemOverrideList.NONE;
	}
	
	@Override
	public TextureAtlasSprite getParticleTexture()
	{
		TextureMap map = Minecraft.getMinecraft().getTextureMapBlocks();
		return map.getMissingSprite();
	}
	
	@Override
	public List<BakedQuad> getQuads(IBlockState state, EnumFacing side, long rand)
	{
		return Collections.EMPTY_LIST;
	}
	
	@Override
	public boolean isAmbientOcclusion() 
	{
		return false;
	}
	
	@Override
	public boolean isGui3d()
	{
		return false;
	}
	
	@Override
	public Pair<? extends IBakedModel, Matrix4f> handlePerspective(TransformType cameraTransformType)
	{
		Matrix4f matrix = new Matrix4f();
		matrix.setIdentity();
		TRSRTransformation trsrt = new TRSRTransformation(matrix);
		
		if(cameraTransformType == TransformType.GUI)
		{
			trsrt = new TRSRTransformation(new Vector3f(0f, -0.1f, 0f), new Quat4f(0f, 1f, 0f, 0f), new Vector3f(0.5f, 0.5f, 0.5f), new Quat4f(0.8f, -1f, 0f, 1f));
		}
		
		return Pair.of(this, trsrt.getMatrix());
	}
}
