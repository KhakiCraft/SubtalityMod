package com.KhakiCraft.Subtality.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {
	
	public static void register() {
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.morganite_block), "MMM", "MMM", "MMM", 'M', ModItems.morganite);
		
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.morganite, 9), "   ", " M  ", "   ", 'M', ModBlocks.morganite_block);
	}

}
