package InheritanceConcept;

public class BMW extends Car {

	@Override
	public void start() {
		System.out.println("BMW -- start");
	}
	// @Override  method hiding  overriding static  method 
 	public static void  methodhiding()
	{
		System.out.println(" method hiding");
	}
	public void autoAirSuspension() {
		System.out.println("BMW -- suspension");
	}
	
	
	

}
