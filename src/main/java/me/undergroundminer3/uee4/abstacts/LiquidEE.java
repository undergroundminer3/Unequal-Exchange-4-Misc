package me.undergroundminer3.uee4.abstacts;

import me.undergroundminer3.uee4.reference.Textures;
import net.minecraftforge.fluids.Fluid;

public class LiquidEE extends Fluid {

	public LiquidEE(final String name)
	{
		super(name);
		
		this.setLuminosity(0);
		this.setDensity(1000);
		this.setTemperature(295);
		this.setViscosity(1000);
	}

	@Override
	public String getUnlocalizedName()
	{
		return String.format("tile.%s%s", Textures.RESOURCE_PREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}
	
//	private IIcon[] theIcons = new IIcon[2];


	protected String getUnwrappedUnlocalizedName(String unlocalizedName)
	{
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}

}
