package com.cg.lab1.exercise2;

import java.util.Scanner;

public class Difference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Square obj=new Square();
		System.out.println(obj.calculateDifference(n));
        sc.close();
	}

}
