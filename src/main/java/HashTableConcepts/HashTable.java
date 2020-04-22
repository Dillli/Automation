package HashTableConcepts;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTable {

	public static void main(String[] args) {

		Hashtable ht = new Hashtable();

		ht.put(1, "Ram");
		ht.put(2, "Pusa");
		ht.put(3, "Charan");
		ht.put(4, "Kiran");

		Hashtable ht1 = new Hashtable();

		ht1 = (Hashtable) ht.clone();

		System.out.println(" ht " + ht);
		System.out.println(" ht1 " + ht1);

		ht.clear();

		System.out.println(" ht " + ht);
		System.out.println(" ht1 " + ht1);

		Hashtable ht4 = new Hashtable();

		ht4.put(1, "Ram");
		ht4.put(2, "Pusa");
		ht4.put(3, "Charan");
		ht4.put(4, "Kiran");

		if (ht4.containsValue("Dil")) {
			System.out.println(" value is found ");
		} else {
			System.out.println("value is  not found");
		}

		System.out.println(" using of enumeration ");

		Enumeration enu = ht4.elements();
		while (enu.hasMoreElements()) {

			System.out.println(enu.nextElement());
		}

		System.out.println(" using of entry set ");
		Set ent = ht4.entrySet();

		System.out.println(ent);

//		System.out.println(" both hastable are equal or not");

		Hashtable ht5 = new Hashtable();

// generic 

		Hashtable<String, String> ht6 = new Hashtable<>();

		ht5.put(1, "Ram");
		ht5.put(2, "Pusa");
		ht5.put(3, "Charan");
		ht5.put(4, "Kiran");
		// no null key and values -- null pointer exception
		// only unique elements
		if (ht5.equals(ht4)) {

			System.out.println(" both are equal");
		}

		// get the value from key

		System.out.println(ht5.get(4));

		// get the hashcode
		System.out.println(ht5.hashCode());

	}

}
