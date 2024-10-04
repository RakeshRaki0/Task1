package com.java.Task;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of pattern: ");
        int pattern =s.nextInt();
        for (int i=pattern; i >=1;i-- ){
            for (int j= pattern; j >= 1; j-- ){
                System.out.print(Math.max(i,j));
            }
            System.out.println();
        }
    }
}
