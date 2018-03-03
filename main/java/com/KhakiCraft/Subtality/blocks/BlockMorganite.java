package com.KhakiCraft.Subtality.blocks;

import com.KhakiCraft.Subtality.Reference;
import com.KhakiCraft.Subtality.Subtality;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockMorganite extends Block {

	public BlockMorganite() {
		super(Material.IRON);
		setUnlocalizedName(Reference.SubtalityBlocks.MORGANITE_BLOCK.getUnlocalizedName());
		setRegistryName(Reference.SubtalityBlocks.MORGANITE_BLOCK.getRegistryName());
		setHardness(15.5F);
		setCreativeTab(Subtality.CREATIVE_TAB);
}

}
