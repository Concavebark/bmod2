package me.concavebark.bmod.item;

import me.concavebark.bmod.block.ModBlocks;
import me.concavebark.bmod.bmod;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, bmod.MOD_ID);

    // TODO: Seeds

    // TODO: Strains

    // Blunts
    public static final RegistryObject<Item> ROLLING_PAPERS = ITEMS.register("rpapers", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> BLUNT = ITEMS.register("blunt", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_FOOD)));
    public static final RegistryObject<Item> OOMPA_LOOMPA_BLUNT = ITEMS.register("olblunt", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_FOOD)));
    public static final RegistryObject<Item> PERP_BLUNT = ITEMS.register("perpblunt", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_FOOD)));
    public static final RegistryObject<Item> PRES_BLUNT = ITEMS.register("presblunt", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_FOOD)));
    public static final RegistryObject<Item> P_K_BLUNT = ITEMS.register("pkblunt", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_FOOD)));
    public static final RegistryObject<Item> S_D_BLUNT = ITEMS.register("sdblunt", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_FOOD)));

    // Edibles
    public static final RegistryObject<Item> EDIBLE_COOKIE = ITEMS.register("ecookie", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_FOOD)));
    public static final RegistryObject<Item> BUTTER = ITEMS.register("butter", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_FOOD)));
    public static final RegistryObject<Item> DOUGH = ITEMS.register("dough", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_FOOD)));
    public static final RegistryObject<Item> I_BUTTER = ITEMS.register("ibutter", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_FOOD)));
    public static final RegistryObject<Item> R_NUGS = ITEMS.register("rnugs", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_FOOD)));
    public static final RegistryObject<Item> NUGS = ITEMS.register("nugs", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_FOOD)));
    public static final RegistryObject<Item> R_I_NUGS = ITEMS.register("rinugs", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_FOOD)));
    public static final RegistryObject<Item> I_NUGS = ITEMS.register("inugs", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_FOOD)));
    public static final RegistryObject<Item> R_I_CHOPS = ITEMS.register("richops", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_FOOD)));
    public static final RegistryObject<Item> I_CHOPS = ITEMS.register("ichops", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_FOOD)));
    public static final RegistryObject<Item> R_I_TATO = ITEMS.register("ritato", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_FOOD)));
    public static final RegistryObject<Item> I_TATO = ITEMS.register("itato", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_FOOD)));

    public static final RegistryObject<Item> OATS = ITEMS.register("oats",
            () -> new BlockItem(ModBlocks.OATS.get(),
                    new Item.Properties().food(
                                    new Food.Builder().nutrition(1).saturationMod(0.1f).fast().build())
                            .tab(ModItemGroup.BMOD_GROUP)));


    public static void register(IEventBus eventBus){

        ITEMS.register(eventBus);
    }
}
