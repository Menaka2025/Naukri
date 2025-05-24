package com.keywords_constructor;

public class Constructor1 {

	public Constructor1() {// default connstructor
		System.out.println("***Car Details***");
	}
	public Constructor1(String name) {// parameterized constructor
		
		this();
		System.out.println("Car Name: "+name);
	}
	public Constructor1(int mNum) {
		
		this('1');
		System.out.println("Car Manufacture Year: "+mNum);
	}
	public Constructor1(char a) {
		this("Honda Jazz");
		System.out.println("car model Queue: "+a);
	}
	
	public static void main(String[] args) {
		
		Constructor1 c=new Constructor1(2010); //constructor chaining using this keyword
	}
}
