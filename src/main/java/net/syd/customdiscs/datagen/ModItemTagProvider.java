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
                .add(ModItems.LOBBY);
        getOrCreateTagBuilder(ItemTags.MUSIC_DISCS)
                .add(ModItems.TECHNO);
        getOrCreateTagBuilder(ItemTags.MUSIC_DISCS)
                .add(ModItems.CHEESE);
        getOrCreateTagBuilder(ItemTags.MUSIC_DISCS)
                .add(ModItems.CAFE);
        getOrCreateTagBuilder(ItemTags.MUSIC_DISCS)
                .add(ModItems.CORP);
        getOrCreateTagBuilder(ItemTags.MUSIC_DISCS)
                .add(ModItems.GYMBATTLE);
        getOrCreateTagBuilder(ItemTags.MUSIC_DISCS)
                .add(ModItems.CASTLE);
        getOrCreateTagBuilder(ItemTags.MUSIC_DISCS)
                .add(ModItems.OLIBATTLE);
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
    }
}
