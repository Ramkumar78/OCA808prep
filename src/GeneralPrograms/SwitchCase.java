package GeneralPrograms;

import java.util.Scanner;

public class SwitchCase {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Readable a = null;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 1 to add number to itself \n 2 for sub \n 3 for divsion \n 4 for multiplication \n 5 for sqrt \6 for n power ");
		int c = in.nextInt();
		
		System.out.println("enter value of number");
		int a = in.nextInt();
		System.out.println("enter value of n");
		int n = in.nextInt();
		System.out.println(" entered value of a is" + a + "and entered value of n is" + n);

		switch (c) {

		case 1:
			// int c=1;

			System.out.println("result of a+a is " + 2 * a);
			break;

		case 2:

			System.out.println("Result of a-a is " + (a - a));
			break;
		case 3:
			System.out.println("Result of a/a is " + (a / a));
			break;
		case 4:
			System.out.println("Result of a*a is " + (a * a));
			break;
		case 5:
			System.out.println("Result of sqrt of a is " + (Math.sqrt(a)));
			break;
		case 6:
			System.out.println("Result of "+a+" power" +n+ "is " + (Math.pow(a, n)));
			break;
		default:
			System.out.println("enter number 1 to 5");
			// Scanner in =new Scanner(System.in);
			// System.out.println("enter value of a");
			// int a=in.nextInt();
			// System.out.println("value of a is"+a);
		}

	}

}
