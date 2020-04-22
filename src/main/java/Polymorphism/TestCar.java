package Polymorphism;

public class TestCar {

	public static void main(String[] args) {
		
		//Method Overriding:
		//when the method name is same with the same number of arguments in parent class as well as in child class

		BMW b = new BMW();
		b.start(); //compile time polymorphism
		b.stop();
		b.refuel();
		b.theftSafety();
		b.engine();
		
		System.out.println("*******");
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		
		System.out.println("*******");
		
		Car c1 = new BMW();//child class object can be referred by parent class reference variable
		//dynamic/Run Time polymorphism
		//Top casting
		c1.start();
		c1.stop();
		c1.refuel();
		
		BMW b1 = (BMW) new Car(); //down casting: ClassCastException
		

	}

}
