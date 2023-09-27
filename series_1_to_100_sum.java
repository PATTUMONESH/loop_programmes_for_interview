package loop_programing_questions;

public class series_1_to_100_sum {

	public static void main(String[] args) {
	
		int i;
		int sum=0;
		for(i=1;i<=100;i++)
		{
			
			System.out.println(i);
			sum=sum+i;
		}
		
		System.out.println("sum=" + sum);
	}

}
