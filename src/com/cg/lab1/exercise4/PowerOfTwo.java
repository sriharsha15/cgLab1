package com.cg.lab1.exercise4;

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Power obj=new Power();
		System.out.println(obj.checkNumber(n));
        sc.close();
	}

}
