package javapackage;

import java.util.Scanner;

public class Evenoroddtest {

	public static void main(String[] args) {
		//Evenoroddtest
		
		Scanner userinput=new Scanner(System.in);
	System.out.println("Enter the number");	
		int num=userinput.nextInt();
		
		
		if (num%2==0){
			
			System.out.println("Number is even");
					
		}
		else {
			System.out.println("Number is ODD");
		}
	}

}
