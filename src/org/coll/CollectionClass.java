 package org.coll;

import java.util.ArrayList;
import java.util.List;

public class CollectionClass {
	
	public void java() {
		System.out.println("facebook");
	}
	public void selenium() {
		System.out.println("git hub");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List li = new ArrayList();
		li.add("Greens");
		li.add("OMR");
		li.add(2345);
		li.add(2389.883f);
		li.add(2345);

		
		
		
		
		
		
		System.out.println(li);
		int size = li.size();
		System.out.println(size);
		
		int indexOf = li.indexOf("Greens");
		System.out.println(indexOf);

		int lastIndexOf = li.lastIndexOf("OMR");
		System.out.println(lastIndexOf);

		boolean contains = li.contains(2345);
		System.out.println(contains);

		li.add("selenium");
		System.out.println(li);
		
		li.set(3, "Automation");
		System.out.println(li);
		
		for (int i = 0; i<4 ; i++) {
			System.out.println(li.get(i));
			
			
		}
	}

}
