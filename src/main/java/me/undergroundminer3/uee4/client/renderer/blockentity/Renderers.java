package me.undergroundminer3.uee4.client.renderer.blockentity;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;

public final class Renderers {

	private Renderers() {};

	public static int dynamicBlockEntityRendererID;
	public static ISimpleBlockRenderingHandler dynamicBlockEntityRendererInv;
	public static TileEntitySpecialRenderer dynamicBlockEntityRendererWorld;
}
