package com.KhakiCraft.Subtality.init;

import com.KhakiCraft.Subtality.Reference;
import com.KhakiCraft.Subtality.items.ItemMorganite;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	
	public static Item morganite;
	
	public static void init() {
		morganite = new ItemMorganite();
	}
	
	public static void register() {
		GameRegistry.register(morganite);
	}
	
	public static void registerRenders() {
		registerRender(morganite);
	}
	
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
