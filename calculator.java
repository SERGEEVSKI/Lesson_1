import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Integer a = in.nextInt();
		String op = in.next();
		Integer b = in.nextInt();
		Integer c = 0;
		
		switch(op) {
			case "+": {
				c = a + b;
			} break;
			case "-": {
				c = a - b;
			} break;
			case "/": {
				c = a / b;
			} break;
			case "*": {
				c = a * b;
			} break;
			default: {
				System.out.println("Incorrect operation!");
				System.exit(0);
			}
		}
		in.close();
		System.out.println("Result is: " + c);
	}
}
