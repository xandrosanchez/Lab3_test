package Calculator;

import View.CalculatorViewImpl;

public class MetodCalc {
    public double calc(double n1, String op, double n2) {
        CalculatorImpl calculator = new CalculatorImpl();
        CalculatorViewImpl calculatorView = new CalculatorViewImpl();
        double res = 0;
        try {
            switch (op) {
                case "+":
                    res = calculator.sum(n1, n2);
                    System.out.println(res);
                    break;
                case "-":
                    res = calculator.subtract(n1, n1);
                    System.out.println(res);
                    break;
                case "*":
                    res = calculator.multiply(n1, n2);
                    System.out.println(res);
                    break;
                case "/":
                    res = calculator.divide(n1, n2);
                    System.out.println(res);
                    break;
                case "c":
                    break;
                default:
                    res = 0;
                    break;
            }
        } catch (ArithmeticException e) {
            calculatorView.displayError(e.toString());
        }
        return res;
    }
}