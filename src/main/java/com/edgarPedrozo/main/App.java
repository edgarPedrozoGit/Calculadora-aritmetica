package com.edgarPedrozo.main;

import com.edgarPedrozo.main.Calculator.Calculator;

import java.util.Scanner;

public class App {
    public static  void  main (String[] args){
        Scanner input = new Scanner(System.in);
        float number1;
        float number2;
        int option;
        Calculator cal = new Calculator();
        System.out.print("Enter the first number: ");
        number1 = input.nextFloat();
        System.out.print("Enter the second number: ");
        number2 = input.nextFloat();
        cal.options();
        System.out.print("Choose an option: ");
        option = input.nextInt();

        switch (option){
            case 1:
                System.out.println(number1 +" + "+ number2 + " = "+ cal.addition(number1,number2));
                break;
            case 2:
                System.out.println(number1 +" - "+ number2 + " = "+ cal.subtraction(number1,number2));
                break;
            case 3:
                System.out.println(number1 +" x "+ number2 + " = "+ cal.multiplication(number1,number2));
                break;
            case 4:
                if(number2 == 0){
                    System.out.println("The number 2 cannot be zero in this operation.");
                }else{
                    System.out.println(number1 +" / "+ number2 + " = "+ cal.division(number1,number2));
                }
                break;
            default:
                System.out.print("That option is not available");
                break;
        }

    }
}
