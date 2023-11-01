package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static int add(int a, int b){
        return a + b;
    }

    public static boolean isEven(int n){
        return n % 2 == 0;
    }

    public static int multiplication(int a ,int b){
        return a * b;
    }

    public static String turnStringInUpperCase(String word){
        return word.toUpperCase();
    }

    public static boolean isPositive(int a){
        boolean state = false;
        if (a > 0 ){
            state = true;
        }
        return state;
    }
}