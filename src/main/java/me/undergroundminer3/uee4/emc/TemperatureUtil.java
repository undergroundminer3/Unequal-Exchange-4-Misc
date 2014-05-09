package me.undergroundminer3.uee4.emc;

public final class TemperatureUtil {

	private TemperatureUtil() {};

	public static final double kToCelsius(final double kelvin) {
		return kelvin - 273.15D;
	}

	public static final double cToKelvin(final double celsius) {
		return celsius + 273.15D;
	}
	
	public static final double cToEmc(final double celsius) {
		return (celsius - cWaterTemp) * 0.05D;
	}
	
	public static final double kLavaTemp = 1300D;
	public static final double cLavaTemp = 1026.85D;
	public static final double emcLavaTemp = 50.25D;
	
	public static final double kWaterTemp = 295.0D;
	public static final double cWaterTemp = 21.85D;
	public static final double emcWaterTemp = 0.0D;
	
	//forget fahrenheit for now.
}
