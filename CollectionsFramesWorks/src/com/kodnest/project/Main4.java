package com.kodnest.project;
import java.util.Iterator;
import java.util.LinkedList;

public class Main4 {
	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		System.out.println(("Using for-each lopp"));
		for(Object o:ll)
		{
			System.out.println(o);
		
			
		}
		
		System.out.println("Using iterator");
		Iterator it=ll.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		
	}
	}

}
