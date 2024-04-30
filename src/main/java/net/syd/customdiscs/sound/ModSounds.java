package net.syd.customdiscs.sound;

import net.minecraft.util.Identifier;
import net.syd.customdiscs.CustomDiscs;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.sound.SoundEvent;

public class ModSounds {
    public static final SoundEvent LOBBY_MUSIC = registerSoundEvent("lobby_music");
    public static final SoundEvent TECHNO_MUSIC = registerSoundEvent("techno_music");
    public static final SoundEvent CAFE_MUSIC = registerSoundEvent("cafe_music");
    public static final SoundEvent CHEESE_MUSIC = registerSoundEvent("cheese_music");
    public static final SoundEvent CORP_MUSIC = registerSoundEvent("corp_music");
    public static final SoundEvent GYMBATTLE_MUSIC = registerSoundEvent("gymbattle_music");
    public static final SoundEvent CASTLE_MUSIC = registerSoundEvent("castle_music");
    public static final SoundEvent OLIBATTLE_MUSIC = registerSoundEvent("olibattle_music");

    private static SoundEvent registerSoundEvent(String name){
        Identifier id = new Identifier(CustomDiscs.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }
    public static void registerSounds(){ CustomDiscs.LOGGER.info("Registering Sounds for " + CustomDiscs.MOD_ID);}
}


