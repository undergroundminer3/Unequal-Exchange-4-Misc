package me.undergroundminer3.uee4.util2;

public final class TimeUtil {

	private TimeUtil() {};

	public static final String getHumanReadableTimeFromMS(final int milliseconds) {

		final int seconds = (int) (milliseconds / 1000) % 60 ;
		final int minutes = (int) ((milliseconds / (1000*60)) % 60);
		final int hours   = (int) ((milliseconds / (1000*60*60)) % 24);
		final int days    = (int) (milliseconds / (1000*60*60*24));

		return String.format("%d : %d : %d : %d", days, hours, minutes, seconds);
	}

	public static final String getHumanReadableTimeFromTicks(final int ticks) {

		final int seconds = (int) (ticks / 20) % 60 ;
		final int minutes = (int) ((ticks / (20*60)) % 60);
		final int hours   = (int) ((ticks / (20*60*60)) % 24);
		final int days    = (int) (ticks / (20*60*60*24));

		return String.format("%d : %d : %d : %d", days, hours, minutes, seconds);
	}
}
