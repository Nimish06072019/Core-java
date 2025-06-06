
public class StaticVariable {
	int speed; // non-static variable (unique for each Car object)

    public void setSpeed(int s) {
        speed = s;
    }

    public void showSpeed() {
        System.out.println("Speed: " + speed);
    }
    
    static int num = 9; // static integer variable 
    
    public static void main(String[] args) {
    	StaticVariable car1 = new StaticVariable();
    	StaticVariable car2 = new StaticVariable();

        car1.setSpeed(100);
        car2.setSpeed(150);

        car1.showSpeed(); // Output: Speed: 100
        car2.showSpeed(); // Output: Speed: 150
        
        num = 10;
        System.out.println(num);
    }
    
}


