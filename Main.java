package org.example;


public class Main {
    public static void toUpperCase(char[] str) {
        for (int i = 0, e = str.length; i < e; i++) {
            if (Character.isLetter(str[i]) && Character.isLowerCase(str[i])) {
                str[i] = Character.toUpperCase(str[i]);
            }
        }
        System.out.println(str);
    }

    public static void main(String[] args) {
        char[] str = "Phenom".toCharArray();
        toUpperCase(str);
    }
}
