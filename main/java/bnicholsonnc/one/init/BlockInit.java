package bnicholsonnc.one.init;

import bnicholsonnc.one.One;
import bnicholsonnc.one.Ref;
import bnicholsonnc.one.init.blocks.CustomOre;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockInit {
	public static Block platinum_ore;
	public static Block platinum_block;
	
	public static void init(){
		platinum_ore = new CustomOre("platinum_ore", 2.0F, 4.0F, 2);
		platinum_block = new CustomOre("platinum_block", 2.0F, 4.0F, 2);
	}
	
	public static void register(){
		registerBlock(platinum_ore);
		registerBlock(platinum_block);
	}
	
	public static void registerBlock(Block block){
		ForgeRegistries.BLOCKS.register(block);
		block.setCreativeTab(One.onetab);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		ForgeRegistries.ITEMS.register(item);
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, 
				new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}
