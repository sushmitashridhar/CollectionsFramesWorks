package com.kodnest.project;

public class Student {
	int age;
	String name;
	public Student(int age,String name) {
		this.age=age;
		this.name=name;
	}
	//overriding the toString()
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student{name:"+name+",age:"+age+"}";
	}

}
