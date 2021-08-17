package com.dezilaicosed.pay_ging.core.init;

import com.dezilaicosed.pay_ging.PayGing;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
            PayGing.MOD_ID);
    public static final RegistryObject<Block> PAY_GING_BLOCK = BLOCKS.register("pay_ging_block",
            () -> new Block(Block.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK).strength(1.5f, 6.0f)
                    .sound(SoundType.STONE).requiresCorrectToolForDrops()));
}
