package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 7 Solution
 *  Copyright 2021 Brandon Lopez
 */
import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the length of the room in feet?");
        String uilength = sc.nextLine();
        System.out.println("What is the width of the room in feet?");
        String uiwidth = sc.nextLine();
        System.out.println("You entered dimensions of 15 feet by 20 feet.");
        Integer length = Integer.valueOf(uilength);
        Integer width = Integer.valueOf(uiwidth);
        double mConversion = 0.09290304;
        double ftArea = length * width;
        double mArea = ftArea * mConversion;

        String footArea = String.format("%.0f",ftArea);
        String meterArea = String.format("%.3f",mArea);

        System.out.println(footArea + " square feet");
        System.out.println(meterArea + " square meters");


    }
}