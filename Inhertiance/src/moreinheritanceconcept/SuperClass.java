package moreinheritanceconcept;

public class SuperClass {

	int x;
	
	public SuperClass() {
		System.out.println("No Args SuperClass Constructor");
		
		
	}
	
	public SuperClass(int x) {
		this();
		this.x = x;
		System.out.println("Args SuperClass Constructor");
	}

}
