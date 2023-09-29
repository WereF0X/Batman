package net.mcreator.batmanmod.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.batmanmod.world.inventory.BatcomputerguiMenu;
import net.mcreator.batmanmod.network.BatcomputerguiButtonMessage;
import net.mcreator.batmanmod.BatmanModMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class BatcomputerguiScreen extends AbstractContainerScreen<BatcomputerguiMenu> {
	private final static HashMap<String, Object> guistate = BatcomputerguiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_batarang_supply;
	Button button_batfists_supply;
	Button button_batkit;
	Button button_space_suit;
	Button button_grappling_hook_supply;

	public BatcomputerguiScreen(BatcomputerguiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("batman_mod:textures/screens/batcomputergui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.batman_mod.batcomputergui.label_batcomputer"), 58, 7, -16777216, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_batarang_supply = Button.builder(Component.translatable("gui.batman_mod.batcomputergui.button_batarang_supply"), e -> {
			if (true) {
				BatmanModMod.PACKET_HANDLER.sendToServer(new BatcomputerguiButtonMessage(0, x, y, z));
				BatcomputerguiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 34, this.topPos + 19, 103, 20).build();
		guistate.put("button:button_batarang_supply", button_batarang_supply);
		this.addRenderableWidget(button_batarang_supply);
		button_batfists_supply = Button.builder(Component.translatable("gui.batman_mod.batcomputergui.button_batfists_supply"), e -> {
			if (true) {
				BatmanModMod.PACKET_HANDLER.sendToServer(new BatcomputerguiButtonMessage(1, x, y, z));
				BatcomputerguiButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 34, this.topPos + 48, 103, 20).build();
		guistate.put("button:button_batfists_supply", button_batfists_supply);
		this.addRenderableWidget(button_batfists_supply);
		button_batkit = Button.builder(Component.translatable("gui.batman_mod.batcomputergui.button_batkit"), e -> {
			if (true) {
				BatmanModMod.PACKET_HANDLER.sendToServer(new BatcomputerguiButtonMessage(2, x, y, z));
				BatcomputerguiButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 57, this.topPos + 104, 56, 20).build();
		guistate.put("button:button_batkit", button_batkit);
		this.addRenderableWidget(button_batkit);
		button_space_suit = Button.builder(Component.translatable("gui.batman_mod.batcomputergui.button_space_suit"), e -> {
			if (true) {
				BatmanModMod.PACKET_HANDLER.sendToServer(new BatcomputerguiButtonMessage(3, x, y, z));
				BatcomputerguiButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 48, this.topPos + 132, 77, 20).build();
		guistate.put("button:button_space_suit", button_space_suit);
		this.addRenderableWidget(button_space_suit);
		button_grappling_hook_supply = Button.builder(Component.translatable("gui.batman_mod.batcomputergui.button_grappling_hook_supply"), e -> {
			if (true) {
				BatmanModMod.PACKET_HANDLER.sendToServer(new BatcomputerguiButtonMessage(4, x, y, z));
				BatcomputerguiButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}).bounds(this.leftPos + 19, this.topPos + 77, 134, 20).build();
		guistate.put("button:button_grappling_hook_supply", button_grappling_hook_supply);
		this.addRenderableWidget(button_grappling_hook_supply);
	}
}
