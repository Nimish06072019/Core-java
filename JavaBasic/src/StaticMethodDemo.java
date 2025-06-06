
public class StaticMethodDemo {
	
	public static void main(String[] args) {
		System.out.println("Hello from main method");
		System.out.println();
		StaticMethodDemo.method1();
	}
	static {
		System.out.println("Hello from static block");
		System.out.println();
		StaticMethodDemo.method1();
	}
	static void method1() {
		System.out.println("Loading Greeting from static method!!!!!");
	}

}
