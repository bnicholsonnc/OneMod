package bnicholsonnc.one.handlers;

import bnicholsonnc.one.init.ItemInit;

public class RegHandler {
	public static void Client() {
		
	}

	public static void Common() {
		ItemInit.init();
		ItemInit.register();
	}
}
