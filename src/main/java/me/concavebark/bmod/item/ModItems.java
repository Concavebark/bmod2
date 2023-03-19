package me.concavebark.bmod.item;

import me.concavebark.bmod.bmod;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, bmod.MOD_ID);

    public static final RegistryObject<Item> BLUNT = ITEMS.register("blunt", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_FOOD)));

    public static void register(IEventBus eventBus){

        ITEMS.register(eventBus);
    }
}
