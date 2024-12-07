package Oopsconcept;

public class Driver extends Vehicle {
	public void car() {
		super.car();
		System.out.println("Car is repaired");
		
	}

	public static void main(String[] args) {
			Driver obj=new Driver();
			obj.car();

	}

}
