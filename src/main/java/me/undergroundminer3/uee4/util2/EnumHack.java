package me.undergroundminer3.uee4.util2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

import sun.reflect.ConstructorAccessor;

public final class EnumHack {
	
	private EnumHack() {};

	//WARNING THIS HACK IS VERY UGLY!
	//IT VIOLATES THE BASICS OF THE JAVA LANGUAGE SPECIFICATION!
	//PLEASE DON'T USE THIS UNLESS THERE IS NO OTHER WAY!
	//IT MAY NOT WORK IN EVERY IMPLEMENTATION
	//IT FORCIBLY DOES THINGS THAT JAVA DOESN'T ALLOW
	
	//DO NOT USE THIS IF YOU DON'T NEED TO
	//I ONLY USED THIS TO GET MY PIPE TYPE WORKING
	
	//TODO Convince BuildCraft not to use Pipe Enums.

	public final static Object newInstance(final Constructor<?> c, final Object ... args) throws Exception {
		
		Object result = null;
		try {
			Method[] methods = Constructor.class.getDeclaredMethods();
			Field[] fields = Constructor.class.getDeclaredFields();
			ConstructorAccessor ctorc = null;
			
			for (int f = 0; f < fields.length; f++) {
				final Field currentField = fields[f];
				
				if (currentField.getName().equals("constructorAccessor")) {
					currentField.setAccessible(true);
					ctorc = (ConstructorAccessor) currentField.get(c);
				}
			}
			
			Method accessMethod = null;
			

			if (ctorc == null) {
				for (int m = 0; m < methods.length; m++) {
					final Method currentMethod = methods[m];
					
					if (currentMethod.getName().equals("acquireConstructorAccessor")) {
						accessMethod = currentMethod;
					}
				}
				accessMethod.setAccessible(true);
				ctorc = (ConstructorAccessor) accessMethod.invoke(c, new Object[] {});
			}
			
			Type[] params = c.getGenericParameterTypes();
			
			for (int p = 0; p < params.length; p++) {
				System.out.println(params[p].getTypeName());
			}
			
			result = ctorc.newInstance(args);
		} catch (final Exception e) {
			throw e;
		}
		return result;
	}
}
