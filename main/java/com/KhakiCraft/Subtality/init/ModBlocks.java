package com.KhakiCraft.Subtality.init;

import com.KhakiCraft.Subtality.blocks.BlockMorganite;
import com.KhakiCraft.Subtality.blocks.BlockMorganiteOre;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
	
	public static Block morganite_ore;
	public static Block morganite_block;

	public static void init() {
		morganite_ore = new BlockMorganiteOre();
		morganite_block = new BlockMorganite();
	}
	
	public static void register() {
		registerBlock(morganite_ore);
		registerBlock(morganite_block);
}
	private static void registerBlock(Block block) {
		GameRegistry.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
	}
	
	public static void registerRenders() {
		registerRender(morganite_ore);
		registerRender(morganite_block);
}
	
	private static void registerRender(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
	
}
