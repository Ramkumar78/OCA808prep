package GeneralPrograms;

public class Car {

	static String colour;
	static String Type;
	
	void start(){
		System.out.println("Get started");
	}
	
	static void printDescription(){
		
		System.out.println("This is a" +colour+Type);
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(""+colour+Type);
		
		printDescription();
		
	} 

	Car(String c, String t
			){
		colour=c;
		Type=t;
	
	}
}
