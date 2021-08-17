package com.dezilaicosed.pay_ging.core.init;

import com.dezilaicosed.pay_ging.PayGing;
import com.dezilaicosed.pay_ging.common.items.PayGingBall;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
        public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
                        PayGing.MOD_ID);
        public static final RegistryObject<Item> PAY_GING = ITEMS.register("pay_ging",
                        () -> new Item(new Item.Properties().tab(PayGing.TAB)));
        public static final RegistryObject<PayGingBall> PAY_GING_BALL = ITEMS.register("pay_ging_ball",
                        () -> new PayGingBall(new Item.Properties().tab(PayGing.TAB).stacksTo(1).rarity(Rarity.RARE)));

        // BlockItem
        public static final RegistryObject<BlockItem> PAY_GING_BLOCK = ITEMS.register("pay_ging_block",
                        () -> new BlockItem(BlockInit.PAY_GING_BLOCK.get(), new Item.Properties().tab(PayGing.TAB)));

}
