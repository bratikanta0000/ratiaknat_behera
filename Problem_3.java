
/*With a single integer as the input, generate the following until a = x [series of numbers as shown in below examples]
 
  Output: (examples)
    1) input a = 1, then output : 1
    2) input a = 2, then output : 1
    3) input a = 3, then output : 1, 3, 5
    4) input a = 4, then output : 1, 3, 5
    5) input a = 5, then output : 1, 3, 5, 7, 9
    6) input a = 6, then output : 1, 3, 5, 7, 9
    .
    .
    7) input a = x, then output : 1, 3, 5, 7, .......*/

package com.tandemloop.problem;
import java.util.Scanner;

public class Problem_3 {
	
		public void generateOddNumbers(int a) {
			int limit;
			if (a % 2 == 0) {
				limit = a - 1;
			} else {
				limit = a;
			}
			for (int i = 0; i < limit; i++) {
				System.out.print((2 * i + 1));
				if (i < limit - 1) {
					System.out.print(", ");
				}
			}
		}

}
//main class
class MainOdd {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int a = scanner.nextInt();
		Problem_3 oddlogic = new Problem_3();
		oddlogic.generateOddNumbers(a);
		scanner.close();
	}
}
