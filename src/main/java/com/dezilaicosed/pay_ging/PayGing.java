package com.dezilaicosed.pay_ging;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import com.dezilaicosed.pay_ging.core.init.BlockInit;
import com.dezilaicosed.pay_ging.core.init.ItemInit;

@Mod(PayGing.MOD_ID)
public class PayGing {
    public static final String MOD_ID = "pay_ging";
    public static final PayGingTab TAB = new PayGingTab("pay_ging_all");

    public PayGing() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::setup);

        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {

    }

    public static class PayGingTab extends CreativeModeTab {
        public PayGingTab(String label) {
            super(label);
        }

        @Override
        public ItemStack makeIcon() {
            return ItemInit.PAY_GING.get().getDefaultInstance();
        }
    }
}
