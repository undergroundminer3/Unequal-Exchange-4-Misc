package me.undergroundminer3.uee4.init;

import me.undergroundminer3.uee4.util2.CheatDetector;
import me.undergroundminer3.uee4.util2.LogHelper;

public final class ModInstance {
	
	//please do not use reflection
	private static Object mod298542843502892345010873728345295723947520r5429y754295472057420347523nviqerycnqcwionoasdnfasofasoidvaosdifcmzxoixsxioqqwreqpadfncpqreicqporecoqroxuasadfiouadfaxuifzoniqglw;
	//TODO change this every single release

	public static final Object getMod() {
		return mod298542843502892345010873728345295723947520r5429y754295472057420347523nviqerycnqcwionoasdnfasofasoidvaosdifcmzxoixsxioqqwreqpadfncpqreicqporecoqroxuasadfiouadfaxuifzoniqglw;
	}
	
	public static final void setMod(final Object o) {
		if (mod298542843502892345010873728345295723947520r5429y754295472057420347523nviqerycnqcwionoasdnfasofasoidvaosdifcmzxoixsxioqqwreqpadfncpqreicqporecoqroxuasadfiouadfaxuifzoniqglw == null) {
			mod298542843502892345010873728345295723947520r5429y754295472057420347523nviqerycnqcwionoasdnfasofasoidvaosdifcmzxoixsxioqqwreqpadfncpqreicqporecoqroxuasadfiouadfaxuifzoniqglw = o;
		} else {
			LogHelper.warn("[UEE4-Api] Something tried to set mod instance after it was set.");
			CheatDetector.shutdown();
			
			throw new SecurityException("[UEE4-Api] Something tried to replace mod instance!");
		}
	}
}
