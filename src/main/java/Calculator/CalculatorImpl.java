package Calculator;


import Exceptions.IncorrectInputException;

public class CalculatorImpl implements Calculator {

    private int firstArgument;
    private int secondArgument;


    public double getSecondArgument() {
        return secondArgument;
    }

    public void setSecondArgument(int secondArgument) throws IncorrectInputException {
        this.secondArgument = secondArgument;
    }

    public double getFirstArgument() {
        return firstArgument;
    }

    public void setFirstArgument(int firstArgument) {
        this.firstArgument = firstArgument;
    }

    /*public void startCalculator() {
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
    }*/

    @Override
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }

    @Override
    public int divide(int a, int b) throws ArithmeticException {
        if (Math.abs(b) < Math.pow(10, -8)) {
            throw new ArithmeticException();
        }
        return a / b;
    }
}
