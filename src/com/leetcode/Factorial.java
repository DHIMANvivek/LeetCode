package com.leetcode;

public class Factorial {

	static class fact {

		int facts(int n) {

			if (n == 0)
				return 1;

			return n * facts(n - 1);

		}
	}

	public static void main(String[] args) {

		fact fa = new fact();

		int f = fa.facts(4);

		System.out.println(f);
	}
}