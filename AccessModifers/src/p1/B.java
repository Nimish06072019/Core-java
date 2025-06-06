package p1;

public class B {

	public static void main(String[] args) {

		A obj2 = new A();
		
		// System.out.println(obj2.a); gives error because a is private not accessible outside the class
		System.out.println(obj2.b);
		System.out.println(obj2.c);
		System.out.println(obj2.d);
		
	}

}
