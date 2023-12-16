package org.example.Strings;

import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter arr[" + i + "]: ");

            arr[i] = sc.nextInt();
        }
        perfectSquare(arr, n);
    }
public static void perfectSquare(int[] arr, int n) {
    int count = 0;
    for (int i = 0; i < n; i++) {
        double square = Math.sqrt(arr[i]);
        for (int j = 0; j < n; j++) {
            if (arr[i] == square) {
                count=count+1;
            }

        }


    }
    System.out.println(count);
}
}
