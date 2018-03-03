package com.KhakiCraft.Subtality.items;

import com.KhakiCraft.Subtality.Reference;
import com.KhakiCraft.Subtality.Subtality;

import net.minecraft.item.Item;

public class ItemMorganite extends Item {
	
	public ItemMorganite() {
		setUnlocalizedName(Reference.SubtalityItems.MORGANITE.getUnlocalizedName());
		setRegistryName(Reference.SubtalityItems.MORGANITE.getRegistryName());
		setCreativeTab(Subtality.CREATIVE_TAB);
	}

}
