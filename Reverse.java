package com.java.Task;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter the number: ");
        int rev=s.nextInt();
        int sum=0;
        for (int i=0; rev >0;i++){
            int rem = rev % 10;
            sum = (sum*10) + rem;
            rev /=10;

        }
        System.out.println(sum);
    }
}
