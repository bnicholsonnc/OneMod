package bnicholsonnc.one;

import bnicholsonnc.one.proxy.CommonProxy;
import bnicholsonnc.one.tabs.OneTab;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Ref.MODID, name = Ref.NAME, version = Ref.VERSION)
public class One {
	public static final CreativeTabs onetab = new OneTab("onetab");
	
	@SidedProxy(clientSide = Ref.CLIENTPROXY, serverSide = Ref.COMMONPROXY)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {
		proxy.preInit(event);
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event) {
		proxy.init(event);
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}
}
