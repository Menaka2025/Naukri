package org.sample;

public class Hybrid1 extends Hybrid{// parent B/Kid of A
public void colour() {
	System.out.println("******Car Colour*****");
	System.out.println("Red");
	System.out.println("Black");
	System.out.println("Blue");
	System.out.println("White");
}
void seater() {
	System.out.println("******Seater******");
	System.out.println("Single");
	System.out.println("Double");
	System.out.println("Four");
	System.out.println("Seven");
}
void carFeatures() {
	System.out.println("*****Features******");
	System.out.println("Airbags");
	System.out.println("Economic Seat");
	System.out.println("Adjustable Seat");
}
 private void CarFunctions() {
	System.out.println("******Functions******");
	System.out.println("Engine For Power");
	System.out.println("Brake for Stop");
	System.out.println("Steering for Direction Control");
}
public static void main(String[]args) {
	Hybrid1 h=new Hybrid1();
	h.carName();
	h.colour();
	h.carFeatures();
	h.CarFunctions();
}
}
