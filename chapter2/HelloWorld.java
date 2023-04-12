package chapter2;
import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// 2.2 First program in java
		System.out.println("Welcome to Java Programming");
		
		
		// 2.3 Modifying My first java program
		System.out.print("Welcome To");
		System.out.println("Java Programming");
		
		// 2.4 Displaying text with printf
		System.out.printf("%s\n%s\n",
				"Welcome to", "Java Programming");
		
		
		// 2.5 Adding integer
		Scanner input = new Scanner(System.in);
		
		int number1;
		int number2;
		int sum;
		
		System.out.print("Enter first integer: ");
		number1 = input.nextInt();
		
		System.out.print("Enter second integer: ");
		number2 = input.nextInt();
		
		sum = number1 + number2;
		System.out.printf("Sum is %d\n",sum);
		
		if(number1 == number2)
			System.out.printf("%d == %d\n",number1,number2);
		if(number1 != number2)
			System.out.printf("%d == %d\n",number1,number2);
		if(number1 < number2)
			System.out.printf("%d == %d\n",number1,number2);
		if(number1 > number2)
			System.out.printf("%d == %d\n",number1,number2);
		if(number1 <= number2)
			System.out.printf("%d == %d\n",number1,number2);
		if(number1 >= number2)
			System.out.printf("%d == %d\n",number1,number2);
	}

}
