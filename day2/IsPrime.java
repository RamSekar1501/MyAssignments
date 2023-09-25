package week1.day2;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
	
		//int num =17;
		//To get user input
		
		Scanner value = new Scanner(System.in);
		System.out.println("Enter the number to check given number is Prime or not");
		int num= value.nextInt();
        int count =0;
		for(int i=2;i<num;i++)
	    {
		   if(num%i==0)
		    {
			count =1;
			break;
			}
		}
		if(count==1)
		{
			System.out.println("Given number is not Prime");
		}
		else
		{
			System.out.println("Given number is Prime");
		}
		
	}
	

}
