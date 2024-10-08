package net.syd.customdiscs;

import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Items{
        public static final TagKey<Item> BADGE =
                createTag("badges");
        public static final TagKey<Item> VOUCHER =
                createTag("vouchers");
        public static final TagKey<Item> CASINO =
                createTag("casino");
        public static final TagKey<Item> OTHER =
                createTag("other");
        public static final TagKey<Item> COUNTERFEIT =
                createTag("counterfeit");
        private static TagKey<Item> createTag(String name){
            return TagKey.of(RegistryKeys.ITEM, new Identifier(CustomDiscs.MOD_ID, name));
        }
    }
}
