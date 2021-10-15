package com.info;

import java.util.Scanner;

public class exercise3{
    public static void main(String[] args){
        int num;
        Scanner numInt = new Scanner(System.in);
        System.out.println("Enter one integer number: ");
        num = numInt.nextInt();
        numInt.close();

        for (int i = 0; i < num; i++) {
            for (int n = 1; n < i+2; n++) {
                System.out.print(n + "  ");
            }
            System.out.println();
        }
    }
}
