package com.KhakiCraft.Subtality.init;

import com.KhakiCraft.Subtality.Reference;
import com.KhakiCraft.Subtality.init.armour.CustomArmour;
import com.KhakiCraft.Subtality.items.ItemMorganite;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModArmour 
{
	
	public static final ArmorMaterial morganite = EnumHelper.addArmorMaterial("morganite", Reference.MOD_ID + ":morganite", 42, new int[]{4, 7, 9, 4}, 17, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.5F);
	
    public static Item morganite_chestplate, morganite_helmet, morganite_boots, morganite_leggings;
	
	public static void init() {
		morganite_chestplate = new CustomArmour("morganite_chestplate", morganite, 1, EntityEquipmentSlot.CHEST);
		morganite_helmet = new CustomArmour("morganite_helmet", morganite, 1, EntityEquipmentSlot.HEAD);
		morganite_boots = new CustomArmour("morganite_boots", morganite, 1, EntityEquipmentSlot.FEET);
		morganite_leggings = new CustomArmour("morganite_leggings", morganite, 2, EntityEquipmentSlot.LEGS);
	}
	
	public static void register() {
		GameRegistry.register(morganite_chestplate);
		GameRegistry.register(morganite_helmet);
		GameRegistry.register(morganite_boots);
		GameRegistry.register(morganite_leggings);
	}
	
	public static void registerRenders() {
		registerRender(morganite_chestplate);
		registerRender(morganite_helmet);
		registerRender(morganite_boots);
		registerRender(morganite_leggings);
	}
	
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
