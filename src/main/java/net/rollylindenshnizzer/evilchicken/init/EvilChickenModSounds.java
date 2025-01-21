
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.rollylindenshnizzer.evilchicken.init;

import net.rollylindenshnizzer.evilchicken.EvilChickenMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class EvilChickenModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, EvilChickenMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> AMBIENTCHICKEN = REGISTRY.register("ambientchicken", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("evil_chicken", "ambientchicken")));
}
