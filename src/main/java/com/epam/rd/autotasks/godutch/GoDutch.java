package com.epam.rd.autotasks.godutch;

import java.util.Scanner;

public class GoDutch {

    public static void main(String[] args) {
        try (// Write code here
                Scanner sc = new Scanner(System.in)) {
            int bill, friends;
            bill = sc.nextInt();
            friends = sc.nextInt();

            int nBill = (int) (((int) bill * 1.1) / friends);
            if (bill < 0) {
                System.out.println("Bill total amount cannot be negative");
            } else if (friends <= 0) {
                System.out.println("Number of friends cannot be negative or zero");
            } else {
                System.out.println(nBill);
            }
        }
    }
}
