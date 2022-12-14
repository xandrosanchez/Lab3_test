package App;

import Calculator.MetodCalc;
import Presenter.CalculatorPresenterImpl;
import View.CalculatorViewImpl;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JPanelApp extends JPanel {
    int firstArgument = 0;
    int secondArgument = 0;
    String op = "";

    private static int value;

    public void setValue(int aValue){
        value = aValue;
    }

    public int getValue(){
        return value;
    }

    TextField txt1 = new TextField();

    public JPanelApp() {
        CalculatorViewImpl calculatorView = new CalculatorViewImpl();

        try {
            setLayout(null);
            // Specifies the position of the element
            txt1.setBounds(10, 10, 235, 25);

            JButton button0 = new JButton("0");
            button0.setBounds(10, 270, 50, 50);

            JButton button1 = new JButton("1");
            button1.setBounds(10, 190, 50, 50);

            JButton button2 = new JButton("2");
            button2.setBounds(60, 190, 50, 50);

            JButton button3 = new JButton("3");
            button3.setBounds(110, 190, 50, 50);

            JButton button4 = new JButton("4");
            button4.setBounds(10, 110, 50, 50);

            JButton button5 = new JButton("5");
            button5.setBounds(60, 110, 50, 50);

            JButton button6 = new JButton("6");
            button6.setBounds(110, 110, 50, 50);

            JButton button7 = new JButton("7");
            button7.setBounds(10, 40, 50, 50);

            JButton button8 = new JButton("8");
            button8.setBounds(60, 40, 50, 50);

            JButton button9 = new JButton("9");
            button9.setBounds(110, 40, 50, 50);

            JButton buttonResult = new JButton("=");
            buttonResult.setBounds(110, 270, 50, 50);
            Font bigFont = new Font("serif", Font.BOLD, 22);
            buttonResult.setFont(bigFont);

            JButton buttonPlus = new JButton("+");
            buttonPlus.setBounds(170, 40, 75, 50);
            Font bigFontPlus = new Font("serif", Font.BOLD, 22);
            buttonPlus.setFont(bigFontPlus);

            JButton buttonMinus = new JButton("-");
            buttonMinus.setBounds(170, 110, 75, 50);
            Font bigFontMinus = new Font("serif", Font.BOLD, 22);
            buttonMinus.setFont(bigFontMinus);

            JButton buttonMultiplication = new JButton("*");
            buttonMultiplication.setBounds(170, 190, 75, 50);
            Font bigFontMulti = new Font("serif", Font.BOLD, 22);
            buttonMultiplication.setFont(bigFontMulti);

            JButton buttonDivision = new JButton("/");
            buttonDivision.setBounds(170, 270, 75, 50);
            Font bigFontDivision = new Font("serif", Font.BOLD, 22);
            buttonDivision.setFont(bigFontDivision);

            JButton buttonC = new JButton("c");
            buttonC.setBounds(60, 270, 50, 50);
            Font bigFontC = new Font("serif", Font.BOLD, 22);
            buttonC.setFont(bigFontC);

            add(txt1);
            add(button0);
            add(button1);
            add(button2);
            add(button3);
            add(button4);
            add(button5);
            add(button6);
            add(button7);
            add(button8);
            add(button9);
            add(buttonResult);
            add(buttonPlus);
            add(buttonMinus);
            add(buttonMultiplication);
            add(buttonDivision);
            add(buttonC);

            button1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg1) {
                    txt1.setText(txt1.getText() + 1);
                    if (firstArgument == 0) {
                        firstArgument = (int) Double.parseDouble(txt1.getText());
                    } else {
                        secondArgument = (int) Double.parseDouble(txt1.getText());
                    }
                }
            });

            button2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg1) {
                    txt1.setText(txt1.getText() + 2);
                    if (firstArgument == 0) {
                        firstArgument = (int) Double.parseDouble(txt1.getText());
                    } else {
                        secondArgument = (int) Double.parseDouble(txt1.getText());
                    }
                }
            });

            button3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg1) {
                    txt1.setText(txt1.getText() + 3);
                    if (firstArgument == 0) {
                        firstArgument = (int) Double.parseDouble(txt1.getText());
                    } else {
                        secondArgument = (int) Double.parseDouble(txt1.getText());
                    }
                }
            });

            button4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg1) {
                    txt1.setText(txt1.getText() + 4);
                    if (firstArgument == 0) {
                        firstArgument = (int) Double.parseDouble(txt1.getText());
                    } else {
                        secondArgument = (int) Double.parseDouble(txt1.getText());
                    }
                }
            });

            button5.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg1) {
                    txt1.setText(txt1.getText() + 5);
                    if (firstArgument == 0) {
                        firstArgument = (int) Double.parseDouble(txt1.getText());
                    } else {
                        secondArgument = (int) Double.parseDouble(txt1.getText());
                    }
                }
            });

            button6.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg1) {
                    txt1.setText(txt1.getText() + 6);
                    if (firstArgument == 0) {
                        firstArgument = (int) Double.parseDouble(txt1.getText());
                    } else {
                        secondArgument = (int) Double.parseDouble(txt1.getText());
                    }
                }
            });

            button7.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg1) {
                    txt1.setText(txt1.getText() + 7);
                    if (firstArgument == 0) {
                        firstArgument = (int) Double.parseDouble(txt1.getText());
                    } else {
                        secondArgument = (int) Double.parseDouble(txt1.getText());
                    }
                }
            });

            button8.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg1) {
                    txt1.setText(txt1.getText() + 8);
                    if (firstArgument == 0) {
                        firstArgument = (int) Double.parseDouble(txt1.getText());
                    } else {
                        secondArgument = (int) Double.parseDouble(txt1.getText());
                    }
                }
            });

            button9.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg1) {
                    txt1.setText(txt1.getText() + 9);
                    if (firstArgument == 0) {
                        firstArgument = (int) Double.parseDouble(txt1.getText());
                    } else {
                        secondArgument = (int) Double.parseDouble(txt1.getText());
                    }
                }
            });

            button0.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg1) {
                    txt1.setText(txt1.getText() + 0);
                    if (firstArgument == 0) {
                        firstArgument = (int) Double.parseDouble(txt1.getText());
                    } else {
                        secondArgument = (int) Double.parseDouble(txt1.getText());
                    }
                }
            });

            buttonPlus.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg1) {
                    CalculatorPresenterImpl calculatorPresenter = new CalculatorPresenterImpl();
                    calculatorPresenter.onPlusClicked();
                    firstArgument = (int) Double.parseDouble(txt1.getText());
                    txt1.setText("");
                    op = "+";
                }
            });

            buttonMinus.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg1) {
                    CalculatorPresenterImpl calculatorPresenter = new CalculatorPresenterImpl();
                    calculatorPresenter.onMinusClicked();
                    firstArgument = (int) Double.parseDouble(txt1.getText());
                    txt1.setText("");
                    op = "-";
                }
            });

            buttonMultiplication.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg1) {
                    CalculatorPresenterImpl calculatorPresenter = new CalculatorPresenterImpl();
                    calculatorPresenter.onMultiplyClicked();
                    firstArgument = (int) Double.parseDouble(txt1.getText());
                    txt1.setText("");
                    op = "*";
                }
            });

            buttonDivision.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg1) {
                    CalculatorPresenterImpl calculatorPresenter = new CalculatorPresenterImpl();
                    calculatorPresenter.onDivideClicked();
                    firstArgument = (int) Double.parseDouble(txt1.getText());
                    txt1.setText("");
                    op = "/";
                }
            });

            buttonResult.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg0) {
                    int num = firstArgument;
                    int num1 = secondArgument;
                    String strOp = op;
                    MetodCalc mc = new MetodCalc();
                    txt1.setText(String.valueOf(mc.calc(num, strOp, num1)));
                    setValue(mc.calc(num, strOp, num1));
                }
            });

            buttonC.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent argC) {
                    firstArgument = (int) Double.parseDouble(txt1.getText());
                    txt1.setText("");
                    op = "c";
                }
            });
        } catch (ArithmeticException exception) {
            calculatorView.displayError(exception.toString());
        }
    }

    public void start() {
        new JFrameApp();
    }

}