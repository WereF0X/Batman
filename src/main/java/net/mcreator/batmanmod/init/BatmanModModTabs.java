
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.batmanmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.batmanmod.BatmanModMod;

public class BatmanModModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BatmanModMod.MODID);
	public static final RegistryObject<CreativeModeTab> BAT_MOD = REGISTRY.register("bat_mod",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.batman_mod.bat_mod")).icon(() -> new ItemStack(Blocks.BARRIER)).displayItems((parameters, tabData) -> {
				tabData.accept(BatmanModModItems.BATMAN_FISTS.get());
				tabData.accept(BatmanModModItems.BATARANG.get());
				tabData.accept(BatmanModModBlocks.BAT_COMPUTER.get().asItem());
				tabData.accept(BatmanModModItems.BAT_KEY.get());
				tabData.accept(BatmanModModItems.SPACE_SUIT_HELMET.get());
				tabData.accept(BatmanModModItems.SPACE_SUIT_CHESTPLATE.get());
				tabData.accept(BatmanModModItems.SPACE_SUIT_LEGGINGS.get());
				tabData.accept(BatmanModModItems.SPACE_SUIT_BOOTS.get());
				tabData.accept(BatmanModModItems.BATMAN_HELMET.get());
				tabData.accept(BatmanModModItems.BATMAN_CHESTPLATE.get());
				tabData.accept(BatmanModModItems.BATMAN_LEGGINGS.get());
				tabData.accept(BatmanModModItems.BATMAN_BOOTS.get());
				tabData.accept(BatmanModModItems.GRAPPLINGHOOK.get());
			})

					.build());
}
