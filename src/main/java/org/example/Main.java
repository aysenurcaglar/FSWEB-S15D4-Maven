package org.example;


public class Main {
    public static void main(String[] args) {
        String[] testStrings = {"I did, did I?", "Racecar", "hello", "Was it a car or a cat I saw?", "Ey Edip, Adana'da pide ye."};
        for (String testStr : testStrings) {
            System.out.println(testStr + " => " + (checkForPalindrome(testStr) ? "palindrom" : "palindrom değil"));
        }
    }

    public static boolean checkForPalindrome(String str) {
        String formattedStr = formatString(str);
        String reversedStr = reverseString(formattedStr);
        return formattedStr.equals(reversedStr);
    }
    private static String formatString(String str) {
        str = str.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        return str;
    }
    private static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

}