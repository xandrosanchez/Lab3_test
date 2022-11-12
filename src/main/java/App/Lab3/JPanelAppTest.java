package App.Lab3;

import App.JPanelApp;
import Calculator.CalculatorImpl;
import FileWorker.FileWorker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.awt.event.InputEvent;

public class JPanelAppTest {
    JPanelApp jPanelApp = new JPanelApp();

    @Test
    public void test() throws AWTException {
        FileWorker fileWorker = new FileWorker();
        Robot robot = new Robot();
        jPanelApp.start();
        CalculatorImpl calculator = new CalculatorImpl();
        double actual = calculator.multiply(4, 6);

        robot.mouseMove(115, 160);
        robot.delay(1000);
        robot.mouseMove(335, 420);
        robot.delay(1000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(3000);


        double result = Double.parseDouble(fileWorker.getResult());
        Assertions.assertEquals(actual, result);


    }

}
