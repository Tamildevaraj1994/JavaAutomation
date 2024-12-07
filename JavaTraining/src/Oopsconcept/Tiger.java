package Oopsconcept;

public class Tiger extends Animal{

	public void move() {
		super.move();
	System.out.println("Run");
	}
public static void main (String[]args) {
	Tiger obj=new Tiger();
	obj.move();
}
}
