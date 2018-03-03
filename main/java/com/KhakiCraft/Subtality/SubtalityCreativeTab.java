package com.KhakiCraft.Subtality;

import com.KhakiCraft.Subtality.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class SubtalityCreativeTab extends CreativeTabs {

	public SubtalityCreativeTab() {
		super("subtalityTab");
    }

	@Override
	public Item getTabIconItem() {
		return ModItems.morganite;
	}

}
