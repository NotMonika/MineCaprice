
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecaprice.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.minecaprice.block.HuajiOreBlock;
import net.mcreator.minecaprice.block.HuajiBlockBlock;
import net.mcreator.minecaprice.MinecapriceMod;

public class MinecapriceModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MinecapriceMod.MODID);
	public static final RegistryObject<Block> HUAJI_ORE = REGISTRY.register("huaji_ore", () -> new HuajiOreBlock());
	public static final RegistryObject<Block> HUAJI_BLOCK = REGISTRY.register("huaji_block", () -> new HuajiBlockBlock());
}
