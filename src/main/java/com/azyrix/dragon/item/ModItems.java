package com.azyrix.dragon.item;

import com.azyrix.dragon.DragonsReforged;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DragonsReforged.MOD_ID);

    public static final RegistryObject<Item> MELTED_OCEAN_SCALES = ITEMS.register("melted_ocean_scales",
            ()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TRANSPORTATION).stacksTo(16).fireResistant().defaultDurability(100)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
