package com.hierarchical.Inheritance;

public class OverridingTest {

	public static void main(String[] args) {

		Bike b1 = new Bike();
		Bus b2 = new Bus();
		Car c1 = new Car();
		
		System.out.println(b1.fuel());
		System.out.println(b2.fuel());
		System.out.println(c1.fuel());
	}

}
