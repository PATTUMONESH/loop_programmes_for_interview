package loop_programing_questions;

public class series_1_to_100_even_sum {

	public static void main(String[] args) {
		int i;
		int sum=0;
		for(i=1;i<=100;i++)
		{
			if(i%2==0) 
			{
			System.out.println(i);
			sum=sum+i;
		}
		}
		
		System.out.println("sum=" + sum);
	}

	}


