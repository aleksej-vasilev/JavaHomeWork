package com.pb.vasilyev.hw2;
import java.util.Scanner;


public class Interval {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        int x;
        System.out.println("ВВедите число от 0 до 100");
        x = scan.nextInt();

         if (x>=0 && x<= 14) {
                System.out.println("0-14");
            } else if (x >= 15  && x <= 35) {
                System.out.println("15-35");
            } else if (x >= 36 && x <= 50) {
                System.out.println("36-50");
            } else if (x >= 51 && x <= 100) {
                System.out.println("51-100");
             } else if (x >101){
            System.out.println("число не входит ни в один диапозон");
                }
    }
}
