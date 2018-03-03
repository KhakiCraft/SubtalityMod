package com.KhakiCraft.Subtality.proxy;

import com.KhakiCraft.Subtality.init.ModArmour;
import com.KhakiCraft.Subtality.init.ModBlocks;
import com.KhakiCraft.Subtality.init.ModItems;

public class ClientProxy implements CommonProxy {

	@Override
	public void init() {
		ModItems.registerRenders();
		ModBlocks.registerRenders();
		ModArmour.registerRenders();
		
	}

}
