package JavaSessions;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {

		ArrayList<Object> ar1 = new ArrayList<Object>();
		System.out.println(ar1.size());
				
		

//		System.out.println(ar.get(0));
//		System.out.println(ar.get(4));
//		
//		//System.out.println(ar.get(6));//IndexOutOfBoundsException
//		
//		for(int i=0; i<ar.size(); i++){
//			System.out.println(ar.get(i));
//		}
		

		ArrayList<String> names = new ArrayList<String>();
		names.add("Rakesh");//0
		names.add("Harshad");//1
		names.add("Anusha");//2
		
		System.out.println(names.size());
		
		ArrayList<Integer> EmpAge = new ArrayList<Integer>();
		EmpAge.add(20);//0
		EmpAge.add(24);//1
		EmpAge.add(30);//2
		
		System.out.println(names.get(0) + " " + EmpAge.get(0));
		
		for(int i=0; i<names.size(); i++){
			System.out.println(names.get(i) + " "+ EmpAge.get(i));
		}
		
		
		for(String n : names){
			System.out.println(n);
		}
		
		EmpAge.forEach((a)->System.out.println(a));
		
		ArrayList<Double> heightLists = new ArrayList<Double>();
		heightLists.add(12.33);
		heightLists.add(100.00);
		
		heightLists.forEach((p)->System.out.println(p));

		
		//00 01 02 03 04 05 06 07 08 09
		//10 11 12 12 14 15
		
		for(int i=0; i<=5; i++){
			for(int j=0; j<=5; j++){
				System.out.print(i+""+j+" ");
				//00 01 02 03 04 05
				//10 11 12 13 14 15
				//20 21 22 23 24 25
			}
			System.out.println();
		}
		
		
		
	}

}
