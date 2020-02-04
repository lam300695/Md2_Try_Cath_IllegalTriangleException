package com.codegym;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LllegalTriangleException lllegalTriangleException = new LllegalTriangleException();
        System.out.println("Canh a la : ");
        int a = sc.nextInt();
        System.out.println("Canh b la : ");
        int b = sc.nextInt();
        System.out.println("Canh c la : ");
        int c = sc.nextInt();

        lllegalTriangleException.Tamgiac(a,b,c);
    }
}
