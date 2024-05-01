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
    public static final Item TECHNO = registerItem("techno",
            new MusicDiscItem(7, ModSounds.TECHNO_MUSIC, new FabricItemSettings().maxCount(1),50));

    public static final Item CAFE = registerItem("cafe",
            new MusicDiscItem(7, ModSounds.CAFE_MUSIC, new FabricItemSettings().maxCount(1),160));
    public static final Item CHEESE = registerItem("cheese",
            new MusicDiscItem(7, ModSounds.CHEESE_MUSIC, new FabricItemSettings().maxCount(1),142));
    public static final Item CORP = registerItem("corp",
            new MusicDiscItem(7, ModSounds.CORP_MUSIC, new FabricItemSettings().maxCount(1),110));
    public static final Item CASTLE = registerItem("castle",
            new MusicDiscItem(7, ModSounds.CASTLE_MUSIC, new FabricItemSettings().maxCount(1),111));
    public static final Item GYMBATTLE = registerItem("gymbattle",
            new MusicDiscItem(7, ModSounds.GYMBATTLE_MUSIC, new FabricItemSettings().maxCount(1),180));
    public static final Item OLIBATTLE = registerItem("olibattle",
            new MusicDiscItem(7, ModSounds.OLIBATTLE_MUSIC, new FabricItemSettings().maxCount(1),163));

    public static final Item ATLAS = registerItem("atlas", new Item(new FabricItemSettings()));
    public static final Item GLOVE = registerItem("glove", new Item(new FabricItemSettings()));
    public static final Item DISC = registerItem("disc", new Item(new FabricItemSettings()));
    public static final Item INDUSTRIAL = registerItem("industrial", new Item(new FabricItemSettings()));
    public static final Item TRANQUIL = registerItem("tranquil", new Item(new FabricItemSettings()));
    public static final Item DISTORTION = registerItem("distortion", new Item(new FabricItemSettings()));
    public static final Item HARMONY = registerItem("harmony", new Item(new FabricItemSettings()));
    public static final Item EDGE = registerItem("edge", new Item(new FabricItemSettings()));

    private static void addItemsToToolsItemGroup(FabricItemGroupEntries entries){
        entries.add(ATLAS);
        entries.add(GLOVE);
        entries.add(DISC);
        entries.add(INDUSTRIAL);
        entries.add(TRANQUIL);
        entries.add(DISTORTION);
        entries.add(HARMONY);
        entries.add(EDGE);
        entries.add(LOBBY);
        entries.add(TECHNO);
        entries.add(CAFE);
        entries.add(CHEESE);
        entries.add(CORP);
        entries.add(CASTLE);
        entries.add(GYMBATTLE);
        entries.add(OLIBATTLE);
    }
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(CustomDiscs.MOD_ID, name), item);
    }
    public static void registerModItems(){
        CustomDiscs.LOGGER.info("Registering Mod Items for "+ CustomDiscs.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addItemsToToolsItemGroup);
    }
}
