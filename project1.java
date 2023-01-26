import java.util.Scanner;

public class project1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number");
		double a = sc.nextDouble();
		System.out.println("Enter 2nd number");
		Double b = sc.nextDouble();
		System.out.println("Enter the operator + , - * , /");
		char operator = sc.next().charAt(0);
		switch (operator){
		case '+':
			System.out.println("The sum is : " + (a + b));
			break;
		case '-':
			System.out.println("The difference is : " + (a - b));
			break;
		case '*':
			System.out.println("The product is : " + (a * b));
			break;
		case '/':
			System.out.println("The Quotient is : " + (a / b));
			break;
		default:
				System.out.println("Enter correct Operator");
		}
		System.out.println("Thank You");
	}
}
