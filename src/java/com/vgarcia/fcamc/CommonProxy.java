package com.vgarcia.fcamc;

import com.vgarcia.fcamc.block.ModBlocks;
import com.vgarcia.fcamc.item.ModItems;
import com.vgarcia.fcamc.world.ModWorldGen;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.world.gen.ChunkProviderFlat;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.gradle.*;
public class CommonProxy {

	public void preInit(FMLPreInitializationEvent e) {
		System.out.println("000000000000000000000000000000000000000000000000000000 0 Creating Custom Item...");
		
		ModItems.init();
		ModBlocks.init();
	}

	public void init(FMLInitializationEvent e) {
		System.out.println("______________________________________ Creating Custom Custom Map...");
		//GameRegistry.registerWorldGenerator(new ModWorldGen(), 0);
		ModWorldGen wGen = new ModWorldGen();
		
		GameRegistry.registerWorldGenerator(wGen, 0);
		

	}

	public void postInit(FMLPostInitializationEvent e) {

	}
}