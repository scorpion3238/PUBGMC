//Made with Blockbench
//Paste this code into your mod.

import org.lwjgl.opengl.GL11;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class 2x extends ModelBase {
	private final ModelRenderer bone;
	private final ModelRenderer bone2;
	private final ModelRenderer bone3;
	private final ModelRenderer bone4;
	private final ModelRenderer bone5;
	private final ModelRenderer bone6;
	private final ModelRenderer bone7;
	private final ModelRenderer bone8;
	private final ModelRenderer bone9;
	private final ModelRenderer bone10;
	private final ModelRenderer bone11;
	private final ModelRenderer bone21;
	private final ModelRenderer bone22;
	private final ModelRenderer bone23;
	private final ModelRenderer bone24;
	private final ModelRenderer bone25;
	private final ModelRenderer bone26;
	private final ModelRenderer bone18;
	private final ModelRenderer bone27;
	private final ModelRenderer bone12;
	private final ModelRenderer bone13;
	private final ModelRenderer bone14;
	private final ModelRenderer bone15;
	private final ModelRenderer bone16;
	private final ModelRenderer bone17;
	private final ModelRenderer bone19;
	private final ModelRenderer bone20;
	private final ModelRenderer bone28;
	private final ModelRenderer bone29;

	public 2x() {
		textureWidth = 128;
		textureHeight = 128;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(bone2);
		bone2.cubeList.add(new ModelBox(bone2, 77, 69, -1.0F, -1.0F, -9.0F, 2, 1, 13, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 72, 72, -1.0F, -0.5F, -8.5F, 2, 2, 12, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 72, 72, -1.6F, 0.0F, -8.5F, 1, 2, 12, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 72, 72, 0.6F, 0.0F, -8.5F, 1, 2, 12, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 72, 113, -2.0F, -1.5781F, -8.5F, 4, 1, 2, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 72, 113, -3.0F, -2.5781F, -8.5F, 3, 1, 2, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 72, 113, 0.0F, -2.5781F, -8.5F, 3, 1, 2, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 72, 113, -4.0F, -5.5781F, -8.5F, 4, 3, 2, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 72, 113, 0.0F, -5.5781F, -8.5F, 4, 3, 2, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 72, 113, 0.5F, -6.5781F, -8.5F, 3, 1, 2, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 72, 113, -3.5F, -6.5781F, -8.5F, 4, 1, 2, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 72, 113, -1.0F, -7.5781F, -8.5F, 4, 1, 2, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 72, 113, -2.0F, -8.2813F, -8.5F, 4, 1, 2, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 72, 113, -3.0F, -7.5781F, -8.5F, 2, 1, 2, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 98, 118, -2.0F, -1.5781F, -0.8125F, 4, 1, 2, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 98, 118, -3.0F, -2.5781F, -0.8125F, 3, 1, 2, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 98, 118, 0.0F, -2.5781F, -0.8125F, 3, 1, 2, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 98, 118, 0.0F, -5.5781F, -0.8125F, 4, 3, 2, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 98, 118, -4.0F, -5.5781F, -0.8125F, 4, 3, 2, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 98, 118, -3.5F, -6.5781F, -0.8125F, 4, 1, 2, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 98, 118, 0.5F, -6.5781F, -0.8125F, 3, 1, 2, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 98, 118, -1.0F, -7.5781F, -0.8125F, 4, 1, 2, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 98, 118, -2.0F, -8.2813F, -0.8125F, 4, 1, 2, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 98, 118, -3.0F, -7.5781F, -0.8125F, 2, 1, 2, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, -4.5F, 0.0F);
		setRotationAngle(bone3, 0.0F, 0.0F, -0.3491F);
		bone.addChild(bone3);
		bone3.cubeList.add(new ModelBox(bone3, 83, 73, -1.0F, 3.5F, -9.0F, 2, 1, 13, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.0F, -4.5F, 0.0F);
		setRotationAngle(bone4, 0.0F, 0.0F, -0.6981F);
		bone.addChild(bone4);
		bone4.cubeList.add(new ModelBox(bone4, 86, 74, -1.0F, 3.5F, -9.0F, 2, 1, 13, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(0.0F, -4.5F, 0.0F);
		setRotationAngle(bone5, 0.0F, 0.0F, -1.0472F);
		bone.addChild(bone5);
		bone5.cubeList.add(new ModelBox(bone5, 85, 72, -1.0F, 3.5F, -9.0F, 2, 1, 13, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(0.0F, -4.5F, 0.0F);
		setRotationAngle(bone6, 0.0F, 0.0F, -1.3963F);
		bone.addChild(bone6);
		bone6.cubeList.add(new ModelBox(bone6, 84, 76, -1.0F, 3.5F, -9.0F, 2, 1, 13, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(0.0F, -4.5F, 0.0F);
		setRotationAngle(bone7, 0.0F, 0.0F, -1.7453F);
		bone.addChild(bone7);
		bone7.cubeList.add(new ModelBox(bone7, 72, 75, -1.0F, 3.5F, -9.0F, 2, 1, 13, 0.0F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(0.0F, -4.5F, 0.0F);
		setRotationAngle(bone8, 0.0F, 0.0F, -2.0944F);
		bone.addChild(bone8);
		bone8.cubeList.add(new ModelBox(bone8, 71, 72, -1.0F, 3.5F, -9.0F, 2, 1, 13, 0.0F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(0.0F, -4.5F, 0.0F);
		setRotationAngle(bone9, 0.0F, 0.0F, -2.4435F);
		bone.addChild(bone9);
		bone9.cubeList.add(new ModelBox(bone9, 97, 77, -1.0F, 3.5F, -9.0F, 2, 1, 13, 0.0F, false));

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(0.0F, -4.5F, 0.0F);
		setRotationAngle(bone10, 0.0F, 0.0F, -2.7925F);
		bone.addChild(bone10);
		bone10.cubeList.add(new ModelBox(bone10, 74, 72, -1.0F, 3.5F, -9.0F, 2, 1, 13, 0.0F, false));

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(0.0F, -4.5F, 0.0F);
		setRotationAngle(bone11, 0.0F, 0.0F, 3.1416F);
		bone.addChild(bone11);
		bone11.cubeList.add(new ModelBox(bone11, 72, 72, -1.0F, 3.5F, -9.0F, 2, 1, 13, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 88, 77, -2.0F, 4.0F, -6.0F, 4, 2, 3, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 88, 77, -2.0F, 4.5F, -0.5F, 4, 2, 2, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 88, 77, -2.0F, 4.5F, -6.5F, 4, 2, 2, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 101, 105, -2.5F, 5.0F, 0.0F, 1, 1, 1, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 101, 105, -2.5F, 5.0F, -6.0F, 1, 1, 1, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 88, 77, -2.0F, 4.0F, -3.0F, 4, 2, 4, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 96, 73, 3.125F, 4.3906F, -3.0F, 1, 1, 4, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 96, 73, 3.8571F, 4.3906F, -3.0F, 1, 1, 4, 0.0F, false));

		bone21 = new ModelRenderer(this);
		bone21.setRotationPoint(0.0F, 5.5F, -2.5F);
		setRotationAngle(bone21, -0.7854F, 0.0F, 0.0F);
		bone11.addChild(bone21);
		bone21.cubeList.add(new ModelBox(bone21, 88, 77, -2.0F, 1.1213F, -1.7071F, 4, 1, 1, 0.0F, false));
		bone21.cubeList.add(new ModelBox(bone21, 88, 77, -2.0F, -1.7071F, 1.1213F, 4, 1, 1, 0.0F, false));
		bone21.cubeList.add(new ModelBox(bone21, 88, 77, -2.0F, -3.5355F, 1.1213F, 4, 1, 1, 0.0F, false));
		bone21.cubeList.add(new ModelBox(bone21, 88, 77, -2.0F, 1.1213F, -3.5355F, 4, 1, 1, 0.0F, false));

		bone22 = new ModelRenderer(this);
		bone22.setRotationPoint(-2.0F, 5.5F, 0.5F);
		setRotationAngle(bone22, -0.2618F, 0.0F, 0.0F);
		bone11.addChild(bone22);
		bone22.cubeList.add(new ModelBox(bone22, 101, 105, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));
		bone22.cubeList.add(new ModelBox(bone22, 101, 105, -0.5F, 1.0529F, -6.2956F, 1, 1, 1, 0.0F, false));

		bone23 = new ModelRenderer(this);
		bone23.setRotationPoint(-2.0F, 5.5F, 0.5F);
		setRotationAngle(bone23, -0.5236F, 0.0F, 0.0F);
		bone11.addChild(bone23);
		bone23.cubeList.add(new ModelBox(bone23, 101, 105, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));
		bone23.cubeList.add(new ModelBox(bone23, 101, 105, -0.5F, 2.5F, -5.6962F, 1, 1, 1, 0.0F, false));

		bone24 = new ModelRenderer(this);
		bone24.setRotationPoint(-2.0F, 5.5F, 0.5F);
		setRotationAngle(bone24, -0.7854F, 0.0F, 0.0F);
		bone11.addChild(bone24);
		bone24.cubeList.add(new ModelBox(bone24, 101, 105, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));
		bone24.cubeList.add(new ModelBox(bone24, 101, 105, -0.5F, 3.7426F, -4.7426F, 1, 1, 1, 0.0F, false));

		bone25 = new ModelRenderer(this);
		bone25.setRotationPoint(-2.0F, 5.5F, 0.5F);
		setRotationAngle(bone25, -1.0472F, 0.0F, 0.0F);
		bone11.addChild(bone25);
		bone25.cubeList.add(new ModelBox(bone25, 101, 105, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));
		bone25.cubeList.add(new ModelBox(bone25, 101, 105, -0.5F, 4.6962F, -3.5F, 1, 1, 1, 0.0F, false));

		bone26 = new ModelRenderer(this);
		bone26.setRotationPoint(-2.0F, 5.5F, 0.5F);
		setRotationAngle(bone26, -1.309F, 0.0F, 0.0F);
		bone11.addChild(bone26);
		bone26.cubeList.add(new ModelBox(bone26, 101, 105, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));
		bone26.cubeList.add(new ModelBox(bone26, 101, 105, -0.5F, 5.2956F, -2.0529F, 1, 1, 1, 0.0F, false));

		bone18 = new ModelRenderer(this);
		bone18.setRotationPoint(4.125F, 4.8906F, -1.0F);
		setRotationAngle(bone18, 0.0F, 0.0F, -1.0472F);
		bone11.addChild(bone18);
		bone18.cubeList.add(new ModelBox(bone18, 96, 73, -0.933F, -0.616F, -2.0F, 1, 1, 4, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 96, 73, -0.201F, -0.616F, -2.0F, 1, 1, 4, 0.0F, false));

		bone27 = new ModelRenderer(this);
		bone27.setRotationPoint(4.125F, 4.8906F, -1.0F);
		setRotationAngle(bone27, 0.0F, 0.0F, -2.0944F);
		bone11.addChild(bone27);
		bone27.cubeList.add(new ModelBox(bone27, 96, 73, -0.067F, -0.616F, -2.0F, 1, 1, 4, 0.0F, false));
		bone27.cubeList.add(new ModelBox(bone27, 96, 73, -0.799F, -0.616F, -2.0F, 1, 1, 4, 0.0F, false));

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(0.0F, -4.5F, 0.0F);
		setRotationAngle(bone12, 0.0F, 0.0F, 2.7925F);
		bone.addChild(bone12);
		bone12.cubeList.add(new ModelBox(bone12, 92, 76, -1.0F, 3.5F, -9.0F, 2, 1, 13, 0.0F, false));

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(0.0F, -4.5F, 0.0F);
		setRotationAngle(bone13, 0.0F, 0.0F, 2.4435F);
		bone.addChild(bone13);
		bone13.cubeList.add(new ModelBox(bone13, 87, 70, -1.0F, 3.5F, -9.0F, 2, 1, 13, 0.0F, false));

		bone14 = new ModelRenderer(this);
		bone14.setRotationPoint(0.0F, -4.5F, 0.0F);
		setRotationAngle(bone14, 0.0F, 0.0F, 2.0944F);
		bone.addChild(bone14);
		bone14.cubeList.add(new ModelBox(bone14, 88, 78, -1.0F, 3.5F, -9.0F, 2, 1, 13, 0.0F, false));

		bone15 = new ModelRenderer(this);
		bone15.setRotationPoint(0.0F, -4.5F, 0.0F);
		setRotationAngle(bone15, 0.0F, 0.0F, 1.7453F);
		bone.addChild(bone15);
		bone15.cubeList.add(new ModelBox(bone15, 89, 70, -1.0F, 3.5F, -9.0F, 2, 1, 13, 0.0F, false));
		bone15.cubeList.add(new ModelBox(bone15, 89, 70, -1.5F, 3.8594F, -4.5F, 3, 1, 6, 0.0F, false));
		bone15.cubeList.add(new ModelBox(bone15, 89, 70, -2.0F, 4.75F, 1.0F, 4, 1, 1, 0.0F, false));
		bone15.cubeList.add(new ModelBox(bone15, 89, 70, 1.0F, 5.75F, 1.0F, 1, 2, 1, 0.0F, false));
		bone15.cubeList.add(new ModelBox(bone15, 89, 70, -2.0F, 4.75F, -5.0F, 4, 3, 6, 0.0F, false));
		bone15.cubeList.add(new ModelBox(bone15, 124, 102, 0.0F, 5.75F, 1.2969F, 1, 1, 1, 0.0F, false));
		bone15.cubeList.add(new ModelBox(bone15, 80, 104, -1.0F, 5.75F, 0.8281F, 1, 1, 1, 0.0F, false));
		bone15.cubeList.add(new ModelBox(bone15, 89, 70, -2.0F, 5.75F, 1.0F, 1, 2, 1, 0.0F, false));
		bone15.cubeList.add(new ModelBox(bone15, 89, 70, -1.0F, 6.75F, 1.0F, 2, 1, 1, 0.0F, false));

		bone16 = new ModelRenderer(this);
		bone16.setRotationPoint(0.0F, -4.5F, 0.0F);
		setRotationAngle(bone16, 0.0F, 0.0F, 1.3963F);
		bone.addChild(bone16);
		bone16.cubeList.add(new ModelBox(bone16, 96, 80, -1.0F, 3.5F, -9.0F, 2, 1, 13, 0.0F, false));

		bone17 = new ModelRenderer(this);
		bone17.setRotationPoint(0.0F, -4.5F, 0.0F);
		setRotationAngle(bone17, 0.0F, 0.0F, 1.0472F);
		bone.addChild(bone17);
		bone17.cubeList.add(new ModelBox(bone17, 79, 76, -1.0F, 3.5F, -9.0F, 2, 1, 13, 0.0F, false));

		bone19 = new ModelRenderer(this);
		bone19.setRotationPoint(0.0F, -4.5F, 0.0F);
		setRotationAngle(bone19, 0.0F, 0.0F, 0.6981F);
		bone.addChild(bone19);
		bone19.cubeList.add(new ModelBox(bone19, 82, 72, -1.0F, 3.5F, -9.0F, 2, 1, 13, 0.0F, false));

		bone20 = new ModelRenderer(this);
		bone20.setRotationPoint(0.0F, -4.5F, 0.0F);
		setRotationAngle(bone20, 0.0F, 0.0F, 0.3491F);
		bone.addChild(bone20);
		bone20.cubeList.add(new ModelBox(bone20, 74, 72, -1.0F, 3.5F, -9.0F, 2, 1, 13, 0.0F, false));

		bone28 = new ModelRenderer(this);
		bone28.setRotationPoint(-3.9688F, -10.1719F, 0.5F);
		setRotationAngle(bone28, 0.0F, 0.0F, -0.2618F);
		bone.addChild(bone28);
		bone28.cubeList.add(new ModelBox(bone28, 116, 102, -0.85F, 0.2505F, -2.5F, 3, 1, 2, 0.0F, false));

		bone29 = new ModelRenderer(this);
		bone29.setRotationPoint(-3.9688F, -10.1719F, 0.5F);
		setRotationAngle(bone29, 0.0F, 0.0F, 2.2689F);
		bone.addChild(bone29);
		bone29.cubeList.add(new ModelBox(bone29, 116, 102, 0.775F, -0.937F, -2.5F, 3, 1, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bone.render(f5);
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}