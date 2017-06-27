package com.vgarcia.fcamc;

import org.lwjgl.opengl.GL11;

import com.vgarcia.fcamc.block.ModBlockOre;
import com.vgarcia.fcamc.block.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraftforge.client.event.DrawBlockHighlightEvent;

public class Formas {

	public static void circulo(World world, int x, int y, int z, int radius) {
		for (float i = 0; i < radius; i += 0.5) {
			for (float j = 0; j < 2 * Math.PI * i; j += 0.5)
				world.setBlock((int) Math.floor(x + Math.sin(j) * i), y, (int) Math.floor(z + Math.cos(j) * i),
						ModBlocks.tutorialBlock);
		}
	}
	
	public static void esfera(World world, int x, int y, int z) {
//			circulo(world, x, y, z, 4);
//			y = y+1;
//			circulo(world, x, y, z, 7);
//			y = y+1;
//			for(int i = 9; i<=14; i++){
//				circulo(world, x, y, z, i);
//				y = y+1;
//			}
//			for(int i = 0; i<4; i++){
//				circulo(world, x, y, z, 14);
//				y = y+1;
//			}
//			for(int i = 13; i>=9; i--){
//				circulo(world, x, y, z, i);
//				y = y+1;
//			}
//			circulo(world, x, y, z, 7);
//			y = y+1;
//			circulo(world, x, y, z, 4);
		circulo(world, x, y, z, 1);
		y++;
		circulo(world, x, y, z, 2);
		y++;
		circulo(world, x, y, z, 3);
		y++;
		circulo(world, x, y, z, 2);
		y++;
		circulo(world, x, y, z, 1);
		y++;
	}
	public static void drawLines(Vec3 pos1, Vec3 pos2){
		GL11.glPushMatrix();
		GL11.glPushAttrib(GL11.GL_ENABLE_BIT);
		GL11.glDisable(GL11.GL_LIGHTING);
		GL11.glDisable(GL11.GL_TEXTURE_2D);
		//you will need to supply your own position vectors
		drawLineWithGL(pos1, pos2);
		GL11.glPopAttrib();
		GL11.glPopMatrix();

	}

		private static void drawLineWithGL(Vec3 blockA, Vec3 blockB) {
			
			int d = Math.round((float)blockA.distanceTo(blockB)+0.2f);
			GL11.glColor3f(0F, 1F, 0F);
			float oz = (blockA.xCoord - blockB.xCoord == 0?0:-1f/16f);
			float ox = (blockA.zCoord - blockB.zCoord == 0?0:1f/16f);
			GL11.glBegin(GL11.GL_LINE_STRIP);

			//you will want to modify these offsets.
			GL11.glVertex3d(blockA.xCoord + 0.5,blockA.yCoord - 0.01,blockA.zCoord + 0.5);
			GL11.glVertex3d(blockB.xCoord + 0.5,blockB.yCoord - 0.01,blockB.zCoord + 0.5);

			GL11.glEnd();
		
	}
	
}
