package net.syd.customdiscs.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.syd.customdiscs.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }
    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.LOBBY, Models.GENERATED);
        itemModelGenerator.register(ModItems.TECHNO, Models.GENERATED);
        itemModelGenerator.register(ModItems.CAFE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CORP, Models.GENERATED);
        itemModelGenerator.register(ModItems.GYMBATTLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CASTLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.OLIBATTLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SHINYVOUCHER, Models.GENERATED);
        itemModelGenerator.register(ModItems.MOVESETVOUCHER, Models.GENERATED);
        itemModelGenerator.register(ModItems.EVVOUCHER, Models.GENERATED);
        itemModelGenerator.register(ModItems.IVVOUCHER, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENCCOMVOUCHER, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENCRAREVOUCHER, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENCULTVOUCHER, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENCUNCVOUCHER, Models.GENERATED);
    }
}
