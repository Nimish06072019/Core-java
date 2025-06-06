
public class ExplicitCst {

	public static void main(String[] args) {
		
		int i = 67;
		char ch= (char)i;
		System.out.println(ch);
		
		int x  = -50;
		int y = 120;
		y = +y;
		byte result = (byte)(x+y);
		System.out.println(result);
		
		int a = 100;
		int b = 200;
		int c = a&b;
		int d = a|b;
		int e = a^b;
		System.out.println(c+ " " + d + " " + e);
	}

}
