import java.util.*;
public class Calculator
{
	public static void main(String args [])
	{
		int number1,number2;
		double num1,num2;
		double answer=0;
		char operator;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Operands");
		number1=sc.nextInt();
		number2=sc.nextInt();
		num1=number1;
		num2=number2;
		System.out.println("Enter the Operator(+,-,*,/,%)");
		operator=sc.next().charAt(0);
		switch(operator)
		{
			case '+' : answer=num1+num2;
				System.out.println(answer);
				break;
				
			case '-' : answer =num1-num2;
				System.out.println(answer);
				break;

			case '*' : answer=num1*num2;
				System.out.println(answer);
				break;

			case '/' : answer=num1/num2;
				System.out.println(answer);
				break;

			case '%' : answer=num1%num2;
				System.out.println(answer);
				break;

			default: System.out.println("Enter Valid Operator");
			break;
		}
	}

}
