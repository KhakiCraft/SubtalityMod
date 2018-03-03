package com.KhakiCraft.Subtality.blocks;

import com.KhakiCraft.Subtality.Reference;
import com.KhakiCraft.Subtality.Subtality;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockMorganiteOre extends Block {

	public BlockMorganiteOre() {
		super(Material.ROCK);
		setUnlocalizedName(Reference.SubtalityBlocks.MORGANITE_ORE.getUnlocalizedName());
		setRegistryName(Reference.SubtalityBlocks.MORGANITE_ORE.getRegistryName());
		setHardness(22.5F);
		setHarvestLevel("pickaxe", 3);
		setCreativeTab(Subtality.CREATIVE_TAB);
	}

}
