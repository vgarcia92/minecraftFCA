package com.vgarcia.fcamc.item;

import com.vgarcia.fcamc.Main;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public final class ModItems {

    public static Item tutorialItem;

    public static final void init() {
    	 tutorialItem = new Item().setUnlocalizedName("tutorialItem").setCreativeTab(CreativeTabs.tabMisc).setTextureName(Main.MODID + ":tutorialItem");
    	 GameRegistry.registerItem(tutorialItem = new Item()
    		        .setUnlocalizedName("tutorial_item")
    		        .setTextureName(Main.MODID + ":" + "tutorial_item")
    		        .setCreativeTab(CreativeTabs.tabMaterials)
    		        , "tutorialItem");
    }
}