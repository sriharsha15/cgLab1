package com.cg.lab1.exercise2;

public class Square {
	
	public int calculateDifference(int n)
	{
		int squareSum= (n*(n+1)*(2*n+1))/6;

		int result= (n*(n+1))/2;
		int sumSquare =result*result;
		int difference=squareSum-sumSquare;
		return difference;
	}

	
}
