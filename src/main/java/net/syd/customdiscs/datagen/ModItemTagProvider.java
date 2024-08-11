package net.syd.customdiscs.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.syd.customdiscs.ModTags;
import net.syd.customdiscs.item.ModItems;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ItemTags.MUSIC_DISCS)
                .add(ModItems.CORP);
        getOrCreateTagBuilder(ModTags.Items.BADGE)
                .add(ModItems.ATLAS);
        getOrCreateTagBuilder(ModTags.Items.BADGE)
                .add(ModItems.GLOVE);
        getOrCreateTagBuilder(ModTags.Items.BADGE)
                .add(ModItems.DISC);
        getOrCreateTagBuilder(ModTags.Items.BADGE)
                .add(ModItems.INDUSTRIAL);
        getOrCreateTagBuilder(ModTags.Items.BADGE)
                .add(ModItems.TRANQUIL);
        getOrCreateTagBuilder(ModTags.Items.BADGE)
                .add(ModItems.DISTORTION);
        getOrCreateTagBuilder(ModTags.Items.BADGE)
                .add(ModItems.HARMONY);
        getOrCreateTagBuilder(ModTags.Items.BADGE)
                .add(ModItems.EDGE);
        getOrCreateTagBuilder(ModTags.Items.CASINO)
                .add(ModItems.CASINOCARD);
        getOrCreateTagBuilder(ModTags.Items.VOUCHER)
                .add(ModItems.ENCCOMVOUCHER);
        getOrCreateTagBuilder(ModTags.Items.VOUCHER)
                .add(ModItems.ENCUNCVOUCHER);
        getOrCreateTagBuilder(ModTags.Items.VOUCHER)
                .add(ModItems.ENCRAREVOUCHER);
        getOrCreateTagBuilder(ModTags.Items.VOUCHER)
                .add(ModItems.ENCULTVOUCHER);
        getOrCreateTagBuilder(ModTags.Items.VOUCHER)
                .add(ModItems.MOVEVOUCHER);
        getOrCreateTagBuilder(ModTags.Items.COUNTERFEIT)
                .add(ModItems.COUNTERATLAS);
        getOrCreateTagBuilder(ModTags.Items.COUNTERFEIT)
                .add(ModItems.COUNTERGLOVE);
        getOrCreateTagBuilder(ModTags.Items.COUNTERFEIT)
                .add(ModItems.COUNTERDISC);
        getOrCreateTagBuilder(ModTags.Items.COUNTERFEIT)
                .add(ModItems.COUNTERINDUSTRIAL);
        getOrCreateTagBuilder(ModTags.Items.COUNTERFEIT)
                .add(ModItems.COUNTERTRANQUIL);
        getOrCreateTagBuilder(ModTags.Items.COUNTERFEIT)
                .add(ModItems.COUNTERDISTORTION);
        getOrCreateTagBuilder(ModTags.Items.COUNTERFEIT)
                .add(ModItems.COUNTERHARMONY);
        getOrCreateTagBuilder(ModTags.Items.COUNTERFEIT)
                .add(ModItems.COUNTEREDGE);
        getOrCreateTagBuilder(ModTags.Items.COUNTERFEIT)
                .add(ModItems.COUNTERDIAMOND);
        getOrCreateTagBuilder(ModTags.Items.COUNTERFEIT)
                .add(ModItems.COUNTERRELICCOIN);
        getOrCreateTagBuilder(ModTags.Items.CASINO)
                .add(ModItems.CASINOCOIN);
        getOrCreateTagBuilder(ModTags.Items.OTHER)
                .add(ModItems.RANGERCARD);
        getOrCreateTagBuilder(ModTags.Items.OTHER)
                .add(ModItems.GOLDGEARCARD);
        getOrCreateTagBuilder(ModTags.Items.OTHER)
                .add(ModItems.DIAMONDCHARM);
        getOrCreateTagBuilder(ModTags.Items.OTHER)
                .add(ModItems.PEARLCHARM);
        getOrCreateTagBuilder(ModTags.Items.OTHER)
                .add(ModItems.SINISTERCHARM);
        getOrCreateTagBuilder(ModTags.Items.OTHER)
                .add(ModItems.GAMMAPIN);
        getOrCreateTagBuilder(ModTags.Items.OTHER)
                .add(ModItems.MISSILEPIN);
    }
}

