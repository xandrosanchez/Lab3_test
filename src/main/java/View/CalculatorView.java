package View;

import java.awt.*;

public interface CalculatorView {

    String printResult(TextField textField, String result);

    void displayError(String message);

    String getFirstArgumentAsString(double firstArgument);

    String getSecondArgumentAsString(double secondArgument);
}
