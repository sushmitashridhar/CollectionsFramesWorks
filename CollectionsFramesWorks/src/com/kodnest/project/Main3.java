package com.kodnest.project;

import java.util.ArrayList;
import java.util.Iterator;

public class Main3 {
	public static void main(String[] args)
	{
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
//		System.out.println(al);
//		System.out.println(al.size());
		
		//for loop
//		for(int i=0;i<al.size();i++) {
//			System.out.println(al.get(i)+" ");
//			
//		}
		
		//while loop
	/*	int j=0;
		while(j<al.size())
		{
			System.out.println(al.get(j));
			j++;
		}
		*/
		
		
		//do while loop
	//	System.out.println("do while loop");
	/*	int num=0;
		do {
			System.out.println(al.get(num));
			num++;
			
		}
		while(num<al.size());
		*/
		
		
		//for each loop
	/*	System.out.println("Using for-each Loop");

		for(Object o:al)
		{
			System.out.println(o);
		
			
		}
		*/
		
		System.out.println("Using iterator");
		Iterator it=al.iterator();
		while(it.hasNext()) {
//			System.out.println(it.next());
			System.out.print(it.next()+" ");
		}
		
		
		
		

	
	
		
	}


}
