package javapackage;

public class Unaryoperator {

	public static void main(String[] args) {
		// Unaryoperator demo
		
		int a=10;//Local variable
		int b=20;
		int c=99;
		int d=100;
		//Post increment method
		
		System.out.println(a++);//10
		
		//pre increment method
		System.out.println(++b);//21
		

		System.out.println(++c + d++);//200
		
		//a=100,b=101
		System.out.println(--c + d--);
	}

}
