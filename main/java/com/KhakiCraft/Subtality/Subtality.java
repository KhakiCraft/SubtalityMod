package com.KhakiCraft.Subtality;

import com.KhakiCraft.Subtality.init.ModArmour;
import com.KhakiCraft.Subtality.init.ModBlocks;
import com.KhakiCraft.Subtality.init.ModCrafting;
import com.KhakiCraft.Subtality.init.ModItems;
import com.KhakiCraft.Subtality.init.ModTools;
import com.KhakiCraft.Subtality.proxy.CommonProxy;
import com.KhakiCraft.Subtality.worldgen.SubtalityOreGen;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)
public class Subtality 
{	
	@Instance
	public static Subtality instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static final CreativeTabs CREATIVE_TAB = new SubtalityCreativeTab();
	
	@EventHandler
	public void preInit (FMLPreInitializationEvent event)
	{
		
		ModItems.init();
		ModItems.register();
		
		ModBlocks.init();
		ModBlocks.register();
		
		ModArmour.register();
		ModArmour.init();
		
		GameRegistry.registerWorldGenerator(new SubtalityOreGen(), 0);
	}
	
	@EventHandler
	public void init (FMLInitializationEvent event)
	{
		proxy.init();
		
		ModCrafting.register();
	}
	
	@EventHandler
	public void postInit (FMLPostInitializationEvent event)
	{
		
	}
}
