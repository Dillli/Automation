package JavaSessions;

public class StaticBlock {
	
	static{
		System.out.println("in static block....");
	}
	
	
	public static String second(String str) {
		
		System.out.println(" second class public  static ");
		 return str;
		
	}
	
	public void teststatic() {
		
		System.out.println(" in non static black ");// it will not print the directly
		
	}

	public static void main(String[] args) {

		System.out.println("In Main...");
		
		
	}

}
