package net.syd.customdiscs;

import net.fabricmc.api.ModInitializer;

import net.syd.customdiscs.item.ModItemGroups;
import net.syd.customdiscs.item.ModItems;
import net.syd.customdiscs.sound.ModSounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomDiscs implements ModInitializer {

    public static final String MOD_ID = "customdiscs";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModSounds.registerSounds();
	}
}