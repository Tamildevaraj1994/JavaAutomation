package javapackage;

public class creationofobject {
	
	int a=100;//global variable
	boolean b=true;
	static int s=300;//static variable

	public static void main(String[] args) {
		// creation of object and accessing the global variable
		
		long l=939343;//local variable
		char ch='T';
		
		
		creationofobject obj=new creationofobject();//creating obj
		
		System.out.println(obj.a);
		System.out.println(l);
		System.out.println(s);
		System.out.println(obj.b);
		System.out.println(ch);
		

	}

}
