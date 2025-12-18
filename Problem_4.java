package com.tandemloop.problem;

import java.util.HashMap;
import java.util.Scanner;

public class Problem_4 {

    public static HashMap<Integer, Integer> getMultiplesCount(int[] numbers) {
        HashMap<Integer, Integer> result = new HashMap<>();

        
        for (int i = 1; i <= 9; i++) {
            result.put(i, 0);
        }

        
        for (int number : numbers) {
            for (int i = 1; i <= 9; i++) {
                if (number % i == 0) {
                    result.put(i, result.get(i) + 1);
                }
            }
        }
        return result;
    }
}

 class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers of array (separated by commas):");
        String input = scanner.nextLine();

        String[] strNumbers = input.split(",");
        int[] numbers = new int[strNumbers.length];

        for (int i = 0; i < strNumbers.length; i++) {
            numbers[i] = Integer.parseInt(strNumbers[i].trim());
        }

     
        HashMap<Integer, Integer> results =
                Problem_4.getMultiplesCount(numbers);

        System.out.println(results);
        scanner.close();
    }
}

