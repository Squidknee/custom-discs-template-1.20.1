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
        itemModelGenerator.register(ModItems.CORP, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENCCOMVOUCHER, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENCRAREVOUCHER, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENCULTVOUCHER, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENCUNCVOUCHER, Models.GENERATED);
        itemModelGenerator.register(ModItems.MOVEVOUCHER, Models.GENERATED);
        itemModelGenerator.register(ModItems.CASINOCOIN, Models.GENERATED);
        itemModelGenerator.register(ModItems.RANGERCARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLDGEARCARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.DIAMONDCHARM, Models.GENERATED);
        itemModelGenerator.register(ModItems.PEARLCHARM, Models.GENERATED);
        itemModelGenerator.register(ModItems.SINISTERCHARM, Models.GENERATED);
        itemModelGenerator.register(ModItems.GAMMAPIN, Models.GENERATED);
        itemModelGenerator.register(ModItems.MISSILEPIN, Models.GENERATED);
        itemModelGenerator.register(ModItems.COUNTERRELICCOIN, Models.GENERATED);
        itemModelGenerator.register(ModItems.COUNTERDIAMOND, Models.GENERATED);
        itemModelGenerator.register(ModItems.COUNTERATLAS, Models.GENERATED);
        itemModelGenerator.register(ModItems.COUNTERGLOVE, Models.GENERATED);
        itemModelGenerator.register(ModItems.COUNTERDISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.COUNTERINDUSTRIAL, Models.GENERATED);
        itemModelGenerator.register(ModItems.COUNTERTRANQUIL, Models.GENERATED);
        itemModelGenerator.register(ModItems.COUNTERDISTORTION, Models.GENERATED);
        itemModelGenerator.register(ModItems.COUNTERHARMONY, Models.GENERATED);
        itemModelGenerator.register(ModItems.COUNTEREDGE, Models.GENERATED);
    }
}

