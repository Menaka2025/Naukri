package org.doubts;

public class StaticDoubt {

	static int a=10;
	static int b=20;
	public static void doubt()
	{
		
		System.out.println("Doubt");
		System.out.println(a+b);//30
	}
	public static void doubt1()
	{
//	this.doubt();
//	Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//		Cannot use this in a static context
		System.out.println("Doubt Doubt");
		System.out.println(a);//10
	}
	
}
