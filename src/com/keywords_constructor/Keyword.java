package com.keywords_constructor;

public class Keyword {
	
	static int a,b,c,d;// class level static variable without initialization
	public static void number() {// static method
	a=10;
	b=12;
	c=20;
	d=25;
	System.out.println(a+b);
	System.out.println(c+d);
	}
public static void number(long f) { 
	System.out.println("Phone:"+f);
}
public static void main(String[] args) {
	
	
	number(8787965423l);
		
}
public void sample() {
	// TODO Auto-generated method stub
	
}
}
