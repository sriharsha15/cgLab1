package com.cg.lab1.exercise4;

public class Power {
	
boolean checkNumber(int n)
	{
		if (n<=1)
		{
		return false;
		}
		while(n>1)
		{
			if(n%2!=0)
			{
			return false;
			}
			n=n/2;
		}
		return true;	
		
	}	
}
