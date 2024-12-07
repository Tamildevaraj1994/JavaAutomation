package Oopsconcept;

public class InheritanceB extends inheritanceA {
	
	public void multiply(int x,int y) {
    z=x*y;
    System.out.println("sum of multiply"+z);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InheritanceB obj=new InheritanceB();
		obj.add(10,20);
		obj.multiply(5,5);
	}
	
}
