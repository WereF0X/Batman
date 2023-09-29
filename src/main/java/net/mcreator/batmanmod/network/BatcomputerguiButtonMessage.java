
package net.mcreator.batmanmod.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.batmanmod.world.inventory.BatcomputerguiMenu;
import net.mcreator.batmanmod.procedures.SpacesuitgProcedure;
import net.mcreator.batmanmod.procedures.GrapplinghooksupplyProcedure;
import net.mcreator.batmanmod.procedures.GivebatarangProcedure;
import net.mcreator.batmanmod.procedures.BatkitProcedure;
import net.mcreator.batmanmod.procedures.BatfistsProcedure;
import net.mcreator.batmanmod.BatmanModMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BatcomputerguiButtonMessage {
	private final int buttonID, x, y, z;

	public BatcomputerguiButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public BatcomputerguiButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(BatcomputerguiButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(BatcomputerguiButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level();
		HashMap guistate = BatcomputerguiMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			GivebatarangProcedure.execute(entity);
		}
		if (buttonID == 1) {

			BatfistsProcedure.execute(entity);
		}
		if (buttonID == 2) {

			BatkitProcedure.execute(entity);
		}
		if (buttonID == 3) {

			SpacesuitgProcedure.execute(entity);
		}
		if (buttonID == 4) {

			GrapplinghooksupplyProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		BatmanModMod.addNetworkMessage(BatcomputerguiButtonMessage.class, BatcomputerguiButtonMessage::buffer, BatcomputerguiButtonMessage::new, BatcomputerguiButtonMessage::handler);
	}
}
