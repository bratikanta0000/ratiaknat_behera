package com.tandemloop.problem;
import java.util.Scanner;

public class Problem_2 {
	
		public void generateOddNumbers(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print((2 * i + 1));
			if (i < n - 1) {
				System.out.print(", ");
			}
		}
		System.out.println();
	}
	

}
//main class
class MainOdd {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int a = scanner.nextInt();
		Problem_2 oddlogic = new Problem_2();
		oddlogic.generateOddNumbers(a);
		scanner.close();
	}
}