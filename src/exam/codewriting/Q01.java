package exam.codewriting;

import edu.princeton.cs.introcs.StdDraw;

public class Q01 {

	public static void recursiveCarpet ( double xCtr , double yCtr , double halfLength , int count) {
		if(count == 5) {
			return;
		}
		StdDraw.filledSquare(xCtr, yCtr, halfLength);
		count++;
        recursiveCarpet(xCtr - 2*halfLength, yCtr - 2*halfLength, halfLength / 3, count);
        recursiveCarpet(xCtr + 2*halfLength, yCtr - 2*halfLength, halfLength / 3, count);
        recursiveCarpet(xCtr - 2*halfLength, yCtr + 2*halfLength, halfLength / 3, count);
        recursiveCarpet(xCtr + 2*halfLength, yCtr + 2*halfLength, halfLength / 3, count);


	}

	public static void main(String[] args) {
		//Your task is to complete the above method to draw the image
		//shown in "image01.png" in the images folder.

		//Your solution must use recursion
		double halfCarpetLength = 0.1 ;
		recursiveCarpet ( 0.5 , 0.5 , halfCarpetLength , 1) ;
	}

}
