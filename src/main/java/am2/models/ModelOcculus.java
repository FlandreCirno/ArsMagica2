package am2.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelOcculus extends ModelBase
{
	//fields
	ModelRenderer Stand13;
	ModelRenderer Stand1;
	ModelRenderer Stand2;
	ModelRenderer Stand3;
	ModelRenderer Stand4;
	ModelRenderer Stand11;
	ModelRenderer Stand12;
	ModelRenderer Stand8;
	ModelRenderer Stand9;
	ModelRenderer Stand10;
	ModelRenderer Stand17;
	ModelRenderer Stand6;
	ModelRenderer Stand7;
	ModelRenderer Stand14;
	ModelRenderer Stand15;
	ModelRenderer Stand16;
	ModelRenderer Stand5;
	ModelRenderer Eye;

	public ModelOcculus()
	{
		textureWidth = 64;
		textureHeight = 32;
		setTextureOffset("Eye.Eye9", 13, 28);
		setTextureOffset("Eye.Eye1", 13, 22);
		setTextureOffset("Eye.Eye2", 18, 28);
		setTextureOffset("Eye.Eye3", 0, 26);
		setTextureOffset("Eye.Eye8", 0, 22);
		setTextureOffset("Eye.Eye7", 0, 22);
		setTextureOffset("Eye.Eye6", 13, 26);
		setTextureOffset("Eye.Eye5", 0, 22);
		setTextureOffset("Eye.Eye10", 0, 22);
		setTextureOffset("Eye.Eye4", 13, 26);
		setTextureOffset("Eye.Eye11", 13, 28);

		Stand13 = new ModelRenderer(this, 20, 20);
		Stand13.addBox(-0.5F, 0F, -1F, 1, 3, 1);
		Stand13.setRotationPoint(0F, 5F, -4F);
		Stand13.setTextureSize(64, 32);
		Stand13.mirror = true;
		setRotation(Stand13, 0F, 0F, 0F);
		Stand1 = new ModelRenderer(this, 0, 0);
		Stand1.addBox(-8F, 0F, -8F, 16, 3, 16);
		Stand1.setRotationPoint(0F, 21F, 0F);
		Stand1.setTextureSize(64, 32);
		Stand1.mirror = true;
		setRotation(Stand1, 0F, 0F, 0F);
		Stand2 = new ModelRenderer(this, 10, 5);
		Stand2.addBox(-5.5F, 0F, -5.5F, 11, 2, 11);
		Stand2.setRotationPoint(0F, 19F, 0F);
		Stand2.setTextureSize(64, 32);
		Stand2.mirror = true;
		setRotation(Stand2, 0F, 0F, 0F);
		Stand3 = new ModelRenderer(this, 18, 9);
		Stand3.addBox(-3.5F, 0F, -3.5F, 7, 1, 7);
		Stand3.setRotationPoint(0F, 18F, 0F);
		Stand3.setTextureSize(64, 32);
		Stand3.mirror = true;
		setRotation(Stand3, 0F, 0F, 0F);
		Stand4 = new ModelRenderer(this, 49, 20);
		Stand4.addBox(-2F, 0F, -2F, 4, 8, 4);
		Stand4.setRotationPoint(0F, 10F, 0F);
		Stand4.setTextureSize(64, 32);
		Stand4.mirror = true;
		setRotation(Stand4, 0F, 0F, 0F);
		Stand11 = new ModelRenderer(this, 32, 20);
		Stand11.addBox(-2F, 0F, -1F, 4, 3, 1);
		Stand11.setRotationPoint(0F, 9F, -2F);
		Stand11.setTextureSize(64, 32);
		Stand11.mirror = true;
		setRotation(Stand11, 0F, 0F, 0F);
		Stand12 = new ModelRenderer(this, 25, 20);
		Stand12.addBox(-1F, 0F, -1F, 2, 3, 1);
		Stand12.setRotationPoint(0F, 7F, -3F);
		Stand12.setTextureSize(64, 32);
		Stand12.mirror = true;
		setRotation(Stand12, 0F, 0F, 0F);
		Stand8 = new ModelRenderer(this, 32, 20);
		Stand8.addBox(-2F, 0F, -1F, 1, 3, 4);
		Stand8.setRotationPoint(-1F, 9F, -1F);
		Stand8.setTextureSize(64, 32);
		Stand8.mirror = true;
		setRotation(Stand8, 0F, 0F, 0F);
		Stand9 = new ModelRenderer(this, 25, 20);
		Stand9.addBox(-1F, 0F, 0F, 1, 3, 2);
		Stand9.setRotationPoint(-3F, 7F, -1F);
		Stand9.setTextureSize(64, 32);
		Stand9.mirror = true;
		setRotation(Stand9, 0F, 0F, 0F);
		Stand10 = new ModelRenderer(this, 20, 20);
		Stand10.addBox(0F, 0F, -0.5F, 1, 3, 1);
		Stand10.setRotationPoint(-5F, 5F, 0F);
		Stand10.setTextureSize(64, 32);
		Stand10.mirror = true;
		setRotation(Stand10, 0F, 0F, 0F);
		Stand17 = new ModelRenderer(this, 43, 20);
		Stand17.addBox(-2F, 0F, -1F, 2, 3, 1);
		Stand17.setRotationPoint(1F, 13F, 3F);
		Stand17.setTextureSize(64, 32);
		Stand17.mirror = true;
		setRotation(Stand17, 0F, 0F, 0F);
		Stand6 = new ModelRenderer(this, 25, 20);
		Stand6.addBox(-1F, 0F, -1F, 2, 3, 1);
		Stand6.setRotationPoint(0F, 7F, 4F);
		Stand6.setTextureSize(64, 32);
		Stand6.mirror = true;
		setRotation(Stand6, 0F, 0F, 0F);
		Stand7 = new ModelRenderer(this, 20, 20);
		Stand7.addBox(-0.5F, 0F, -1F, 1, 3, 1);
		Stand7.setRotationPoint(0F, 5F, 5F);
		Stand7.setTextureSize(64, 32);
		Stand7.mirror = true;
		setRotation(Stand7, 0F, 0F, 0F);
		Stand14 = new ModelRenderer(this, 32, 20);
		Stand14.addBox(-2F, 0F, -1F, 1, 3, 4);
		Stand14.setRotationPoint(4F, 9F, -1F);
		Stand14.setTextureSize(64, 32);
		Stand14.mirror = true;
		setRotation(Stand14, 0F, 0F, 0F);
		Stand15 = new ModelRenderer(this, 25, 20);
		Stand15.addBox(-1F, 0F, 0F, 1, 3, 2);
		Stand15.setRotationPoint(4F, 7F, -1F);
		Stand15.setTextureSize(64, 32);
		Stand15.mirror = true;
		setRotation(Stand15, 0F, 0F, 0F);
		Stand16 = new ModelRenderer(this, 20, 20);
		Stand16.addBox(0F, 0F, -0.5F, 1, 3, 1);
		Stand16.setRotationPoint(4F, 5F, 0F);
		Stand16.setTextureSize(64, 32);
		Stand16.mirror = true;
		setRotation(Stand16, 0F, 0F, 0F);
		Stand5 = new ModelRenderer(this, 32, 20);
		Stand5.addBox(-2F, 0F, -1F, 4, 3, 1);
		Stand5.setRotationPoint(0F, 9F, 3F);
		Stand5.setTextureSize(64, 32);
		Stand5.mirror = true;
		setRotation(Stand5, 0F, 0F, 0F);
		Eye = new ModelRenderer(this, "Eye");
		Eye.setRotationPoint(-0.5F, 2F, -2.5F);
		setRotation(Eye, 0F, 0F, 0F);
		Eye.mirror = true;
		Eye.addBox("Eye9", -2F, -1F, 4F, 1, 3, 1);
		Eye.addBox("Eye1", 0F, 0F, 0F, 1, 1, 1);
		Eye.addBox("Eye2", -1F, -1F, 1F, 3, 3, 1);
		Eye.addBox("Eye3", -2F, -2F, 2F, 5, 5, 1);
		Eye.addBox("Eye8", -2F, 2F, 4F, 5, 1, 1);
		Eye.addBox("Eye7", -2F, 3F, 3F, 5, 1, 1);
		Eye.addBox("Eye6", -3F, -2F, 3F, 1, 5, 1);
		Eye.addBox("Eye5", -2F, -3F, 3F, 5, 1, 1);
		Eye.addBox("Eye10", -2F, -2F, 4F, 5, 1, 1);
		Eye.addBox("Eye4", 3F, -2F, 3F, 1, 5, 1);
		Eye.addBox("Eye11", 2F, -1F, 4F, 1, 3, 1);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		Stand13.render(f5);
		Stand1.render(f5);
		Stand2.render(f5);
		Stand3.render(f5);
		Stand4.render(f5);
		Stand11.render(f5);
		Stand12.render(f5);
		Stand8.render(f5);
		Stand9.render(f5);
		Stand10.render(f5);
		Stand17.render(f5);
		Stand6.render(f5);
		Stand7.render(f5);
		Stand14.render(f5);
		Stand15.render(f5);
		Stand16.render(f5);
		Stand5.render(f5);
		Eye.render(f5);
	}

	public void renderModel(float f5){
		Stand13.render(f5);
		Stand1.render(f5);
		Stand2.render(f5);
		Stand3.render(f5);
		Stand4.render(f5);
		Stand11.render(f5);
		Stand12.render(f5);
		Stand8.render(f5);
		Stand9.render(f5);
		Stand10.render(f5);
		Stand17.render(f5);
		Stand6.render(f5);
		Stand7.render(f5);
		Stand14.render(f5);
		Stand15.render(f5);
		Stand16.render(f5);
		Stand5.render(f5);
		Eye.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

}