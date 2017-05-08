package GeneralPrograms;

import java.math.BigInteger;

public class Moduloeg {

	public static void main(String[] args) {
		
	
		int n=15,s=0,x;
		
		for(int i=0;i<=n;i++)
		{
			x=n%10;
			s=s+x;
			n=n/10;
			
		}
	
		System.out.println(s);
	}
	

}
