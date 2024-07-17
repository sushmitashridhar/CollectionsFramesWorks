package com.kodnest.project;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ArrayDeque; 
import java.util.PriorityQueue;

public class Main2 {
	public static void main(String[] args) {
	/*	TreeSet ts=new TreeSet();
		ts.add(20);
		ts.add(10);
		ts.add(30);
		ts.add(50);
		ts.add(40);
		System.out.println(ts);
		
		ts.add("deepa");
		ts.add("smi");
		ts.add("sush");
		ts.add("rums");
		ts.add("sacchi");
		System.out.println(ts);
		ArrayList al=new ArrayList();
		al.add(20);
		al.add(40);
		al.add(50);
		al.set(2, 60);
		al.set(0, 'h');
		al.set(1, 56.80);
		al.set(1, 66.80);
		
		System.out.println(al);
		ArrayList al2=new ArrayList();
		al2.add(40);
		al2.add(10);
		al2.add(60);
		al2.set(1,90);
		al2.set(0, 4.9);
		al2.set(2,"....");
		System.out.println(al2);
		ArrayList al3=new ArrayList();
		al3.add(al);
		al3.add(al2);
		System.out.println(al3);
		*/
		
	/*	LinkedList ll=new LinkedList();
		ll.add(20);
		ll.add(40);
		ll.add(50);
		ll.set(2, 60);
		ll.set(0, 'h');
		ll.set(1, "56.80");
		ll.set(1, "66.80");
		ll.set(1,true);
		System.out.println(ll);
		LinkedList ll2=new LinkedList();
		ll2.add(40);
		ll2.add(10);
		ll2.add(60);
		ll2.set(1,90);
		ll2.set(0, 4.9);
		ll2.set(2,"....");
		ll2.set(1,false);
		System.out.println(ll2);
		LinkedList ll3=new LinkedList();
		ll3.add(ll);
		ll3.add(ll2);
		System.out.println(ll3);
		*/
		
	/*	ArrayDeque ad=new ArrayDeque();
		ad.add('h');
		ad.add("true");
		ad.add(60);
		
		ArrayDeque ad2=new ArrayDeque();
		ad2.add(4.9);
		ad2.add("false");
		ad2.add("...");
		ad2.remove("...");
		ad2.addLast("true");
		
		ArrayDeque ad3=new ArrayDeque();
		ad3.add(ad);
		ad3.add(ad2);
		System.out.println(ad3);
		*/
		
	/*	PriorityQueue pq=new PriorityQueue();
		pq.add('r');
		pq.add('t');
		pq.add('a');
		pq.add('r');
		pq.add('t');
		System.out.println(pq);
		*/
		
	/*	TreeSet ts=new TreeSet();
		ts.add('r');
		ts.add('t');
		ts.add('a');
		ts.add('r');
		ts.add('t');
		System.out.println(ts);
		
		
		PriorityQueue pq=new PriorityQueue();
		pq.add(30);
		pq.add(40);
		pq.add(10);
		pq.add(50);
		pq.add(78);
		System.out.println(pq);
		*/
		TreeSet ts=new TreeSet();
		ts.add(30);
		ts.add(40);
		ts.add(10);
		ts.add(50);
		ts.add(78);
		System.out.println(ts);
		
		ArrayDeque ad=new ArrayDeque();
		ad.addAll(ts);
		System.out.println(ad.getFirst());//smallest
		System.out.println(ad.getLast());//largest
		
		
		
		
		
		
		
	}

}
