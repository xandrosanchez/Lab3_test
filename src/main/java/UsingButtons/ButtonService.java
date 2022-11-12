package UsingButtons;

import java.awt.*;
import java.awt.event.InputEvent;
import java.util.HashMap;
import java.util.Map;

public class ButtonService {
    public ButtonService(){}
    public Button getButtonCalculation(String button) {
        Map<String, Button> buttonCalculations = new HashMap<>(Map.of(
                "+", new Button(335, 210),
                "-", new Button(335, 280),
                "*", new Button(335, 330),
                "/", new Button(335, 420),
                "=", new Button(235, 420),
                "C", new Button(185, 420)
        ));
        return buttonCalculations.get(button);
    }

    public Button getButtonsNumbers(String button) {
        Map<String, Button> buttonsNumbers = new HashMap<>();
        buttonsNumbers.put("1", new Button(125, 330));
        buttonsNumbers.put("2", new Button(185, 330));
        buttonsNumbers.put("3", new Button(235, 330));
        buttonsNumbers.put("4", new Button(125, 280));
        buttonsNumbers.put("5", new Button(185, 280));
        buttonsNumbers.put("6", new Button(235, 280));
        buttonsNumbers.put("7", new Button(125, 210));
        buttonsNumbers.put("8", new Button(185, 210));
        buttonsNumbers.put("9", new Button(235, 210));
        buttonsNumbers.put("0", new Button(125, 420));
        return buttonsNumbers.get(button);
    }

    public void buttonCalculationClick(String button) throws AWTException {
        ButtonService buttonMap = new ButtonService();

        Robot robot = new Robot();
        robot.mouseMove(buttonMap.getButtonCalculation(button).getxCoordinate(), buttonMap.getButtonCalculation(button).getyCoordinate());
        robot.delay(1000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1000);
    }

    public void buttonNumbersClick(String button) throws AWTException {
        ButtonService buttonMap = new ButtonService();


        Robot robot = new Robot();
        robot.mouseMove(buttonMap.getButtonsNumbers(button).getxCoordinate(), buttonMap.getButtonsNumbers(button).getyCoordinate());
        robot.delay(1000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1000);
    }


}
