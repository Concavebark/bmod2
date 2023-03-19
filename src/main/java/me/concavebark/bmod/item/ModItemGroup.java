package me.concavebark.bmod.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class ModItemGroup {

    public static final ItemGroup SMOKEABLE = new ItemGroup("bModSmokeable") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.REG_BLUNT.get());
        }
    };

    public static final ItemGroup EDIBLE = new ItemGroup("bModEdible"){
        @Override
        public ItemStack makeIcon(){
            return new ItemStack(ModItems.EDIBLE_COOKIE.get());
        }
    };

    public static final ItemGroup PLANTABLE = new ItemGroup("bModPlantable"){
        @Override
        public ItemStack makeIcon(){
            return new ItemStack(ModItems.REG_WEED.get());
        }
    };
}
