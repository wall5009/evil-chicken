
package net.rollylindenshnizzer.evilchicken.client.renderer;

import net.rollylindenshnizzer.evilchicken.entity.EvilChickenEntity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.ChickenModel;

public class EvilChickenRenderer extends MobRenderer<EvilChickenEntity, ChickenModel<EvilChickenEntity>> {
	public EvilChickenRenderer(EntityRendererProvider.Context context) {
		super(context, new ChickenModel<EvilChickenEntity>(context.bakeLayer(ModelLayers.CHICKEN)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EvilChickenEntity entity) {
		return ResourceLocation.parse("evil_chicken:textures/entities/evilchicken.png");
	}
}
