package com.dezilaicosed.pay_ging.core.init;

import com.dezilaicosed.pay_ging.PayGing;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, PayGing.MOD_ID);
    public static final RegistryObject<Item> PAY_GING = ITEMS.register("pay_ging",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));

    public static final RegistryObject<BlockItem> PAY_GING_BLOCK = ITEMS.register("pay_ging_block",
            () -> new BlockItem(BlockInit.PAY_GING_BLOCK.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

}
