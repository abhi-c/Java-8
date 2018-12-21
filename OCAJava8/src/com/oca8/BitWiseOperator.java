package com.oca8;

/**
 * @author abhishekchaudhary
 *
 */
public class BitWiseOperator {

	public static void main(String[] args) {
		int x = 8;
		printBitwise(x >>= 1);
		printBitwise(x >>>= 2);
		printBitwise(x <<= 3);
		
	}

	private static void printBitwise(int x) {
		System.out.println(Integer.toBinaryString(x));
	}
}

