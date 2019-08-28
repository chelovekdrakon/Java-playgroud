package com.company;
import java.util.Scanner;
import java.lang.*;

public class Main {
    public static int number = 25;

    public static class CGSize {
        int width;
        int height;
    }

    public static class CGPoint {
        int x;
        int y;
    }

    public static class Rectangle {
        CGSize size;
        CGPoint position;
    }

    public static void main(String[] args) {
//        calculate();
//        sqrt();
        print("Ola!");
    }

    static void print(String str) {
        for (int i = 0; i < 4; i++) {
            System.out.println(str);
        }
    }

    static void sqrt() {
        int a, b;
        System.out.println("Введите число для вычисления корня: ");
        a = new Scanner(System.in).nextInt();
        b = (int) Math.sqrt(a);
        System.out.println("Корень числа " + a + " =" + b);
    }

    static void calculate() {
        int a, b, c;
        String s1, s2;
        System.out.println("Введите два числа");
        a = new Scanner(System.in).nextInt();
        b = new Scanner(System.in).nextInt();
        c = a + b;
        System.out.println("Сумма ваших чисел равна " + c);
    }
}
