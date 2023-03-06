package org.example.cw1;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        while (str.contains(" " + " ")) {
            str = str.replaceAll(" " + " ", " ");
        }
        str = str.trim();
        System.out.print(str);
        String[] array = str.split(" ");
        System.out.println(Arrays.deepToString(array));
        String[]res = new String[array.length];
        String result = "";
        for (int i = 0; i < array.length; i++) {
            res[res.length-i-1] = array[i];
        }
        System.out.println(Arrays.deepToString(res));
        for (int i = 0; i < res.length; i++){
            result = result + " " + res[i];
        }
        System.out.print(result);
    }
}
