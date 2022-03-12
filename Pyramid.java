package study;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no:");
		int no=sc.nextInt();
		
		for(int i=1;i<=no;i++)
		{
			for(int j=no-1;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
		
		
		
		for(int i=1;i<=no;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=no-1;k>=i;k--)
			{
				System.out.print(" *");
			}
			System.out.println();
		}

	}

}
