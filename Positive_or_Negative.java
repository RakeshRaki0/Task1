package com.java.Task;

import java.util.Scanner;

public class Positive_or_Negative {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the any number to check weather it's positive or negative: ");
        int num=s.nextInt();
        if(num > 0){
            System.out.println("It is positive number");
        }else {
            System.out.println("It is negative number");
        }
    }
}
