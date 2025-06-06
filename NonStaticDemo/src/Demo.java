
public class Demo {

	
	
//creating object reference in a static block
//	static {
//		Demo obj = new Demo();
//		System.out.println(obj);
//	}
//	
//	public static void main(String[] args) {
//		
//	}
	
	
//Creating a static reference directly 
	static Demo obj = new Demo();
	
	static {
		System.out.println(Demo.obj);
		Demo.init();
		Demo.obj = Demo.init1();
	}
	
	public static void main(String[] args) {
		System.out.println(Demo.obj);
	}
	
	
	// create a reference in static method
	static void init() {
		Demo.obj = new Demo();
	}
	
	//Another way 
	static Demo init1() {
		return new Demo();
	}
	
}
