package me.undergroundminer3.uee4.util2;

import cpw.mods.fml.common.FMLLog;
//import me.undergroundminer3.uee4.reference.Reference;

import org.apache.logging.log4j.Level;

public final class LogHelper {
	
	private LogHelper() {};
	
	public static final void log(Level logLevel, Object object)
	{
		FMLLog.log("UEE4", logLevel, String.valueOf(object));
	}

	public static final void all(Object object)
	{
		log(Level.ALL, object);
	}

	public static final void debug(Object object)
	{
		log(Level.DEBUG, object);
	}

	public static final void error(Object object)
	{
		log(Level.ERROR, object);
	}

	public static final void fatal(Object object)
	{
		log(Level.FATAL, object);
	}

	public static final void info(Object object)
	{
		log(Level.INFO, object);
	}

	public static final void off(Object object)
	{
		log(Level.OFF, object);
	}

	public static final void trace(Object object)
	{
		log(Level.TRACE, object);
	}

	public static final void warn(Object object)
	{
		log(Level.WARN, object);
	}
}
