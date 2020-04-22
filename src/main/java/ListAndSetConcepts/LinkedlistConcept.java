package ListAndSetConcepts;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedlistConcept {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Rakesh");// 0
		ll.add("Harshad");// 1
		ll.add("Anusha");// 2

		System.out.println(" before " + ll);

		ll.addFirst("subbu ");
		ll.addLast(" hafuu ");

		System.out.println(" After " + ll);

		System.out.println(" get value " + ll.get(0));

		ll.set(0, "Somesh");

		System.out.println(" get value " + ll.get(0));
//	  
//	ll.removeFirst();
//	ll.removeLast();
//	
//	ll.remove();
		// how to print all the values
		System.out.println("*********** for loop");
		for (int i = 0; i < ll.size(); i++) {
			System.out.println(" " + ll.get(i));
		}

		System.out.println(" **************  advanced for loop");
		for (String str : ll) {
			System.out.println(str);
		}

		System.out.println("************iterator  loop");
		Iterator<String> it = ll.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("******  advanced while loop");
		
		int n =0;
		
		while(ll.size()>n) {
			
			System.out.println(ll.get(n));
			n++;
		}

	}

}
