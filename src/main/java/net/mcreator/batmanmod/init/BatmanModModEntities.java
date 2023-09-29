
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.batmanmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.batmanmod.entity.GrapplinghookEntity;
import net.mcreator.batmanmod.entity.BatarangEntity;
import net.mcreator.batmanmod.BatmanModMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BatmanModModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, BatmanModMod.MODID);
	public static final RegistryObject<EntityType<BatarangEntity>> BATARANG = register("projectile_batarang",
			EntityType.Builder.<BatarangEntity>of(BatarangEntity::new, MobCategory.MISC).setCustomClientFactory(BatarangEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<GrapplinghookEntity>> GRAPPLINGHOOK = register("projectile_grapplinghook",
			EntityType.Builder.<GrapplinghookEntity>of(GrapplinghookEntity::new, MobCategory.MISC).setCustomClientFactory(GrapplinghookEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}
}
