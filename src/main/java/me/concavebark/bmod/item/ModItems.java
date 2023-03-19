package me.concavebark.bmod.item;

import me.concavebark.bmod.block.ModBlocks;
import me.concavebark.bmod.bmod;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, bmod.MOD_ID);

    // Seeds
    // TODO: Localize and make model files
    public static final RegistryObject<Item> REG_SEED = ITEMS.register("regseeds", () -> new Item(new Item.Properties().tab(ModItemGroup.PLANTABLE)));
    public static final RegistryObject<Item> PERP_SEED = ITEMS.register("perpseeds", () -> new Item(new Item.Properties().tab(ModItemGroup.PLANTABLE)));
    public static final RegistryObject<Item> PRES_SEED = ITEMS.register("presseeds", () -> new Item(new Item.Properties().tab(ModItemGroup.PLANTABLE)));
    public static final RegistryObject<Item> OL_SEED = ITEMS.register("olseeds", () -> new Item(new Item.Properties().tab(ModItemGroup.PLANTABLE)));
    public static final RegistryObject<Item> PK_SEED = ITEMS.register("pkseeds", () -> new Item(new Item.Properties().tab(ModItemGroup.PLANTABLE)));
    public static final RegistryObject<Item> SD_SEED = ITEMS.register("sdseeds", () -> new Item(new Item.Properties().tab(ModItemGroup.PLANTABLE)));

    // Strains
    // TODO: Localize and make model files
    public static final RegistryObject<Item> REG_WEED = ITEMS.register("regweed", () -> new Item(new Item.Properties().tab(ModItemGroup.PLANTABLE)));
    public static final RegistryObject<Item> PERP_WEED = ITEMS.register("perpweed", () -> new Item(new Item.Properties().tab(ModItemGroup.PLANTABLE)));
    public static final RegistryObject<Item> PRES_WEED = ITEMS.register("presweed", () -> new Item(new Item.Properties().tab(ModItemGroup.PLANTABLE)));
    public static final RegistryObject<Item> OL_WEED = ITEMS.register("olweed", () -> new Item(new Item.Properties().tab(ModItemGroup.PLANTABLE)));
    public static final RegistryObject<Item> PK_WEED = ITEMS.register("pkweed", () -> new Item(new Item.Properties().tab(ModItemGroup.PLANTABLE)));
    public static final RegistryObject<Item> SD_WEED = ITEMS.register("sdweed", () -> new Item(new Item.Properties().tab(ModItemGroup.PLANTABLE)));

    // Blunts
    public static final RegistryObject<Item> ROLLING_PAPERS = ITEMS.register("rpapers", () -> new Item(new Item.Properties().tab(ModItemGroup.SMOKEABLE)));
    public static final RegistryObject<Item> REG_BLUNT = ITEMS.register("blunt", () -> new Item(new Item.Properties().tab(ModItemGroup.SMOKEABLE)));
    public static final RegistryObject<Item> OOMPA_LOOMPA_BLUNT = ITEMS.register("olblunt", () -> new Item(new Item.Properties().tab(ModItemGroup.SMOKEABLE)));
    public static final RegistryObject<Item> PERP_BLUNT = ITEMS.register("perpblunt", () -> new Item(new Item.Properties().tab(ModItemGroup.SMOKEABLE)));
    public static final RegistryObject<Item> PRES_BLUNT = ITEMS.register("presblunt", () -> new Item(new Item.Properties().tab(ModItemGroup.SMOKEABLE)));
    public static final RegistryObject<Item> PK_BLUNT = ITEMS.register("pkblunt", () -> new Item(new Item.Properties().tab(ModItemGroup.SMOKEABLE)));
    public static final RegistryObject<Item> SD_BLUNT = ITEMS.register("sdblunt", () -> new Item(new Item.Properties().tab(ModItemGroup.SMOKEABLE)));

    // Edibles
    public static final RegistryObject<Item> EDIBLE_COOKIE = ITEMS.register("ecookie", () -> new Item(new Item.Properties().tab(ModItemGroup.EDIBLE)));
    public static final RegistryObject<Item> BUTTER = ITEMS.register("butter", () -> new Item(new Item.Properties().tab(ModItemGroup.EDIBLE)));
    public static final RegistryObject<Item> DOUGH = ITEMS.register("dough", () -> new Item(new Item.Properties().tab(ModItemGroup.EDIBLE)));
    public static final RegistryObject<Item> I_BUTTER = ITEMS.register("ibutter", () -> new Item(new Item.Properties().tab(ModItemGroup.EDIBLE)));
    public static final RegistryObject<Item> R_NUGS = ITEMS.register("rnugs", () -> new Item(new Item.Properties().tab(ModItemGroup.EDIBLE)));
    public static final RegistryObject<Item> NUGS = ITEMS.register("nugs", () -> new Item(new Item.Properties().tab(ModItemGroup.EDIBLE)));
    public static final RegistryObject<Item> R_I_NUGS = ITEMS.register("rinugs", () -> new Item(new Item.Properties().tab(ModItemGroup.EDIBLE)));
    public static final RegistryObject<Item> I_NUGS = ITEMS.register("inugs", () -> new Item(new Item.Properties().tab(ModItemGroup.EDIBLE)));
    public static final RegistryObject<Item> R_I_CHOPS = ITEMS.register("richops", () -> new Item(new Item.Properties().tab(ModItemGroup.EDIBLE)));
    public static final RegistryObject<Item> I_CHOPS = ITEMS.register("ichops", () -> new Item(new Item.Properties().tab(ModItemGroup.EDIBLE)));
    public static final RegistryObject<Item> R_I_TATO = ITEMS.register("ritato", () -> new Item(new Item.Properties().tab(ModItemGroup.EDIBLE)));
    public static final RegistryObject<Item> I_TATO = ITEMS.register("itato", () -> new Item(new Item.Properties().tab(ModItemGroup.EDIBLE)));

    public static final RegistryObject<Item> OATS = ITEMS.register("oats",
            () -> new BlockItem(ModBlocks.OATS.get(),
                    new Item.Properties().food(
                                    new Food.Builder().nutrition(1).saturationMod(0.1f).fast().build())
                            .tab(ModItemGroup.EDIBLE)));


    public static void register(IEventBus eventBus){

        ITEMS.register(eventBus);
    }
}
