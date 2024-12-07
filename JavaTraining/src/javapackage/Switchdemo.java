package javapackage;

import java.util.Scanner;

public class Switchdemo {

	public static void main(String[] args) {
		//Switch demo
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the day number");
		int day = sc.nextInt();
		
		switch (day){
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("WED");
			break;
		case 4:
			System.out.println("thrusday");
			break;
		case 5:
			System.out.println("friday");
			break;
		case 6:
			System.out.println("Sat");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("invalid input");
			break;
		}

	}

}
