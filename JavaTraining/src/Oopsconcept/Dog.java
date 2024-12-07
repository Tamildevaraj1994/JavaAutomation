package Oopsconcept;

public class Dog implements Animal1{

	public static void main(String[] args) {
	Dog obj=new Dog();
	obj.eat();
	obj.sleep();
	

	}

	@Override
	public void eat() {
		System.out.println("Hello");
		
	}

	@Override
	public void sleep() {
		System.out.println("Test");
		
	}

}
