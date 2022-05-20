package com.masai;

public class prime_factorial {

	static void prime(int n)
	{
		if(n<2 || n>100)
		{
			System.out.println("Invalid number");
		}
		else
		{
			for(int i=1; i<=n; i++)
			{
				if(n%i==0)
				{
					System.out.print(i+", ");
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		prime(12);
	}
}
