package GeneralPrograms;
/*  Car which is able to print description
 * Author Ramkumar
 * 
 * 
 * */
import java.beans.Customizer;

public class Car {


	String colour;
	String type;
	{
		colour = "red";
		type = "celica";
	}

	String getDescription() {

		String desc = "This is a " + colour + " " + type;
		return desc;

	}
//Customise Frame: newColour=blue newType Convertible;
	/* colour and type*/
	void customize(String type, String colour) {

		this.colour = colour;
		
		
		this.type=type;
		type= "convertible";
this.type = type+""+this.type;
		System.out.println(getDescription());

	}
	
	public static void main(String[] args) {
		
		Car c1=new Car();
//		String t1="ford";
//		String col1="Silver";
		c1.customize("Silver","ford");
		
	}

}
