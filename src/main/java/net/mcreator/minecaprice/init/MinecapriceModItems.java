
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecaprice.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.minecaprice.item.TabMemeIconItem;
import net.mcreator.minecaprice.item.SayoriItem;
import net.mcreator.minecaprice.item.HuajiKArmorItem;
import net.mcreator.minecaprice.item.HuajiItem;
import net.mcreator.minecaprice.MinecapriceMod;

public class MinecapriceModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MinecapriceMod.MODID);
	public static final RegistryObject<Item> TAB_MEME_ICON = REGISTRY.register("tab_meme_icon", () -> new TabMemeIconItem());
	public static final RegistryObject<Item> HUAJI = REGISTRY.register("huaji", () -> new HuajiItem());
	public static final RegistryObject<Item> HUAJI_ORE = block(MinecapriceModBlocks.HUAJI_ORE, MinecapriceModTabs.TAB_TAB_MEME);
	public static final RegistryObject<Item> HUAJI_BLOCK = block(MinecapriceModBlocks.HUAJI_BLOCK, MinecapriceModTabs.TAB_TAB_MEME);
	public static final RegistryObject<Item> HUAJI_K_ARMOR_HELMET = REGISTRY.register("huaji_k_armor_helmet", () -> new HuajiKArmorItem.Helmet());
	public static final RegistryObject<Item> HUAJI_K_ARMOR_CHESTPLATE = REGISTRY.register("huaji_k_armor_chestplate",
			() -> new HuajiKArmorItem.Chestplate());
	public static final RegistryObject<Item> HUAJI_K_ARMOR_LEGGINGS = REGISTRY.register("huaji_k_armor_leggings",
			() -> new HuajiKArmorItem.Leggings());
	public static final RegistryObject<Item> HUAJI_K_ARMOR_BOOTS = REGISTRY.register("huaji_k_armor_boots", () -> new HuajiKArmorItem.Boots());
	public static final RegistryObject<Item> SAYORI = REGISTRY.register("sayori", () -> new SayoriItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
