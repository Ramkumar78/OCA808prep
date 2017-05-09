package GeneralPrograms;

public class workingwithString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String S=new String("   HelLo World  ");

String sub=S.substring(2,3);

System.out.println(sub);
String trm=S.trim();//removes trailling spaces and creates new string
	System.out.println(trm);
	trm=trm+S+sub;
	System.out.println(trm);
	
	
	StringBuilder sb=new StringBuilder();
	//StringBuilder ls=new StringBuffer();
	System.out.println("test builder"+sb.append(trm));
	System.out.println("test builder 1-->"+sb.append("trm1"));
	
	System.out.println("test builder 1-->"+sb.append("trm2"));
	int a='a';
	int b='b';
	int c=a+b;
	System.out.println(c+"g");
	
	System.out.println((1+2+"g"+3+2+5));
	}

}
