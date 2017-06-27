package com.vgarcia.fcamc.world;

import java.util.Random;

import org.lwjgl.opengl.GL11;

import com.vgarcia.fcamc.Formas;
import com.vgarcia.fcamc.block.ModBlocks;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.WorldChunkManager;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.ChunkProviderFlat;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;

public class ModWorldGen implements IWorldGenerator {
	

	//private IChunkProvider flat = new ChunkProviderFlat(null, 0, false, null);
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
	
//		world.setBlock(10, 10, 10, ModBlocks.tutorial_ore);
//		world.setBlock(5, 20, 5, ModBlocks.tutorialBlock);
//		world.setBlock(15, 20, 15, ModBlocks.tutorialBlock);
//		world.setBlock(5, 30, 10, ModBlocks.tutorialBlock);
//		world.setBlock(12, 30, 15, ModBlocks.tutorialBlock);
//		world.setBlock(13, 30, 5, ModBlocks.tutorialBlock);
		;
		Formas.esfera(world, 50, 50,50);
		Formas.esfera(world, 0,100,50);
		Formas.esfera(world, 50,100,0);
		Formas.esfera(world, 50,150,100);
		Formas.esfera(world, 33,150,33);
		Formas.esfera(world, 66,150,33);
		
//		world.setBlock(5, 40, 5, ModBlocks.tutorialBlock);
//		world.setBlock(15, 40, 15, ModBlocks.tutorialBlock);
//
//		world.setBlock(10, 50, 10, ModBlocks.tutorial_ore);
		
//		GL11.glPushAttrib(GL11.GL_ENABLE_BIT);
//	    GL11.glDisable(GL11.GL_CULL_FACE);
//	    GL11.glDisable(GL11.GL_LIGHTING);
//	    GL11.glDisable(GL11.GL_TEXTURE_2D);
//
//	    GL11.glEnable(GL11.GL_BLEND);
//	    GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
//	    GL11.glColor4f(40.f,40.f,40.f, 40.f);   // change this for your colour
//	    GL11.glLineWidth(2.0F);
//	    GL11.glDepthMask(false);
//
//	    Tessellator tessellator = Tessellator.instance;
//	    tessellator.startDrawing(GL11.GL_LINES);
//	    tessellator.addVertex(5, 5, 20);
//	    tessellator.addVertex(15, 15, 20);
//	    tessellator.draw();
//
//	    GL11.glDepthMask(true);
//	    GL11.glPopAttrib();
		world.setSpawnLocation(0, 0,0);
	
		switch (world.provider.dimensionId) {
	    case 0: //Overworld
	    	 //this.runGenerator(this.gen_tutorial_ore, world, random, chunkX, chunkZ, 20, 0, 64);
	    	 //this.runGenerator(this.gen_tutorial_ore, world, random, chunkX, chunkZ, 20, 0, 64);
		        break;
	    case -1: //Nether

	        break;
	    case 1: //End
	        //this.runGenerator(this.gen_cobblestone, world, random, chunkX, chunkZ, 10, 0, 80);
	        break;
	    }
	}
	private WorldGenerator gen_tutorial_ore; //Generates Tutorial Ore (used in Overworld)
	private WorldGenerator gen_cobblestone; //Generates Cobblestone (used in End)
	public ModWorldGen() {
	    this.gen_tutorial_ore = new WorldGenMinable(ModBlocks.tutorial_ore, 8);
	    //this.gen_cobblestone = new WorldGenMinable(Blocks.cobblestone, 16, Blocks.end_stone);
	}
	private void runGenerator(WorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int chancesToSpawn, int minHeight, int maxHeight) {
	    if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
	        throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");

	    int heightDiff = maxHeight - minHeight + 1;
	    for (int i = 0; i < chancesToSpawn; i ++) {
	        int x = chunk_X * 16 + rand.nextInt(16);
	        int y = minHeight + rand.nextInt(heightDiff);
	        int z = chunk_Z * 16 + rand.nextInt(16);
	        generator.generate(world, rand, x, y, z);

	    }
	}
}