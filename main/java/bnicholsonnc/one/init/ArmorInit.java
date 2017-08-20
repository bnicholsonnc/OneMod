package bnicholsonnc.one.init;

import bnicholsonnc.one.Ref;
import bnicholsonnc.one.init.armor.CustomArmor;
import bnicholsonnc.one.init.items.CustomItems;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ArmorInit {
	
	public static final ArmorMaterial platinum_armor = EnumHelper.addArmorMaterial
			("platinum", Ref.MODID + ":platinum", 33, new int[]{3, 6, 8, 3}, 10, 
					SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
	
	public static Item platinum_helmet, platinum_chestplate, platinum_leggings, platinum_boots;

	public static void init() {
		platinum_helmet = new CustomArmor("platinum_helmet", platinum_armor, 1, EntityEquipmentSlot.HEAD);
		platinum_chestplate = new CustomArmor("platinum_chestplate", platinum_armor, 1, EntityEquipmentSlot.CHEST);
		platinum_leggings = new CustomArmor("platinum_leggings", platinum_armor, 2, EntityEquipmentSlot.LEGS);
		platinum_boots = new CustomArmor("platinum_boots", platinum_armor, 1, EntityEquipmentSlot.FEET);
	}

	public static void register() {
		registerItem(platinum_helmet);
		registerItem(platinum_chestplate);
		registerItem(platinum_leggings);
		registerItem(platinum_boots);
	}

	public static void registerItem(Item item) {
		ForgeRegistries.ITEMS.register(item);

		ModelLoader.setCustomModelResourceLocation(item, 0,
				new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}