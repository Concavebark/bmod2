package me.concavebark.bmod.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.item.UseAction;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

import java.util.Objects;

public class Blunt extends Item {

    private String strain;

    public Blunt(Properties properties, String strain) {

        super(properties);

        this.strain = strain;
    }


    /*
    @Override
    public ItemStack finishUsingItem(ItemStack stack, World world, LivingEntity player){

        switch(strain){
            case "reg": // Reggie
                player.addEffect(new EffectInstance(Effects.CONFUSION, 300, 2));
                if(randomInt(0, 1) == 1)
                    player.addEffect(new EffectInstance(Effects.HUNGER, 300, 2));
                break;
            case "ol": // Oompa Loompa
                if(randomInt(0, 2) == 1)
                    player.addEffect(new EffectInstance(Effects.CONFUSION, 1125, 2));
                if(randomInt(0, 2) == 1)
                    player.addEffect(new EffectInstance(Effects.HUNGER, 1125, 2));
                if(randomInt(0, 2) == 1)
                    player.addEffect(new EffectInstance(Effects.DIG_SLOWDOWN, 1125, 2));
                break;
            case "perp": // Perp
                player.addEffect(new EffectInstance(Effects.CONFUSION, 700, 2));
                if(randomInt(0, 1) == 1)
                    player.addEffect(new EffectInstance(Effects.HUNGER, 700, 2));
                break;
            case "pres": // Presidential
                player.addEffect(new EffectInstance(Effects.CONFUSION, 1200, 4));
                if(randomInt(0, 1) == 1)
                    player.addEffect(new EffectInstance(Effects.HUNGER, 1200, 2));
                break;
            case "pk": // Purple Kush
                player.addEffect(new EffectInstance(Effects.CONFUSION, 1125, 9));
                player.addEffect(new EffectInstance(Effects.MOVEMENT_SLOWDOWN, 1125, 2));
                if(randomInt(0, 1) == 1)
                    player.addEffect(new EffectInstance(Effects.HUNGER, 1125, 2));
                break;
            case "sd":
                player.addEffect(new EffectInstance(Effects.CONFUSION, 1125, 10));
                player.addEffect(new EffectInstance(Effects.MOVEMENT_SLOWDOWN, 1125, 2));
                player.addEffect(new EffectInstance(Effects.DIG_SLOWDOWN, 1125, 2));
                break;
        }

        return player.eat(world, stack);
    }
    */

    private int randomInt(int min, int max){

        return (int)Math.floor(Math.random() * (max-min)) + min;
    }
}
