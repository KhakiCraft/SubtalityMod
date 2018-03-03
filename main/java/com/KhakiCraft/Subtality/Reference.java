package com.KhakiCraft.Subtality;

import com.KhakiCraft.Subtality.worldgen.SubtalityOreGen;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class Reference {
	
	public static final String MOD_ID = "ksm";
	public static final String NAME = "Subtality";
	public static final String VERSION = "1.0";
	public static final String ACCEPTED_VERSIONS = "[1.10.2]";
	
	public static final String CLIENT_PROXY_CLASS = "com.KhakiCraft.Subtality.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "com.KhakiCraft.Subtality.proxy.ServerProxy";
	
	public static enum SubtalityItems {
		MORGANITE("morganite", "ItemMorganite");
		
		private String unlocalizedName;
		private String registryName;
		
		SubtalityItems(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalizedName() 
		{
			return unlocalizedName;
		}
		
		public String getRegistryName() 
		{
			return registryName;
		}
	}
	
	public static enum SubtalityBlocks {
		MORGANITE_ORE("morganite_ore", "BlockMorganiteOre"),
		MORGANITE_BLOCK("morganite_block", "BlockMorganite");
		
		private String unlocalizedName;
		private String registryName;
		
		SubtalityBlocks(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalizedName() 
		{
			return unlocalizedName;
		}
		
		public String getRegistryName() 
		{
			return registryName;
		}
	}
}
