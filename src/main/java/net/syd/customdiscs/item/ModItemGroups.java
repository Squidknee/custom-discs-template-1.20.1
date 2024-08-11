package net.syd.customdiscs.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.syd.customdiscs.CustomDiscs;
//import net.syd.customdiscs.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup CUSTOM_DISCS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(CustomDiscs.MOD_ID, "customdiscs"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.customdisc"))
                    .icon(()-> new ItemStack(ModItems.CORP)).entries((displayContext, entries) -> {
                        entries.add(ModItems.ATLAS);
                        entries.add(ModItems.GLOVE);
                        entries.add(ModItems.DISC);
                        entries.add(ModItems.INDUSTRIAL);
                        entries.add(ModItems.TRANQUIL);
                        entries.add(ModItems.DISTORTION);
                        entries.add(ModItems.HARMONY);
                        entries.add(ModItems.EDGE);
                        entries.add(ModItems.CORP);
                        entries.add(ModItems.COUNTERATLAS);
                        entries.add(ModItems.COUNTERGLOVE);
                        entries.add(ModItems.COUNTERDISC);
                        entries.add(ModItems.COUNTERINDUSTRIAL);
                        entries.add(ModItems.COUNTERTRANQUIL);
                        entries.add(ModItems.COUNTERDISTORTION);
                        entries.add(ModItems.COUNTERHARMONY);
                        entries.add(ModItems.COUNTEREDGE);
                        entries.add(ModItems.ENCCOMVOUCHER);
                        entries.add(ModItems.ENCRAREVOUCHER);
                        entries.add(ModItems.ENCULTVOUCHER);
                        entries.add(ModItems.ENCUNCVOUCHER);
                        entries.add(ModItems.MOVEVOUCHER);
                        entries.add(ModItems.CASINOCARD);
                        entries.add(ModItems.CASINOCOIN);
                        entries.add(ModItems.RANGERCARD);
                        entries.add(ModItems.GOLDGEARCARD);
                        entries.add(ModItems.DIAMONDCHARM);
                        entries.add(ModItems.PEARLCHARM);
                        entries.add(ModItems.SINISTERCHARM);
                        entries.add(ModItems.GAMMAPIN);
                        entries.add(ModItems.MISSILEPIN);
                        entries.add(ModItems.COUNTERRELICCOIN);
                        entries.add(ModItems.COUNTERDIAMOND);
                       // entries.add(ModBlocks.SlotMachineBlock);
                    }).build());
    public static void registerItemGroups(){
        CustomDiscs.LOGGER.info("Registering Item Groups for " + CustomDiscs.MOD_ID);
    }
}

