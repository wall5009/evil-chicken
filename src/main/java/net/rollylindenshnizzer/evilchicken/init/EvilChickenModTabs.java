
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.rollylindenshnizzer.evilchicken.init;

import net.rollylindenshnizzer.evilchicken.EvilChickenMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class EvilChickenModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EvilChickenMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> EVIL_CHICKEN_CREATIVE_TAB = REGISTRY.register("evil_chicken_creative_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.evil_chicken.evil_chicken_creative_tab")).icon(() -> new ItemStack(EvilChickenModItems.EVIL_CHICKEN_SPAWN_EGG.get())).displayItems((parameters, tabData) -> {
				tabData.accept(EvilChickenModItems.EVIL_CHICKEN_SPAWN_EGG.get());
			}).build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(EvilChickenModItems.EVIL_CHICKEN_SPAWN_EGG.get());
		}
	}
}
