package javaclasses;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	@SuppressWarnings("resource")
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter the number");
	
	int num =sc.nextInt();
	int  rev=0;
	while(num!=0)
	{
	rev=rev*10+num%10;
	num=num/10;
	}
	System.out.println("Reverse the number" +rev);
	
	}

}

