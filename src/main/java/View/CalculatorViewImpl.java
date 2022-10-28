package View;

import javax.swing.*;
import java.awt.*;

public class CalculatorViewImpl extends JFrame implements CalculatorView {

    @Override
    public String printResult(TextField textField, String result) {
        textField.setText(result);
        return result;
    }

    @Override
    public void displayError(String message) {
        JFrame errorFrame = new JFrame();
        errorFrame.setSize(240,80);
        errorFrame.setVisible(true);
        errorFrame.setTitle("Error");
        final TextField error = new TextField();
        error.setText(message);
        errorFrame.add(error);
        System.out.println(message);
    }

    @Override
    public String getFirstArgumentAsString(double firstArgument) {
        return String.valueOf(firstArgument);
    }

    @Override
    public String getSecondArgumentAsString(double secondArgument) {
        return String.valueOf(secondArgument);
    }
}
