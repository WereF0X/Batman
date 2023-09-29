
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.batmanmod.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.batmanmod.client.gui.BatkeyguiScreen;
import net.mcreator.batmanmod.client.gui.BatcomputerguiScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class BatmanModModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(BatmanModModMenus.BATCOMPUTERGUI.get(), BatcomputerguiScreen::new);
			MenuScreens.register(BatmanModModMenus.BATKEYGUI.get(), BatkeyguiScreen::new);
		});
	}
}
