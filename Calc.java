package demo;
import java.util.Scanner;

class Calculator{
	int a,b;
	Calculator(int a,int b){
		this.a= a;
		this.b=b;
	}
	public  int addition() {
		return a+b;
	}
	public int subtraction() {
		return a-b;
	}
	public int multiply() {
		return a*b;
	}
	public int division() {
		if(b==0) {
			System.out.println("Error!Division by zero is not allowed !");
			return 0;
		}
		else {
			return a/b;
		}
	}
}
public class Calc {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int a = scan.nextInt();
		System.out.println("Enter the second number: ");
		int b = scan.nextInt();
		System.out.println("Enter the Opertion '+' , '-' , '*' or '/' : ");
		String op =scan.next();
		Calculator Meth =new Calculator(a,b);
		int result =0;
		switch(op) {
		case  "+":
			result=Meth.addition();
			
			break;
		case "-":
			result=Meth.subtraction();
			break;
		case "*":
			result=Meth.multiply();
			break;
		case "/":
			result=Meth.division();
			break;
		default:
			System.out.println("Invalid Opertion!");
			}
		System.out.println(a+""+op+""+b+" = "+result);
		scan.close();
	}

}
