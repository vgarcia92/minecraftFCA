package com.vgarcia.fcamc.block;

import com.vgarcia.fcamc.item.ModItems;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
    public static Block tutorialBlock;
    public static Block tutorial_ore;
    public static final void init() {
        GameRegistry.registerBlock(tutorialBlock = new BasicBlock("tutorialBlock", Material.iron), "tutorialBlock");
        GameRegistry.registerBlock(tutorial_ore = new ModBlockOre("tutorial_ore", Material.rock, ModItems.tutorialItem, 2, 4), "tutorial_ore");

    }
    
}
