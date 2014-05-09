/**
 * Copyright (c) 2011-2014, SpaceToad and the BuildCraft Team
 * http://www.mod-buildcraft.com
 *
 * BuildCraft is distributed under the terms of the Minecraft Mod Public
 * License 1.0, or MMPL. Please check the contents of the license located in
 * http://www.mod-buildcraft.com/MMPL-1.0.txt
 */
package me.undergroundminer3.uee4.abstacts;

import buildcraft.core.IMachine;
import buildcraft.core.utils.Utils;

import java.util.Random;

import me.undergroundminer3.uee4.creativetab.CreativeTab;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public abstract class BlockEE_BC extends BlockContainer {

	protected static boolean keepInventory = false;
	protected final Random rand = new Random();

	protected BlockEE_BC(final Material material) {
		super(material);
		setCreativeTab(CreativeTab.EE3_TAB);
		setHardness(5F);
	}

	@Override
	public void onBlockPlacedBy(final World world,
			final int x, final int y, final int z,
			final EntityLivingBase entity, final ItemStack stack) {
		super.onBlockPlacedBy(world, x, y, z, entity, stack);
		final TileEntity tile = world.getTileEntity(x, y, z);
		if (tile instanceof TileEntityEE_BC) {
			((TileEntityEE_BC) tile).onBlockPlacedBy(entity, stack);
		}
	}

	@Override
	public void breakBlock(final World world,
			final int x, final int y, final int z,
			final Block block, final int par6) {
		Utils.preDestroyBlock(world, x, y, z);
		super.breakBlock(world, x, y, z, block, par6);
	}

	@Override
	public int getLightValue(final IBlockAccess world,
			final int x, final int y, final int z) {
		final TileEntity tile = world.getTileEntity(x, y, z);
		if (tile instanceof IMachine && ((IMachine) tile).isActive())
			return super.getLightValue(world, x, y, z) + 8;
		return super.getLightValue(world, x, y, z);
	}
}
