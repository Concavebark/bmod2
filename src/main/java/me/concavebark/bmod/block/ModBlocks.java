package me.concavebark.bmod.block;

import me.concavebark.bmod.block.custom.*;
import me.concavebark.bmod.bmod;
import me.concavebark.bmod.item.ModItemGroup;
import me.concavebark.bmod.item.ModItems;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, bmod.MOD_ID);

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(ModItemGroup.PLANTABLE)));
    }

    public static final RegistryObject<Block> WEED = BLOCKS.register("weed_crop",
            () -> new WeedCrop(AbstractBlock.Properties.copy(Blocks.WHEAT)));

    public static final RegistryObject<Block> OLCROP = BLOCKS.register("ol_crop",
            () -> new OompaLoompaCrop(AbstractBlock.Properties.copy(Blocks.WHEAT)));

    public static final RegistryObject<Block> PERPCROP = BLOCKS.register("perp_crop",
            () -> new PerpCrop(AbstractBlock.Properties.copy(Blocks.WHEAT)));

    public static final RegistryObject<Block> PRESCROP = BLOCKS.register("pres_crop",
            () -> new PresCrop(AbstractBlock.Properties.copy(Blocks.WHEAT)));

    public static final RegistryObject<Block> PKCROP = BLOCKS.register("pk_crop",
            () -> new PkCrop(AbstractBlock.Properties.copy(Blocks.WHEAT)));

    public static final RegistryObject<Block> SDCROP = BLOCKS.register("sd_crop",
            () -> new SdCrop(AbstractBlock.Properties.copy(Blocks.WHEAT)));

}
