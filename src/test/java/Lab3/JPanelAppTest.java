package Lab3;

import Calculator.CalculatorImpl;
import FileWorker.FileWorker;
import App.JPanelApp;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.awt.*;
import java.awt.event.InputEvent;

public class JPanelAppTest {
    @Mock
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
        robot.mouseMove(115 + 10, 160 + 110);
        robot.delay(1000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1000);
        robot.mouseMove(115 + 170, 160 + 190);
        robot.delay(1000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseMove(115 + 110, 160 + 120);
        robot.delay(1000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1000);
        robot.mouseMove(115 + 110, 160 + 270);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(2000);

        double result = Double.parseDouble(fileWorker.getResult());
        Assertions.assertEquals(actual, result);


    }

}
