package com.duje.palindrome;

import java.util.Scanner;

public class Main {
    static String input;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Unos: ");
        input = sc.nextLine();

        if (provjerPalindrome(input))
            System.out.println("Palindrome");
        else
            System.out.println("Nije Palindrome");

    }

    public static boolean provjerPalindrome(String input) {
        String clean = input.replaceAll("\\s+", "").toLowerCase();
        StringBuilder clean2 = new StringBuilder(clean.replaceAll("[^a-zA-Z0-9]", "").toLowerCase());

        if (clean2.toString().equals(clean2.reverse().toString()))
            return true;
        else
            return false;
    }

}
