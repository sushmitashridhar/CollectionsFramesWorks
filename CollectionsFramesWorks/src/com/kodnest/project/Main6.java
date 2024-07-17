package com.kodnest.project;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Main6 {
	public static void main(String[] args) {
		HashSet hs=new HashSet();
		//HashFunction  {[(n+4)*3]%10}+1
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(50);
		System.out.println(hs);
		
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add(1);
		lhs.add(2);
		lhs.add(3);
		lhs.add(4);
		lhs.add(5);
		System.out.println(lhs);
		
		

		
	}

}
