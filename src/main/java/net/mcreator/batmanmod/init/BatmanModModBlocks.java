
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.batmanmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.batmanmod.block.BatComputerBlock;
import net.mcreator.batmanmod.BatmanModMod;

public class BatmanModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, BatmanModMod.MODID);
	public static final RegistryObject<Block> BAT_COMPUTER = REGISTRY.register("bat_computer", () -> new BatComputerBlock());
}
