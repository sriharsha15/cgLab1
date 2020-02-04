package com.cg.lab1.exercise3;

import java.util.Scanner;

public class IncreasingNumber {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int number=sc.nextInt();
		Number obj= new Number();
		System.out.println(obj.checkNumber(number));
		sc.close();
	}

}
