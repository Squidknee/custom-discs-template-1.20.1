package net.syd.customdiscs.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.syd.customdiscs.CustomDiscs;

public class ModItemGroups {
    public static final ItemGroup CUSTOM_DISCS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(CustomDiscs.MOD_ID, "customdiscs"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.customdisc"))
                    .icon(()-> new ItemStack(ModItems.LOBBY)).entries((displayContext, entries) -> {
                        entries.add(ModItems.ATLAS);
                        entries.add(ModItems.GLOVE);
                        entries.add(ModItems.DISC);
                        entries.add(ModItems.INDUSTRIAL);
                        entries.add(ModItems.TRANQUIL);
                        entries.add(ModItems.DISTORTION);
                        entries.add(ModItems.HARMONY);
                        entries.add(ModItems.EDGE);
                        entries.add(ModItems.LOBBY);
                        entries.add(ModItems.TECHNO);
                        entries.add(ModItems.CAFE);
                        entries.add(ModItems.CORP);
                        entries.add(ModItems.CASTLE);
                        entries.add(ModItems.GYMBATTLE);
                        entries.add(ModItems.OLIBATTLE);
                        entries.add(ModItems.SHINYVOUCHER);
                        entries.add(ModItems.MOVESETVOUCHER);
                        entries.add(ModItems.IVVOUCHER);
                        entries.add(ModItems.EVVOUCHER);
                        entries.add(ModItems.ENCCOMVOUCHER);
                        entries.add(ModItems.ENCRAREVOUCHER);
                        entries.add(ModItems.ENCULTVOUCHER);
                        entries.add(ModItems.ENCUNCVOUCHER);
                        entries.add(ModItems.CASINOCARD);
                    }).build());
    public static void registerItemGroups(){
        CustomDiscs.LOGGER.info("Registering Item Groups for " + CustomDiscs.MOD_ID);
    }
}
