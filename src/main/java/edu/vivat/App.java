package edu.vivat;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Enter a string/number to check if it is a palindrome");
        String s = in();
        if (palindrom(s)) System.out.println("Is palindrome");
        else System.out.println("Is not palindrome");
    }

    private static String in() {
        Scanner s = new Scanner(System.in);
        return s.nextLine();
    }

    public static boolean palindrom(String s) {
        String reverse = "";
        int length = s.length();
        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + s.charAt(i);
        }
        return s.equals(reverse);
    }
}
