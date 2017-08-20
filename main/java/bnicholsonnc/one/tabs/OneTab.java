package bnicholsonnc.one.tabs;

import bnicholsonnc.one.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class OneTab extends CreativeTabs {
	public OneTab(String label){
		super("onetab");
		this.setBackgroundImageName("onetab.png");
	}
	
	@Override
	public ItemStack getTabIconItem(){
		return new ItemStack(ItemInit.platinum_ingot);
	}
}
