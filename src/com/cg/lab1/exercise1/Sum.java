package com.cg.lab1.exercise1;

public class Sum {

	public int calculateSum(int n)
	{ 
		int sum = 0;
		for(int index=0;index<=n;index++)
		{
			if(index%3==0||index%5==0)
			{
				sum=sum+index;
			}
		}
		return sum;

	}

	

}
