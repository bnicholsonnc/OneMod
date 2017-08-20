package bnicholsonnc.one.init;

import bnicholsonnc.one.init.items.CustomItems;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ItemInit {
	public static Item platinum_ingot;
	
	public static void init(){
		platinum_ingot = new CustomItems("platinum_ingot");
	}
	
	public static void register(){
		registerItem(platinum_ingot);
	}
	
	public static void registerItem(Item item){
		ForgeRegistries.ITEMS.register(item);
		
		ModelLoader.setCustomModelResourceLocation(item, 0, 
				new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
