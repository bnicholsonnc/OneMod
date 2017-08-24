package bnicholsonnc.one.init;

import bnicholsonnc.one.init.items.CustomItems;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ItemInit {
	public static Item diamond_dust;
	public static Item platinum_ingot;
	public static Item onemod_ruby;
	public static Item onemod_sapphire;

	public static void init() {
		diamond_dust = new CustomItems("diamond_dust");
		platinum_ingot = new CustomItems("platinum_ingot");
		onemod_ruby = new CustomItems("onemod_ruby");
		onemod_sapphire = new CustomItems("onemod_sapphire");
	}

	public static void register() {
		registerItem(diamond_dust);
		registerItem(platinum_ingot);
		registerItem(onemod_ruby);
		registerItem(onemod_sapphire);
	}

	public static void registerItem(Item item) {
		ForgeRegistries.ITEMS.register(item);

		ModelLoader.setCustomModelResourceLocation(item, 0,
				new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
