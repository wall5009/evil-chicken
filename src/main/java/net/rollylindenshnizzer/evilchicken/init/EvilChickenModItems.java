
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.rollylindenshnizzer.evilchicken.init;

import net.rollylindenshnizzer.evilchicken.EvilChickenMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;

import net.minecraft.world.item.Item;

public class EvilChickenModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(EvilChickenMod.MODID);
	public static final DeferredItem<Item> EVIL_CHICKEN_SPAWN_EGG = REGISTRY.register("evil_chicken_spawn_egg", () -> new DeferredSpawnEggItem(EvilChickenModEntities.EVIL_CHICKEN, -39322, -52429, new Item.Properties()));
	// Start of user code block custom items
	// End of user code block custom items
}
