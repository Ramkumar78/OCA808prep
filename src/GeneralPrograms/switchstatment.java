package GeneralPrograms;

public class switchstatment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=2;
		int y=4;
		int z=x+2;
		System.out.println("value of z"+z);
		switch(4){
		case 4:
			--y;
		case 5:
		++y;
		default:
		++y;
		}
		
		System.out.println(y);
	}

}
