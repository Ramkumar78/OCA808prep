package GeneralPrograms;

public class BitShift {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=8;
		i=i >>> 1;
		
		//i=i << 4;
		
		int x=-8;
		x >>=1;
		x>>>=2;
		System.out.println("value of new x---->"+x);
		
		System.out.println(i);
		System.out.println(i <<3 );
		
		int and = x & i;
		System.out.println("value of and--->"+and);

	}

}
