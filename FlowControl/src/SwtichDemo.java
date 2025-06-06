
public class SwtichDemo {

	public static void main(String[] args) {

		int a = 44;
		char ch  = 'a';
		
		switch (ch) {
		
		case 'a':
			System.out.println("1st case");
			break;
		case 'b':
			System.out.println("2nd case");
			break;
		case 'c':
			System.out.println("3rd case");
			break;
		default:
			System.out.println("Default case");
		}
		System.out.println(a);
	}

}
