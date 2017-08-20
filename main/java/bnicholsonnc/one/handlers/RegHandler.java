package bnicholsonnc.one.handlers;

import bnicholsonnc.one.init.ArmorInit;
import bnicholsonnc.one.init.BlockInit;
import bnicholsonnc.one.init.ItemInit;
import bnicholsonnc.one.init.ToolInit;

public class RegHandler {
	public static void Client() {
		RecHandler.registerCrafting();
		RecHandler.registerSmelting();
	}

	public static void Common() {
		ItemInit.init();
		ItemInit.register();
		BlockInit.init();
		BlockInit.register();
		ToolInit.init();
		ToolInit.register();
		ArmorInit.init();
		ArmorInit.register();
	}
}
