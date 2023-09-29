
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.batmanmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.batmanmod.world.inventory.BatkeyguiMenu;
import net.mcreator.batmanmod.world.inventory.BatcomputerguiMenu;
import net.mcreator.batmanmod.BatmanModMod;

public class BatmanModModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, BatmanModMod.MODID);
	public static final RegistryObject<MenuType<BatcomputerguiMenu>> BATCOMPUTERGUI = REGISTRY.register("batcomputergui", () -> IForgeMenuType.create(BatcomputerguiMenu::new));
	public static final RegistryObject<MenuType<BatkeyguiMenu>> BATKEYGUI = REGISTRY.register("batkeygui", () -> IForgeMenuType.create(BatkeyguiMenu::new));
}
