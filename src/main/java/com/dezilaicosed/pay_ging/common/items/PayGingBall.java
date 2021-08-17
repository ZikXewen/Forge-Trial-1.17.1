package com.dezilaicosed.pay_ging.common.items;

import java.util.List;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

public class PayGingBall extends Item {
    public PayGingBall(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag tooltipFlag) {
        super.appendHoverText(stack, level, tooltip, tooltipFlag);
        if (Screen.hasShiftDown()) {
            tooltip.add(new TranslatableComponent("tooltip.pay_ging.pay_ging_ball.shift"));
        } else {
            tooltip.add(new TranslatableComponent("tooltip.pay_ging.pay_ging_ball.nonshift"));
        }
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand interactionHand) {
        if (!player.getCooldowns().isOnCooldown(this)) {
            player.addEffect(new MobEffectInstance(MobEffects.LUCK, 400, 1));
            player.getCooldowns().addCooldown(this, 800);
            return InteractionResultHolder.success(player.getItemInHand(interactionHand));
        } else {
            return InteractionResultHolder.fail(player.getItemInHand(interactionHand));
        }
    }
}
