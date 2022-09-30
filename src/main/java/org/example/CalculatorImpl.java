package org.example;


import Exceptions.IncorrectInputException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CalculatorImpl implements Calculator {

    private double firstArgument;
    private double secondArgument;


    public double getSecondArgument() {
        return secondArgument;
    }

    public void setSecondArgument(double secondArgument) throws IncorrectInputException {
        this.secondArgument = secondArgument;
    }

    public double getFirstArgument() {
        return firstArgument;
    }

    public void setFirstArgument(double firstArgument) {
        this.firstArgument = firstArgument;
    }

    public void startCalculator() {
        try {
            CalculatorViewImpl calculatorView = new CalculatorViewImpl();
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Write first number");
            setFirstArgument(Double.parseDouble(reader.readLine()));
            System.out.println("Write second number");
            setSecondArgument(Double.parseDouble(reader.readLine()));
            System.out.println("Write command: " + "+,-,*,/ ");
            String command = reader.readLine();
            double temp;
            switch (command) {
                case "+":
                    temp = sum(getFirstArgument(), getSecondArgument());
                    System.out.println(temp);
                    break;
                case "-":
                    temp = subtract(getFirstArgument(), getSecondArgument());
                    System.out.println(temp);
                    break;
                case "*":
                    temp = multiply(getFirstArgument(), getSecondArgument());
                    System.out.println(temp);
                    break;
                case "/":
                    try {
                        temp = divide(getFirstArgument(), getSecondArgument());
                        System.out.println(temp);
                    } catch (ArithmeticException e) {
                        calculatorView.displayError(Arrays.toString(e.getStackTrace()));
                    }
                    break;
                default:
                    System.out.println("Wrong number");
                    break;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public double sum(double a, double b) {
        return a + b;
    }

    @Override
    public double subtract(double a, double b) {
        return a - b;
    }

    @Override
    public double multiply(double a, double b) {
        return a * b;
    }

    @Override
    public double divide(double a, double b) throws ArithmeticException {
        if (Math.abs(b) < Math.pow(10, -8)) {
            throw new ArithmeticException();
        }
        return a / b;
    }
}
