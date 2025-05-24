package com.keywords_constructor;

public class FinalKeyword extends Keyword{
	
	 final int a=1000; //In final variable we cannot change value.
	 
	 int b=500;
public void sample() {
		 super.number();
		System.out.println(a);
	
		System.out.println(b);
	}

	public static void main(String[] args) {
		FinalKeyword f=new FinalKeyword();
		f.sample();
	}

}
