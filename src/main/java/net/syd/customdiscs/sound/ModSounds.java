package net.syd.customdiscs.sound;

import net.minecraft.util.Identifier;
import net.syd.customdiscs.CustomDiscs;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.sound.SoundEvent;

public class ModSounds {
    public static final SoundEvent LOBBY_MUSIC = registerSoundEvent("lobby_music");
    private static SoundEvent registerSoundEvent(String name){
        Identifier id = new Identifier(CustomDiscs.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }
    public static void registerSounds(){ CustomDiscs.LOGGER.info("Registering Sounds for " + CustomDiscs.MOD_ID);}
}


