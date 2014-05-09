package me.undergroundminer3.uee4.client.icon;

import me.undergroundminer3.uee4.reference.Textures;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.util.IIcon;
import buildcraft.BuildCraftCore;
import buildcraft.api.core.IIconProvider;
import buildcraft.core.CoreIconProvider;

public final class GuiIcons implements IIconProvider {

	private GuiIcons() {}

	private IIcon[] icons;
	private IIcon[] blockIcons;

	private static final String[] iconsToRegister = new String[] {
		"info", "explosive", "generatorTab_on", "generatorTab_off"
	};

	private static final String[] bcIconsToReRegister = new String[] {
		"woodenGearItem", "stoneGearItem", "ironGearItem", "goldGearItem", "diamondGearItem"
	};

	private static final String[] otherIconsToReRegister = new String[] {
		"minecraft:bucket_lava"
	};

	private static final String[] blockIconsToRegister = new String[] {
	};

	public static final String[] otherBlockIconsToReRegister = new String[] {
	};

	public static final int MJ_POWOUT = 0;
	public static final int WOOD_GEAR = 1;
	public static final int STONE_GEAR = 2;
	public static final int IRON_GEAR = 3;
	public static final int GOLD_GEAR = 4;
	public static final int DIAMOND_GEAR = 5;

	public static final int LAVA_BUCKET = 6;
	public static final int INFO_SIGN = 7;
	public static final int EXPLOSIVE = 8;
	public static final int GENERATOR_ON = 9;
	public static final int GENERATOR_OFF = 10;

	@Override
	public IIcon getIcon(final int iconIndex) {
		return iconIndex == 0 ? BuildCraftCore.iconProvider.getIcon(CoreIconProvider.ENERGY) : icons[iconIndex];
	}

	public IIcon getBlockIcon(final int iconIndex) {
		return blockIcons[iconIndex];
	}

	@Override
	public void registerIcons(final IIconRegister iconRegister) {
		icons = new IIcon[iconsToRegister.length + bcIconsToReRegister.length + otherIconsToReRegister.length + 1];
		int n = 1;

		for (final String reg : bcIconsToReRegister) {
			icons[n] = iconRegister.registerIcon("buildcraft:" + reg);
			n++;
		}

		for (final String reg : otherIconsToReRegister) {
			icons[n] = iconRegister.registerIcon(reg);
			n++;
		}

		for (final String reg : iconsToRegister) {
			icons[n] = iconRegister.registerIcon(Textures.RESOURCE_PREFIX + "icons/" + reg);
			n++;
		}
	}

	public void registerBlockIcons(final TextureMap map) {
		blockIcons = new IIcon[blockIconsToRegister.length + otherBlockIconsToReRegister.length];

		int n = 0;

		for (final String reg : blockIconsToRegister) {
			blockIcons[n] = map.registerIcon(Textures.RESOURCE_PREFIX + "blockIcons/" + reg);
			n++;
		}

		for (final String reg : otherBlockIconsToReRegister) {
			blockIcons[n] = map.registerIcon(reg);
			n++;
		}
	}

	public static GuiIcons INSTANCE = new GuiIcons();
}
