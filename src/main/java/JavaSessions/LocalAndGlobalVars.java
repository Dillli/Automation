package JavaSessions;

public class LocalAndGlobalVars {
	
	//global variable -- class variables  
	String name = "Tom";
	int age = 25;

	public static void main(String[] args) {

		LocalAndGlobalVars obj = new LocalAndGlobalVars();
	System.out.println(obj.name);// we call g.v through the object
		System.out.println(obj.age);
		int k =10;//local variable for main method
		
		System.out.println(k);// we can call directly 
		
	obj.sendMail(); // non static method 
	obj.sum();
		 
	}
	
	
	public void sum(){
		int i = 10; //local var
		int j=10;
		int m =i+j;
		
		System.out.println(m);
		
		System.out.println(age);
		System.out.println(name);
		//System.out.println(k);
		
	
	}
	
	public void sendMail(){
		int j = 20;
		System.out.println(j);
	}

}
