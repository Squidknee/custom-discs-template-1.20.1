package net.syd.customdiscs.item;

import net.fabricmc.fabric.api.blockview.v2.FabricBlockView;
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
    public static final Item CORP = registerItem("corp",
            new MusicDiscItem(7, ModSounds.CORP_MUSIC, new FabricItemSettings().maxCount(1),110));

    public static final Item ATLAS = registerItem("atlas", new Item(new FabricItemSettings()));
    public static final Item GLOVE = registerItem("glove", new Item(new FabricItemSettings()));
    public static final Item DISC = registerItem("disc", new Item(new FabricItemSettings()));
    public static final Item INDUSTRIAL = registerItem("industrial", new Item(new FabricItemSettings()));
    public static final Item TRANQUIL = registerItem("tranquil", new Item(new FabricItemSettings()));
    public static final Item DISTORTION = registerItem("distortion", new Item(new FabricItemSettings()));
    public static final Item HARMONY = registerItem("harmony", new Item(new FabricItemSettings()));
    public static final Item EDGE = registerItem("edge", new Item(new FabricItemSettings()));
    public static final Item ENCUNCVOUCHER = registerItem("enc_unc_voucher", new Item(new FabricItemSettings()));
    public static final Item ENCULTVOUCHER = registerItem("enc_ult_voucher", new Item(new FabricItemSettings()));
    public static final Item ENCRAREVOUCHER = registerItem("enc_rare_voucher", new Item(new FabricItemSettings()));
    public static final Item ENCCOMVOUCHER = registerItem("enc_com_voucher", new Item(new FabricItemSettings()));

    public static final Item MOVEVOUCHER = registerItem("move_voucher", new Item(new FabricItemSettings()));

    public static final Item CASINOCOIN = registerItem("casino_coin", new Item(new FabricItemSettings()));
    public static final Item CASINOCARD = registerItem("casino_card", new Item(new FabricItemSettings()));
    public static final Item RANGERCARD = registerItem("ranger_card", new Item(new FabricItemSettings()));
    public static final Item GOLDGEARCARD = registerItem("goldgear_card", new Item(new FabricItemSettings()));

    public static final Item DIAMONDCHARM = registerItem("diamond_charm", new Item(new FabricItemSettings()));
    public static final Item PEARLCHARM = registerItem("pearl_charm", new Item(new FabricItemSettings()));
    public static final Item SINISTERCHARM = registerItem("sinister_charm", new Item(new FabricItemSettings()));

    public static final Item GAMMAPIN = registerItem("gamma_pin", new Item(new FabricItemSettings()));
    public static final Item MISSILEPIN = registerItem("missile_pin", new Item(new FabricItemSettings()));

    public static final Item COUNTERRELICCOIN = registerItem("counter_relic_coin", new Item(new FabricItemSettings()));
    public static final Item COUNTERDIAMOND = registerItem("counter_diamond", new Item(new FabricItemSettings()));

    public static final Item COUNTERATLAS = registerItem("counter_atlas", new Item(new FabricItemSettings()));
    public static final Item COUNTERGLOVE = registerItem("counter_glove", new Item(new FabricItemSettings()));
    public static final Item COUNTERDISC = registerItem("counter_disc", new Item(new FabricItemSettings()));
    public static final Item COUNTERINDUSTRIAL = registerItem("counter_industrial", new Item(new FabricItemSettings()));
    public static final Item COUNTERTRANQUIL = registerItem("counter_tranquil", new Item(new FabricItemSettings()));
    public static final Item COUNTERDISTORTION = registerItem("counter_distortion", new Item(new FabricItemSettings()));
    public static final Item COUNTERHARMONY = registerItem("counter_harmony", new Item(new FabricItemSettings()));
    public static final Item COUNTEREDGE = registerItem("counter_edge", new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(CustomDiscs.MOD_ID, name), item);
    }
    public static void registerModItems(){
        CustomDiscs.LOGGER.info("Registering Mod Items for "+ CustomDiscs.MOD_ID);
    }
}
