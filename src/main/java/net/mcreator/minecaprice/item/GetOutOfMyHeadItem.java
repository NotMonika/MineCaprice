
package net.mcreator.minecaprice.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.minecaprice.init.MinecapriceModTabs;

import java.util.List;

public class GetOutOfMyHeadItem extends Item {
	public GetOutOfMyHeadItem() {
		super(new Item.Properties().tab(MinecapriceModTabs.TAB_TAB_MEME).stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("Get out of my head."));
		list.add(new TextComponent("Get out of my head."));
		list.add(new TextComponent("Get out of my head."));
		list.add(new TextComponent("Get out of my head. Get out of my head."));
		list.add(new TextComponent("Get out of my head."));
		list.add(new TextComponent("Get out of my head"));
		list.add(new TextComponent("Get out of my head."));
		list.add(new TextComponent("Get out of my head. Get out of my head."));
		list.add(new TextComponent("Get out of my head.  Get out of my head."));
		list.add(new TextComponent("Get out of my head."));
		list.add(new TextComponent("Get out of my head"));
		list.add(new TextComponent("Get out of my head. Get out of my head. Get out of my head. Get out of my head."));
		list.add(new TextComponent("Get out of my head. Get out of my head. Get out of my head. Get out of my head. Get out of Get. Out. Of."));
		list.add(new TextComponent("My"));
		list.add(new TextComponent(
				"Head.Get out of my head before I do what I know is best for you. Get out of my head before I listen to everything she said to me."));
		list.add(new TextComponent("Get out of my head before I show you how much I love you."));
		list.add(new TextComponent("Get out of my head before I finish writing this poem"));
		list.add(new TextComponent("But a poem is never actually finished"));
		list.add(new TextComponent("It just stops moving."));
	}
}
