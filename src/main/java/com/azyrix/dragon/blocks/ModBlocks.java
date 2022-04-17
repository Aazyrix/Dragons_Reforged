package com.azyrix.dragon.blocks;

import com.azyrix.dragon.DragonsReforged;
import com.azyrix.dragon.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
        public static final DeferredRegister<Block> BLOCKs =
                DeferredRegister.create(ForgeRegistries.BLOCKS, DragonsReforged.MOD_ID);

        public static final RegistryObject<Block> COBALT_BLOCK = registerBlock("cobalt_block",
                () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);



        private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
            RegistryObject<T> toReturn = BLOCKs.register(name, block);
            registerBlockItem(name, toReturn, tab);
            return toReturn;
        }

        private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {

            return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                    new Item.Properties().tab(tab)));
        }

        public static void register(IEventBus eventbus) {
            BLOCKs.register(eventbus);
        }

    }

