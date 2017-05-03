package GeneralPrograms;

import java.io.Console;
import java.util.Scanner;

public class fibonocciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
	     System.out.println("Enter an integer");
	     int a = in.nextInt();
		int fib0=0;
		int fib1=1;
		int fib2;
		System.out.println(fib0);
		System.out.println(fib1);
		
		 

	 
	     
		for (int i=0;i<=a;i++){
		fib2=fib0+fib1;
		fib0=fib1;
		fib1=fib2;
		System.out.println(fib2);
		}
		
	}

}
