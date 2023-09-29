
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.batmanmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.batmanmod.item.SpaceSuitItem;
import net.mcreator.batmanmod.item.GrapplinghookItem;
import net.mcreator.batmanmod.item.BatmanItem;
import net.mcreator.batmanmod.item.BatmanFistsItem;
import net.mcreator.batmanmod.item.BatarangItem;
import net.mcreator.batmanmod.item.BatKeyItem;
import net.mcreator.batmanmod.BatmanModMod;

public class BatmanModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BatmanModMod.MODID);
	public static final RegistryObject<Item> BATMAN_FISTS = REGISTRY.register("batman_fists", () -> new BatmanFistsItem());
	public static final RegistryObject<Item> BATARANG = REGISTRY.register("batarang", () -> new BatarangItem());
	public static final RegistryObject<Item> BAT_COMPUTER = block(BatmanModModBlocks.BAT_COMPUTER);
	public static final RegistryObject<Item> BAT_KEY = REGISTRY.register("bat_key", () -> new BatKeyItem());
	public static final RegistryObject<Item> SPACE_SUIT_HELMET = REGISTRY.register("space_suit_helmet", () -> new SpaceSuitItem.Helmet());
	public static final RegistryObject<Item> SPACE_SUIT_CHESTPLATE = REGISTRY.register("space_suit_chestplate", () -> new SpaceSuitItem.Chestplate());
	public static final RegistryObject<Item> SPACE_SUIT_LEGGINGS = REGISTRY.register("space_suit_leggings", () -> new SpaceSuitItem.Leggings());
	public static final RegistryObject<Item> SPACE_SUIT_BOOTS = REGISTRY.register("space_suit_boots", () -> new SpaceSuitItem.Boots());
	public static final RegistryObject<Item> BATMAN_HELMET = REGISTRY.register("batman_helmet", () -> new BatmanItem.Helmet());
	public static final RegistryObject<Item> BATMAN_CHESTPLATE = REGISTRY.register("batman_chestplate", () -> new BatmanItem.Chestplate());
	public static final RegistryObject<Item> BATMAN_LEGGINGS = REGISTRY.register("batman_leggings", () -> new BatmanItem.Leggings());
	public static final RegistryObject<Item> BATMAN_BOOTS = REGISTRY.register("batman_boots", () -> new BatmanItem.Boots());
	public static final RegistryObject<Item> GRAPPLINGHOOK = REGISTRY.register("grapplinghook", () -> new GrapplinghookItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
