package javapackage;

import java.util.Scanner;

public class PositiveorNegative {

	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the number");
		int num =obj.nextInt(); 
		
		if(num>0) {
			System.out.println("entered positive number");
		}
		
		else if(num<0) {
			System.out.println("entered negative number");	
		}
		
		else {
			System.out.println("entered  number is Zero");	
		}			
	}

}
