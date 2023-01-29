package com.greatlearning.Q1.main;

import java.util.Scanner;

import com.greatlearning.Q1.Service.BalancingBrackets;

public class DriverQ1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		BalancingBrackets balancingBrackets = new BalancingBrackets();

		System.out.println("Enter the String of Paranthesis : ");
		String bracketExpression = sc.nextLine();

		Boolean result = balancingBrackets.checkingBracketsBalanced(bracketExpression);

		if (result)
			System.out.println("The entered String has Balanced Brackets !!!");
		else
			System.out.println("The entered Strings do not contain Balanced Brackets !!!");
		
		sc.close();
	}
}
