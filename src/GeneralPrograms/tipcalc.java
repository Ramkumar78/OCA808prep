package GeneralPrograms;

import java.util.Scanner;

public class tipcalc {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
      
        // Write your calculation code here.
        double tip=(tipPercent*mealCost/100);
        System.out.println(tip);
        double tax=(taxPercent*mealCost/100);
        System.out.println(tax);
        double temp=mealCost+tip+tax;
        System.out.println(temp);
        
      
        // cast the result of the rounding operation to an int and save it as totalCost 
        int totalCost = (int) Math.round(temp);
      
        // Print your result
        System.out.println("The total meal cost is "+totalCost+" dollars");

	}

}
