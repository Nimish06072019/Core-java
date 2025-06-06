
public class NonStaticBlock {

	int num; // non-static variable
	
	NonStaticBlock() {
		System.out.println("Inside the constructor");
		System.out.println();
	}
	
	{
		System.out.println("Inside the non static block");
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		System.out.println("Instide the main method");
		System.out.println();
		new NonStaticBlock();
	}
	
}
