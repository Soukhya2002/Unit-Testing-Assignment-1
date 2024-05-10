package org.example;

public class Main {
    public static String toUpperCase(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i)) && Character.isLowerCase(str.charAt(i))) {
                result.append(Character.toUpperCase(str.charAt(i)));
            } else {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }

    public static void isEmpty(String str) {
        if (str.isEmpty()) {
            System.out.println("There are no lowercase letters to convert.");
        }
    }
    public static void isNull(String str) {
        try {

            String convertedStr = toUpperCase(str);
            if (str.equals(convertedStr)) {
                System.out.println("There are no lowercase letters to convert.");
            } else {
                System.out.println("Converted string: " + convertedStr);
            }
        } catch (NullPointerException e) {
            System.out.println("Null pointer exception occurred.");
        }
    }

    public static void isNumber(String str) {
        try {
            Integer.parseInt(str);
            System.out.println("There are no lowercase letters to convert and numbers are not allowed.");
        } catch (NumberFormatException e) {
            System.out.println("Not a valid number.");
        }
    }

    public static void main(String[] args) {
        String str = toUpperCase("SOUKHYA");
        System.out.println(str);
        String str1 = toUpperCase("soukhya");
        System.out.println(str1);
        String str2 = toUpperCase("Hello World");
        System.out.println(str2);


        isEmpty("");
        isNull(null);
        isNumber("123");
    }
}
