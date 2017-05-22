package com.basics.numeric;

public class CheckNumberPrime {

	public static void main(String args[]) {
		int number = 50;
		if(isPrime(number))
		{
			System.out.println("Prime Number");
		}
		else
		{
			System.out.println("Not Prime Number");
		}
	}

	private static boolean isPrime(int num) {
		for (int i=2;i<num;i++)
		{
			if(num%i == 0)
			{
				return false;
			}
		}
		return true;
	}
}
