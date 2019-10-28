package com.albertojarabo.test;

public class WorkingWithBytes {
	public static void main(String[] args) {
		System.out.println("Working with bytes:");
		byte b = (byte) -2;
		System.out.println("b\t\t\t" + b + "\t\tvalue of byte b");
		System.out.println(
				"b & 0xFF\t\t" + (b & 0XFF) + "\t\tunsigned value of byte b (opposite byte value to b value if b is negative)");
		System.out
				.println("b + (b & 0xFF)\t\t" + (b + (b & 0XFF)) + "\t\tsum of byte b value and unsigned byte b value");
		System.out.println("0xFF\t\t\t" + 0XFF + "\t\tmask of 11111111 bits");
		System.out.println("(byte)0xFF\t\t" + (byte) 0XFF + "\t\tmask of 11111111 bits casted to a byte value");
		System.out.println(
				"b + 0xFF\t\t" + (b + 0XFF) + "\t\tsum of the byte b value and the mask of 11111111 bits value");
		System.out.println("b - (byte)0XFF\t\t" + (b - (byte) 0XFF)
				+ "\t\tsubstract of the byte b value and the mask of 11111111 bits casted to a byte value");
		System.out.println("(byte)1\t\t\t" + ((byte) 1) + "\t\tinteger 1 casted to a byte value");
		System.out.println("(b - (byte)0XFF - 1)\t" + (b - (byte) 0XFF - 1)
				+ "\t\tsubstract of byte b value and the mask of 11111111 bits casted to a byte value and the integer value 1 (same as b value if b is negative)");
		System.out.println("(byte)0XFF - 1\t\t" + ((byte) 0XFF - 1)
				+ "\t\tsubstract of mask of 11111111 bits casted to a byte value and the integer value 1");
		System.out.println("(byte)0XFE\t\t" + ((byte) 0XFE) + "\t\tmask of 11111110 bits casted to a byte value");
		System.out.println("b & (byte)0XFE\t\t" + (b & (byte) 0XFE)
				+ "\t\tand operation between byte b value and the mask of 11111110 bits casted to a byte value (NOT same as b if b is negative)");
	
		System.out.println();
		System.out.println();
		runChecks();
	}

	private static boolean checkEquals(int one, int two) {
		return one == two;
	}

	public static void runChecks() {
		System.out.println("checking that 'b' and 'b & 0xFF' are equals for values:");
		for (int i = 0; i < 256; i++) {
			byte b = (byte)i;
			if (checkEquals(b, (b & 0XFF))) {
				System.out.print((byte)i + ", ");
			}
		}
		System.out.println();
		System.out.println();
		
		System.out.println("checking that 'b' and 'b - (byte)0XFF - 1' are equals for values:");
		for (int i = 0; i < 256; i++) {
			byte b = (byte)i;
			if (checkEquals(b, ((b - (byte) 0XFF - 1)))) {
				System.out.print((byte)i + ", ");
			}
		}
		System.out.println();		
		System.out.println();
		
		System.out.println("checking that 'b' and 'b & (byte)0XFE' are equals for values:");
		for (int i = 0; i < 256; i++) {
			byte b = (byte)i;
			if (checkEquals(b, (b & (byte)0XFE))) {
				System.out.print((byte)i + ", ");
			}
		}
		System.out.println();	
		System.out.println();
	}
}
