
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecaprice.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class MinecapriceModTabs {
	public static CreativeModeTab TAB_TAB_MEME;

	public static void load() {
		TAB_TAB_MEME = new CreativeModeTab("tabtab_meme") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(MinecapriceModItems.TAB_MEME_ICON.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
