package org.example;

import java.awt.*;

public interface CalculatorView {

    void printResult(TextField textField, String result);

    void displayError(String message);

    String getFirstArgumentAsString(double firstArgument);

    String getSecondArgumentAsString(double secondArgument);
}
