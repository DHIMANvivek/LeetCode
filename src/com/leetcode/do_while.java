package com.leetcode;

import java.util.Scanner;

public class do_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Your Marks : ");

		int marks = scan.nextInt();
		do {

			if (marks >= 60) {
				System.out.println("Great You Are Pass");
			} else {
				System.out.println("Sorry You Are Fail");
			}
		} while (marks < 60);

	}
}
