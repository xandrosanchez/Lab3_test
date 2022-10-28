package test;

import Calculator.CalculatorImpl;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;

public class SumTestBDD {
    private double firstNumber;
    private double secondNumber;

    private final CalculatorImpl calculator = new CalculatorImpl();

    private int actual;

    @Given("a $firstNumber and $secondNumber")
    public void getFirstNumber(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    @When("user call method $grid")
    public void Sum(String grid) {
        switch (grid) {
            case "+" -> this.actual = (int) calculator.sum(firstNumber, secondNumber);
            case "-" -> this.actual = (int) calculator.divide(firstNumber, secondNumber);
            case "*" -> this.actual = (int) calculator.multiply(firstNumber, secondNumber);
            case "/" -> this.actual = (int) calculator.subtract(firstNumber, secondNumber);
        }
    }

    @Then("get the $result of two numbers")
    public void trueResult(double result) {
        Assert.assertEquals(this.actual, result, 0.0);

    }
}
