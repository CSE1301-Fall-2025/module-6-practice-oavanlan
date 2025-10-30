package exam.codewriting;

import java.util.Scanner;

import edu.princeton.cs.introcs.StdDraw;

public class Q09 {

	/*
	We wish to write a method that counts the number of digits in an int. For example:

		numDigits(1234567) would return 7
		numDigits(1000) would return 4

	Your task is to construct a recursive implementation of numDigits which has been started for you below.
	You do not need a helper method to do this, but you can use one if you wish. No credit will be given for
	this problem if a loop is used at any point.
	 */
	public static int numDigits (int x) {
		if (x/10 == 0) {
			return 1;
		} //fix me
		return 1 + numDigits(x/10);
	}

	public static void main ( String[] args ) {
		System.out.println(numDigits(1234567));//should be 7
		System.out.println(numDigits(1000));//should be 4
	}

}
