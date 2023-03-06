package org.example.cw2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = 0;
        int a = sc.nextInt();
        int b = sc.nextInt();
        while (b != 0) {
            if (a > 0 && b < 0) {
                k++;
            }
            a = b;
            b = sc.nextInt();
        }
        System.out.println("k : " + k);
        sc.close();
    }
}
