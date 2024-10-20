package com.edgarPedrozo.main.Calculator;

public class Calculator {

    public void options(){
        System.out.println("*** CALCULATOR ***");
        System.out.println("Enter the option");
        System.out.println("(1) Addition");
        System.out.println("(2) Subtraction");
        System.out.println("(3) Multiplication");
        System.out.println("(4) Division");
    }

    public float addition(float num1, float num2){
        return num1 + num2;
    }

    public float subtraction(float num1, float num2){
        return num1 - num2;
    }

    public float multiplication(float num1, float num2){
        return num1 * num2;
    }

    public float division(float num1, float num2){
        return num1 / num2;
    }
}
