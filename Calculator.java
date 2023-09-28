/*
 * Write a menu driven program using switch statement. Find addition,subtraction,multiplication and
 * division of two integer numbers.
 * Name - Abir Nath
 * Batch Code - ANP-C5993
 * ID - AF0311400
 */
package codingtest;
import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int num1=sc.nextInt(); //taking the first number from user
		System.out.println("Enter the second number : ");
		int num2=sc.nextInt(); //taking the first number from user
		System.out.println("1. Enter 1 for Addition \n2.Enter 2 for Subtraction \n3. Enter 3 for Multiplication \n4.Enter 4 for Division \n Enter your choice : ");
		int ch=sc.nextInt(); // taking the choice from the user
		switch(ch){
		case 1:
			System.out.println("Result = "+(num1+num2));	//to perform addition and display the result
			break;
		case 2:
			System.out.println("Result = "+(num1-num2));	//to perform subtraction and display the result
			break;
		case 3:
			System.out.println("Result = "+(num1*num2));	//to perform multiplication and display the result
			break;
		case 4:
			System.out.println("Result = "+(num1/num2));	//to perform division and display the result	
			break;
		default :
			System.out.println("Wrong Input !!!");	//Prints the message if the choice is wrong 
		}
	}

}
