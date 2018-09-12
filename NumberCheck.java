import java.util.Scanner;

public class NumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray = new int [10];
		Scanner s = new Scanner(System.in);
		
		for (int x=0; x < myArray.length; x++) {
			System.out.print("Number please: ");
			myArray[x] = s.nextInt();
		}
		if (hasSeven(myArray))
			System.out.println("This one has a seven");
		else
			System.out.println("no seven");
		
		if (smallerEven(myArray)) {
			System.out.println("All numbers are smaller than 7 and odd");
		} else {
			System.out.println("Some numbers are bigger than 7 or even");
			
		}
		}
	/**
	 * checks to see if any values are equal to 7
	 * @param someArray
	 * @return true if finds a seven
	 */
	public static boolean hasSeven(int[] someArray) {
		for (int i = 0; i < someArray.length; i++) {
			if (someArray[i] == 7) 
				return true;	
			}
		return false;
	
	}
	/**
	 * Checks that the values are smaller than 7 and odd
	 * @param anArray
	 * @return true only if values are odd and less than 7
	 */
	public static boolean smallerEven (int[] anArray) {
		for (int i = 0; i < anArray.length; i++) {
			if (anArray[i] >= 7 || anArray[i] % 2 == 0)
				return false;
		}
		return true;
	}
}



