package org.example;


import java.text.Normalizer;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String[] testStrings = {"I did, did I?", "Racecar", "hello", "Was it a car or a cat I saw ?", "Ey Edip, Adana'da pide ye."};
        for (String testStr : testStrings) {
            System.out.println(testStr + " => " + (checkForPalindrome(testStr) ? "palindrom" : "palindrom değil"));
        }
        System.out.println("——————————————————————————");
        WorkintechList<String> workintechList = new WorkintechList<>();
        workintechList.add("c");
        workintechList.add("a");
        workintechList.add("b");
        workintechList.add("a");

        System.out.println("Initial list: " + workintechList);
        workintechList.sort();
        System.out.println("Sorted list: " + workintechList);

        workintechList.remove("b");
        System.out.println("Updated list: " + workintechList);

        System.out.println("——————————————————————————");

        int[] decimals = {5, 6, 13, 27, 45};

        for (int decimal : decimals) {
            System.out.println("Decimal " + decimal +
                    " binary karşılığı: " + convertDecimalToBinary(decimal));
        }

    }

    public static boolean checkForPalindrome(String input) {
        input = input.replaceAll("[^a-zA-Z0-9]", "");

        String reverseInput = new StringBuilder(input).reverse().toString();

        return Pattern.compile(input, Pattern.UNICODE_CASE | Pattern.CASE_INSENSITIVE)
                .matcher(reverseInput)
                .matches();
    }

    public static String convertDecimalToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        }

        StringBuilder binary = new StringBuilder();

        while (decimal > 0) {
            int remainder = decimal % 2;
            binary.insert(0, remainder);
            decimal /= 2;
        }

        return binary.toString();
    }

}