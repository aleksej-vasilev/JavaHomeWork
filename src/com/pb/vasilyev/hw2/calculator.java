package com.pb.vasilyev.hw2;
import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //    char num = 'A';
        int operand1;
        int operand2;
//        String symbol;
        System.out.print(" operand1");
        operand1 = scan.nextInt();
        System.out.print("operand2");
        operand2 = scan.nextInt();
//        {
////        }
//        symbol = scan.next();
//        {
        System.out.print(" арифметическая операция(+ , -, *, /)");
        //}
        String sign = scan.next(); // + - * /
        switch (sign) {
            case "+":
                System.out.println(+(operand1 + operand2));
                break;
            case "-":
                System.out.println(+(operand1 - operand2));
                break;
            case "*":
                System.out.println(+(operand1 * operand2));
                break;
            case "/": if (operand2 == 0) {
                System.out.println("Делить на ноль нельзя");
            }
            else if (operand2>0){
                System.out.println(operand1 / operand2);
            {
           }
            }
            break;
            default: {
                System.out.println("Неверная операция");
                return;
            }
        }
    }
}
