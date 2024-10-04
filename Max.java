package com.java.Task;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = s.nextInt();
        System.out.print("Enter the number: ");
        int b = s.nextInt();
        System.out.print("Enter the number: ");
        int c =s.nextInt();

        if (a < b && a < c){
            System.out.println("A is smallest");
        } else if (b < a && b < a) {
            System.out.println("B is Smallest");
        }else {
            System.out.println("C is smallest");
        }
    }
}
