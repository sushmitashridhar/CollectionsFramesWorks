package com.kodnest.project;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("smi");
		al.add("sush");
		al.add("sacchi");
		System.out.println(al);
		al.add(0,"brahmi");
		System.out.println(al);
		al.add(2,"sush");
		System.out.println(al);
		
		ArrayList cpl=new ArrayList();
		cpl.add("K L Rahul");
		cpl.add("Dhoni");
		cpl.add("Shreyas iyer");
		System.out.println(cpl);
		
		ArrayList fpl=new ArrayList();
		fpl.add("Messi");
		fpl.add("Ronaldo");
		System.out.println(fpl);
		
		ArrayList p=new ArrayList();
		p.add(cpl);
		p.add(fpl);
		System.out.println(p);
		
		ArrayList p2=new ArrayList();
		p2.addAll(cpl);
		p2.addAll(fpl);
		System.out.println(p2);
		
		ArrayList sum=new ArrayList();
		sum.add("dj");
		sum.add("mj");
		sum.add("bp");
		System.out.println(sum);
		sum.set(0,"ml");
		System.out.println(sum);
		sum.remove(0);
		System.out.println(sum);
		
		
	}

}
