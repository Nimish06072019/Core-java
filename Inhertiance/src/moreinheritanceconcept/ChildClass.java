package moreinheritanceconcept;

public class ChildClass extends SuperClass {
	
	ChildClass(){
		this(10);
		System.out.println("No Args ChildClass Construstor");
	}
	
	ChildClass(int x){
		super(x);
		System.out.println("Args ChildClass Construstor");
	}
	
	public static void main(String[] args) {
		ChildClass ch = new ChildClass();
		
	}

}
