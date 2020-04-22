package FinalFinallyFinalize;

import ExceptionHandling.FinallyConcept;

public class Finalize {
	
	public void finalize() {
		
		System.out.println("  " + "finalize method");
	}

	// Finalize is a Method
	
	public static void main(String[] args) {
		Finalize f1 = new Finalize();
		Finalize f2 = new Finalize();
		Finalize f3 = new Finalize();
		Finalize f4 = new Finalize();

		f1 = null;
		f3 = null;
		f4 = null;
		f2 = null;
		
		// it will remove the unused objects

		System.gc();
	}
}
