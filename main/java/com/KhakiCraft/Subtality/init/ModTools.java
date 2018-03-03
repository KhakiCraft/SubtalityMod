package com.KhakiCraft.Subtality.init;

import com.KhakiCraft.Subtality.init.tools.CustomAxe;
import com.KhakiCraft.Subtality.init.tools.CustomHoe;
import com.KhakiCraft.Subtality.init.tools.CustomPickaxe;
import com.KhakiCraft.Subtality.init.tools.CustomSpade;
import com.KhakiCraft.Subtality.init.tools.CustomSword;
import com.KhakiCraft.Subtality.items.ItemMorganite;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModTools 
{
	
	public static final ToolMaterial morganite = EnumHelper.addToolMaterial("morganite", 4, 4200, 15.0F, 5.0F, 17);
	
	public static Item morganite_pickaxe, morganite_axe, morganite_hoe, morganite_spade, morganite_sword;
	
	public static void init() {
		morganite_pickaxe = new CustomPickaxe("morganite_pickaxe", null);
		morganite_axe = new CustomAxe("morganite_axe", null);
		morganite_hoe = new CustomHoe("morganite_hoe", null);
		morganite_pickaxe = new CustomSpade("morganite_spade", null);
		morganite_pickaxe = new CustomSword("morganite_sword", null);
	}
	
	public static void register() {
		GameRegistry.register(morganite_pickaxe);
		GameRegistry.register(morganite_axe);
		GameRegistry.register(morganite_hoe);
		GameRegistry.register(morganite_spade);
		GameRegistry.register(morganite_sword);
	}
	
	public static void registerRenders() {
		registerRender(morganite_pickaxe);
		registerRender(morganite_axe);
		registerRender(morganite_hoe);
		registerRender(morganite_spade);
		registerRender(morganite_sword);
	}
	
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
