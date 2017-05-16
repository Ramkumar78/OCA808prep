package GeneralPrograms;

import java.util.Scanner;

public class Person {
  
   int age;
  
  
  Person(int initialAge){
	
	  if(age<0){
		  age=0;
		  System.out.println("Age is not valid, setting age to 0");
	  }
	  else
	  {
		  age=initialAge;
	  }
	
  }
  
  void yearPasses(){
	  ++age;
	  
  }
  
  void amIOld(){
	  if (age<13){
		  System.out.println("You are young.");
	  }
	  else if(age >=13){System.out.println("You are a teenager.");
		  
	  }
	  else
	  {
		  System.out.println("You are old.");
	  }
  }
  
  public static void main(String[] args) {
	
	  Scanner sca=new Scanner(System.in);
	  int a=sca.nextInt();
	  
	  for (int i=0; i<a; i++){
		  int age=sca.nextInt();
		  Person p=new Person(age);
		  p.amIOld();
		  for(int j=0;j<3;j++){
			  p.yearPasses();
		  }
		  p.amIOld();
		  System.out.println();
	  }
	  sca.close();
}
}