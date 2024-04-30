package net.syd.customdiscs.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.syd.customdiscs.CustomDiscs;
import net.minecraft.item.Item;
import net.syd.customdiscs.sound.ModSounds;

public class ModItems {
    public static final Item LOBBY = registerItem("lobby",
           new MusicDiscItem(7, ModSounds.LOBBY_MUSIC, new FabricItemSettings().maxCount(1),111));
    //public static final Item OLI = registerItem("oli", new Item(new FabricItemSettings()));
    private static void addItemsToToolsItemGroup(FabricItemGroupEntries entries){
        entries.add(LOBBY);
    }
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(CustomDiscs.MOD_ID, name), item);
    }
    public static void registerModItems(){
        CustomDiscs.LOGGER.info("Registering Mod Items for "+ CustomDiscs.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addItemsToToolsItemGroup);
    }
}
