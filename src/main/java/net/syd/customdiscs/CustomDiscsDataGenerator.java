package net.syd.customdiscs;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.syd.customdiscs.datagen.ModItemTagProvider;
import net.syd.customdiscs.datagen.ModModelProvider;
import net.syd.customdiscs.datagen.ModPoiTagProvider;

public class CustomDiscsDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModItemTagProvider::new);
		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModPoiTagProvider::new);
	}
}
