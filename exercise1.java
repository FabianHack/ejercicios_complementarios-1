package com.info;

import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args){
        Scanner inputData = new Scanner(System.in);
        System.out.println("Hello, please enter your full name: ");
        String name = inputData.nextLine();
        System.out.println("Hello " + name + "!");
    }
}

