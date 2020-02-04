package com.codegym;

import java.util.InputMismatchException;

public class LllegalTriangleException {
    public static void main(String[] args) {

    }

    public void Tamgiac(int a, int b , int c){
        try {
        if ( a < 0 || b < 0 || c < 0){
                System.out.println("So nhap vao nho hon 0 ");
        }
        else if (a + b < c || a + c < b || b + c < a) {
            System.out.println("Khong phai tam giac");
        }
        else {
            System.out.println("La tam giac");
        }
        }catch (InputMismatchException e){
            System.err.println("Loi nhap vao kieu khong phai so : " + e.getMessage());
        }catch (Exception e){
        }
        finally {
            System.out.println("End");
        }
    }
}
