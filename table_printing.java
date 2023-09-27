package loop_programing_questions;

import java.util.Scanner;

public class table_printing {

	public static void main(String[] args) {
		
	int n,i,t;
	System.out.println("enter the table you wanna print:");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	for(i=1;i<=10;i++)
	{
		t=n*i;
		System.out.println(t);
	}
	
	
	
		
	}

}
