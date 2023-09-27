package loop_programing_questions;

import java.util.Scanner;

public class no_is_prime_or_not {

	public static void main(String[] args) {
		int n,i;
		
		boolean go=false;
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		if(n>=1) {
		for(i=2;i<=n/2;i++)                             
		{
			if(n%i==0) 
			{
				go=false;
			}
			else
			{
				go=true;
			}
		}
		}
		
		else
		{
			System.out.println("no is less than one");
		}
		if(go) {
			System.out.println("no is prime");
		}
		else
		{
			System.out.println("no is not prime");
		}

	}

}
