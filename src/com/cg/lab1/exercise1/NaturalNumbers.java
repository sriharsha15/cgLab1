package com.cg.lab1.exercise1;

import java.util.Scanner;

public class NaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Sum obj=new Sum();
		System.out.println(obj.calculateSum(n));
		sc.close();
	}

}
