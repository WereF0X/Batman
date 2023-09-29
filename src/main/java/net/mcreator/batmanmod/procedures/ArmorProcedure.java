package net.mcreator.batmanmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.batmanmod.init.BatmanModModItems;
import net.mcreator.batmanmod.BatmanModMod;

public class ArmorProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(BatmanModModItems.SPACE_SUIT_HELMET.get())) : false) {
			if (entity instanceof Player _player) {
				_player.getAbilities().flying = true;
				_player.onUpdateAbilities();
			}
			if (entity instanceof Player _player) {
				_player.getAbilities().mayfly = true;
				_player.onUpdateAbilities();
			}
			{
				Entity _ent = entity;
				if (!_ent.level().isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "/tellraw @p {\"text\":\"Space Suit Activated\",\"color\":\"aqua\"}");
				}
			}
			entity.setAirSupply(20);
			BatmanModMod.queueServerWork(20, () -> {
				entity.setAirSupply(20);
			});
			BatmanModMod.queueServerWork(20, () -> {
				entity.setAirSupply(20);
			});
			BatmanModMod.queueServerWork(20, () -> {
				entity.setAirSupply(20);
			});
			BatmanModMod.queueServerWork(20, () -> {
				entity.setAirSupply(20);
			});
		}
	}
}
