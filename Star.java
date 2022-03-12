

package study;

import java.util.Scanner;

public class Star {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();

		for(int i=1;i<=num;i++)
		{
			for(int j=num;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<i*2;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int m=num-1;m>=1;m--)
		{
			for(int n=num-1;n>=m;n--)
			{
				System.out.print(" ");
			}
			for(int o=1;o<m*2;o++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
