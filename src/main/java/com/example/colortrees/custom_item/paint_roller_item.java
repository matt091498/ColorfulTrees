package com.example.colortrees.custom_item;

import com.example.colortrees.setup.Registration;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;



public class paint_roller_item extends Item {

    public paint_roller_item(Properties r_properties) {
        super(r_properties);
    }

    @Override
    public boolean isDamageable(ItemStack stack) {
        return true;
    }
    
    @Override
    public boolean hasCraftingRemainingItem(ItemStack stack) {
        return true;
    }

    @Override
    public ItemStack getCraftingRemainingItem(ItemStack stack) {
        var res = stack.copy();

        res.setDamageValue(res.getDamageValue() + 1);

        if (res.getDamageValue() >= res.getMaxDamage()) {
            res = new ItemStack(Registration.BLANK_PAINT_ROLLER.get());
        }

        return res;
    }
}
