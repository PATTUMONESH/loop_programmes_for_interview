package loop_programing_questions;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		
		
		
		int n,i,f=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number you wanna factorial:");
		n=sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
			f=f*i;
		}
		System.out.println("factorial is :" +f);

	}

}
