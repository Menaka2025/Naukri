package com.keywords_constructor;

public class Keyword1 extends FinalKeyword {

   public void sample() {
		super.sample();// super keyword used for call parent class method
	    this.sample2();// this keyword is used for call a current class method
		
	    int a=100;
		
		int b=50;
		System.out.println(a);
		
		System.out.println(b);
		
	}
public void sample2() {
	
	System.out.println("Hello");
}
	public static void main(String[] args) {
		Keyword1 k=new Keyword1();
		k.sample();
		
	}
}
