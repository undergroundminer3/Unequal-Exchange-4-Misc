/**
 * Copyright (c) 2011-2014, SpaceToad and the BuildCraft Team
 * http://www.mod-buildcraft.com
 *
 * BuildCraft is distributed under the terms of the Minecraft Mod Public
 * License 1.0, or MMPL. Please check the contents of the license located in
 * http://www.mod-buildcraft.com/MMPL-1.0.txt
 */
package me.undergroundminer3.uee4.abstacts;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;

public class ItemBlock_BC extends ItemBlock {

	public ItemBlock_BC(Block b) {
		super(b);
	}

	@Override
	public int getMetadata(int i) {
		return i;
	}
}
