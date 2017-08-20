package bnicholsonnc.one.init.tools;

import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;

public class CustomHoe extends ItemHoe {

	public CustomHoe(String name, ToolMaterial material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
	}

}
