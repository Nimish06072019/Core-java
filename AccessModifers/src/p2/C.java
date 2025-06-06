package p2;

import p1.A;

public class C extends A{
	
	int x = 23123;

	public static void main(String[] args) {

		A obj1 = new A();
		System.out.println(obj1.d);// only public variable from p1 is accessible here for accessing c we to create a instance of class C
		
		C obj2 = new C();
		System.out.println(obj2.c);
		System.out.println(obj2.d);
		System.out.println(obj2.x);
		obj2.x = 123;
		System.out.println(obj2.x);
		
	}

}
