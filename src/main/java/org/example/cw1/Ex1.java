package org.example.cw1;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.trim();
        String[] array = str.split(" ");
        for (int i = array.length - 1; i < array.length; i--) {
            System.out.println(array[i]);
            }
        }
    }

