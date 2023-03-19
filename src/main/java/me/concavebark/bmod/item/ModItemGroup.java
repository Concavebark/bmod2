package me.concavebark.bmod.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class ModItemGroup {

    public static final ItemGroup BMOD_GROUP = new ItemGroup("bModTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.BLUNT.get());
        }
    };
}
