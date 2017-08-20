package bnicholsonnc.one.init.items;

import bnicholsonnc.one.One;
import net.minecraft.item.Item;

public class CustomItems extends Item {
	public CustomItems(String name){
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(One.onetab);
	}
}
