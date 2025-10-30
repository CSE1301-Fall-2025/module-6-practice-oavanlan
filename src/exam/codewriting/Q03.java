package exam.codewriting;

import edu.princeton.cs.introcs.StdDraw;

public class Q03 {

	public static void boxy ( double xCtr , double yCtr , double halfLength , int count ) {
		//your code here
		if (count > 6) {
			return;
		}
		StdDraw.square(xCtr, yCtr, halfLength);
		count++;
		boxy(xCtr + halfLength, yCtr - halfLength, halfLength/2, count);
		boxy(xCtr - halfLength, yCtr - halfLength, halfLength/2, count);
	}

	public static void main(String[] args) {
		//Your task is to complete the above method to draw the image
		//shown in "image02.png" in the images folder.

		//Your solution must use recursion

		boxy (0.5 , 0.5 , 0.25, 1);
	}

}
