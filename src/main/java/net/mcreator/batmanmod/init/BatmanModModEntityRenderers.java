
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.batmanmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class BatmanModModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(BatmanModModEntities.BATARANG.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(BatmanModModEntities.GRAPPLINGHOOK.get(), ThrownItemRenderer::new);
	}
}
