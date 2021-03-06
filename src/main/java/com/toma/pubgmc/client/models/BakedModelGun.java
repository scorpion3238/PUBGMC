package com.toma.pubgmc.client.models;

import com.toma.pubgmc.animation.Animation;
import com.toma.pubgmc.client.util.ModelHelper;
import com.toma.pubgmc.common.capability.IPlayerData;
import com.toma.pubgmc.common.capability.IPlayerData.PlayerDataProvider;
import com.toma.pubgmc.common.items.guns.GunBase;
import com.toma.pubgmc.init.PMCRegistry.PMCItems;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.block.model.BakedQuad;
import net.minecraft.client.renderer.block.model.IBakedModel;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms.TransformType;
import net.minecraft.client.renderer.block.model.ItemOverrideList;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.model.TRSRTransformation;
import org.apache.commons.lang3.tuple.Pair;

import javax.vecmath.Matrix4f;
import javax.vecmath.Quat4f;
import javax.vecmath.Vector3f;
import java.util.Collections;
import java.util.List;

public class BakedModelGun implements IBakedModel {
    @Override
    public boolean isBuiltInRenderer() {
        return true;
    }

    @Override
    public ItemOverrideList getOverrides() {
        return ItemOverrideList.NONE;
    }

    @Override
    public TextureAtlasSprite getParticleTexture() {
        return Minecraft.getMinecraft().getTextureMapBlocks().getMissingSprite();
    }

    @Override
    public List<BakedQuad> getQuads(IBlockState state, EnumFacing side, long rand) {
        return Collections.EMPTY_LIST;
    }

    @Override
    public boolean isAmbientOcclusion() {
        return false;
    }

    @Override
    public boolean isGui3d() {
        return false;
    }

    @Override
    public Pair<? extends IBakedModel, Matrix4f> handlePerspective(TransformType cameraTransformType) {
        Matrix4f matrix = new Matrix4f();
        matrix.setIdentity();
        TRSRTransformation trsrt = new TRSRTransformation(matrix);
        Vector3f transl = new Vector3f(0f, 0f, 0f);
        Vector3f scale = new Vector3f(1f, 1f, 1f);
        Quat4f leftRot = new Quat4f(0f, 1f, 0f, 0f);
        Quat4f rightRot = new Quat4f(0f, 1f, 0f, 0f);

        EntityPlayer player = Minecraft.getMinecraft().player;
        IPlayerData data = null;
        ItemStack held;

        if (player != null && player.hasCapability(PlayerDataProvider.PLAYER_DATA, null)) {
            data = data == null ? player.getCapability(PlayerDataProvider.PLAYER_DATA, null) : data;
            if (player.getHeldItemMainhand().getItem() instanceof GunBase) {
                held = player.getHeldItemMainhand();
                if (((GunBase) held.getItem()).getWeaponModel().aimAnimation.getFinalState().equals(Animation.EMPTYVEC) && held.getItem() != PMCItems.VSS) {
                    ((GunBase) held.getItem()).getWeaponModel().initAnimations();
                }
            }
        } else {
            return Pair.of(this, trsrt.getMatrix());
        }

        switch (cameraTransformType) {
            case GUI: {
                GlStateManager.translate(0, -0.15, 0);
                GlStateManager.scale(0.5f, 0.5f, 0.5f);
                GlStateManager.rotate(90f, 0f, 1f, 0f);
                GlStateManager.rotate(30f, 1f, 0f, 0f);
                break;
            }

            // Implement animations here
            case FIRST_PERSON_RIGHT_HAND: {
                held = player.getHeldItemMainhand();
                if (held.getItem() instanceof GunBase) {
                    ModelGun gun = ((GunBase) held.getItem()).getWeaponModel();
                    gun.preRender(held);
                    this.process(held, data);
                    if (data.isAiming() && !gun.enableADS(held)) {
                        GlStateManager.scale(0, 0, 0);
                    }
                } else break;
                trsrt = new TRSRTransformation(transl, leftRot, scale, rightRot);
                break;
            }

            // Third person animations, sometime later propably
            case THIRD_PERSON_RIGHT_HAND: case GROUND: {
                trsrt = new TRSRTransformation(transl, leftRot, new Vector3f(0.65F, 0.65F, 0.65F), rightRot);
                break;
            }

            case FIXED: {
                GlStateManager.translate(-0.09, 0, 0);
                GlStateManager.scale(0.5, 0.5, 0.5);
                GlStateManager.rotate(-90f, 0f, 1f, 0f);
                GlStateManager.rotate(30f, 1f, 0f, 0f);
                break;
            }

            default:
                break;
        }

        return Pair.of(this, trsrt.getMatrix());
    }

    private Quat4f debugQuat0(float x, float y, float z) {
        return new Quat4f(x, y, z, 0f);
    }

    private Quat4f debugQuat1() {
        return new Quat4f(ModelHelper.x, ModelHelper.y, ModelHelper.z, 0f);
    }

    private void process(ItemStack held, IPlayerData data) {
        ModelGun gun = ((GunBase) held.getItem()).getWeaponModel();
        gun.processAnimations(data.isAiming(), data.isReloading());
    }
}
