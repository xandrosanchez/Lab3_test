package test;

import App.JPanelApp;
import UsingButtons.ButtonService;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;

import java.awt.*;

public class SumTestBDD {

    public String firstNumber;
    public String secondNumber;

    JPanelApp jPanelApp = new JPanelApp();
    ButtonService buttonService = new ButtonService();

    @Given("a $firstNumber and $secondNumber")
    public void start(String first, String second){
        firstNumber = first;
        secondNumber = second;
    }

    @When("user call method $grid")
    public void operation(String grid) throws AWTException {
        jPanelApp.start();
        buttonService.buttonNumbersClick(firstNumber);
        buttonService.buttonCalculationClick(grid);
        buttonService.buttonNumbersClick(secondNumber);
        buttonService.buttonCalculationClick("=");
    }

    @Then("get the $result of two numbers")
    public void trueResult(double result) {
        Assert.assertEquals(result,jPanelApp.getValue(),0.0);

    }
}
