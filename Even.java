/*
 * 1.Write a program to find the sum of even numbers between 25 to 51. 
 * Name - Abir Nath
 * Batch Code - ANP-C5993
 * ID - AF0311400
 */
package codingtest;
public class Even {

	public static void main(String[] args) {
		int sum=0;//to store the sum of the even numbers
		for(int i=25;i<=51;i++){ //for loop to run from number 25 to 51
			if(i%2==0){	//checking the condition for even number 
				sum=sum+i;//adding the even numbers
			}
		}//for loop closed
		System.out.println("Sum of even numbers between 25 to 51 is = "+sum);//printing the sum of even numbers
		
	}

}
