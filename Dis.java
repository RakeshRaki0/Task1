package com.java.Task;

import java.util.Scanner;

public class Dis {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        int amount = s.nextInt();
        double discount = 0;

        if (amount >= 1000){
            discount = (0.20 * amount);
            amount = (int) (amount - discount);
            System.out.println("you will get 20% discount of your amoount is "+ amount);
        } else if (amount > 500 && amount <=1000) {
            discount = (0.10 * amount);
            amount = (int) (amount - discount);
            System.out.println("You will get 10% discount of your amount is "+ amount);
        }else {
            System.out.println("You purchased below 500 so no discount is applied");
        }

    }
}
