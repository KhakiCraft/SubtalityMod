package com.KhakiCraft.Subtality.init.tools;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;

public class CustomSpade extends ItemSpade {

	public CustomSpade(String name, ToolMaterial material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
    }

}
