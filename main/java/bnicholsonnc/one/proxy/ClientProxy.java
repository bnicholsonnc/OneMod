package bnicholsonnc.one.proxy;

import bnicholsonnc.one.handlers.RegHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy{
	public void preInit(FMLPreInitializationEvent event) {
		super.preInit(event);
	}

	public void init(FMLInitializationEvent event) {
		super.init(event);
		RegHandler.Client();
	}

	public void postInit(FMLPostInitializationEvent event) {
		super.postInit(event);
	}
}
