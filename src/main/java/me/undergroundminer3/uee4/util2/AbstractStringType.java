package me.undergroundminer3.uee4.util2;

public final class AbstractStringType {

	private AbstractStringType() {};
	
	//THIS DOESN'T WORK

	public static final int BYTE_ACCURACY = 31;
	public static final int ACCURACY_MASK = 0x000FFFFF;
	public static final int BYTE_SHIFT = 5;
	public static final int BYTE_NUM = 6;

	public static final int baToInt(final byte[] letters) throws IllegalArgumentException {
		if (letters.length != BYTE_NUM) throw new IllegalArgumentException("Wrong number of bytes!");

		byte b1 = (byte) (letters[0] & ACCURACY_MASK);
		byte b2 = (byte) (letters[1] & ACCURACY_MASK);
		byte b3 = (byte) (letters[2] & ACCURACY_MASK);
		byte b4 = (byte) (letters[3] & ACCURACY_MASK);
		byte b5 = (byte) (letters[4] & ACCURACY_MASK);
		byte b6 = (byte) (letters[5] & ACCURACY_MASK);
		//		byte b7 = (byte) (letters[6] & ACCURACY_MASK);
		//		byte b8 = (byte) (letters[7] & ACCURACY_MASK);

		int result = b1;
		int shift = BYTE_SHIFT;


		result += b2 << shift;
		shift += BYTE_SHIFT;
		result += b3 << shift;
		shift += BYTE_SHIFT;
		result += b4 << shift;
		shift += BYTE_SHIFT;
		result += b5 << shift;
		shift += BYTE_SHIFT;
		result += b6 << shift;
		//		shift += BYTE_SHIFT;
		//		result += b7 << shift;
		//		shift += BYTE_SHIFT;
		//		result += b8 << shift;
		//		shift += BYTE_SHIFT;

		return result;
	}

	public static final byte[] prepareArray(final byte[] bytes) {
		byte[] result = new byte[BYTE_NUM];

		for (int i = 0; (i < bytes.length) && (i < result.length); i++) {
			result[i] = bytes[i];
		}

		return result;
	}

	public static final byte cToByte(/*var*/ char letter) throws IllegalArgumentException {
		letter = (String.valueOf(letter)).toLowerCase().charAt(0);

		switch (letter) {
		case ' ': return 0; 
		case 'a': return 1;
		case 'b': return 2;
		case 'c': return 3;
		case 'd': return 4;
		case 'e': return 5;
		case 'f': return 6;
		case 'g': return 7;
		case 'h': return 8;
		case 'i': return 9;
		case 'j': return 10;
		case 'k': return 11;
		case 'l': return 12;
		case 'm': return 13;
		case 'n': return 14;
		case 'o': return 15;
		case 'p': return 16;
		case 'q': return 17;
		case 'r': return 18;
		case 's': return 19;
		case 't': return 20;
		case 'u': return 21;
		case 'v': return 22;
		case 'w': return 23;
		case 'x': return 24;
		case 'y': return 25;
		case 'z': return 26;

		case '1': return 27;
		case '2': return 28;
		case '3': return 29;
		case '4': return 30;
		case '5': return 31;
		case '6': return 32;
		case '7': return 33;
		case '8': return 34;
		case '9': return 35;
		case '0': return 36;

		default:
			throw new IllegalArgumentException("Tried to abstractify a non-alphanumeric character");
		}
	}

	public static final int trueHashString(final String s) throws IllegalArgumentException {

		if (s.length() > BYTE_NUM) throw new IllegalArgumentException("Trying to ugm3 hash a string that is too long.");

		final char[] chars = s.toCharArray();
		final byte[] letters = new byte[chars.length];

		for (int i = 0; i < chars.length; i++) {
			letters[i] = cToByte(chars[i]);
		}

		return baToInt(prepareArray(letters));
	}
	
	public static final short shortHash(final String s) {
		short h = 0;
		int off = 0;
		char val[] = s.toCharArray();
		int len = s.length();
		for (int i = 0; i < len; i++) {
			h = (short) (7*h + val[off++]);
		}
		
		return h;
	}
}
