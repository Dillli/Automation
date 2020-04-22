package Constructor;

public class Business {

	String type;
	int revenue;
	String branches;
	

	public Business() {

		System.out.println("default business class const....");
	}
	
	public Business(int i) {
		
		

		System.out.println("default business class const...." + i);
	}

	public Business(String type, int revenue, String branches) {
		this.type = type;
		this.revenue = revenue;
		this.branches = branches;
	}

	public static void main(String[] args) {

	}

}
