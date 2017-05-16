package GeneralPrograms;

import java.util.*;

public class fibonocciseries {

    
    public static int fibonacci(int n) {
        // Complete the function.
     int fib0,fib1,fibn = 0;
     fib0=0;
     fib1=1;
     
        
    for (int i=2; i<=n;i++){
        
        fibn=fib0+fib1;
        fib0=fib1;
        fib1=fibn;
    }
        n = fibn;
        return n;
      
    }
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(fibonacci(n));
    }
}
