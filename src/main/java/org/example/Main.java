package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    private static String operator = "";
    private static double num1 = 0;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        ImageIcon icon = new ImageIcon("Pictures/calculator.png");
        frame.setIconImage(icon.getImage());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);


        JPanel panel = new JPanel();
        frame.add(panel);
        panel.setLayout(null);

        //operators//
        JButton equals = new JButton("=");
        equals.setBounds(400, 160, 100, 30);
        panel.add(equals);

        JButton add = new JButton("+");
        add.setBounds(100, 70, 100, 30); // x, y, width, height
        panel.add(add);

        // operations //
        JButton minus = new JButton("-");
        minus.setBounds(100, 100, 100, 30);
        panel.add(minus);

        JButton divide = new JButton("/");
        divide.setBounds(100, 130, 100, 30);
        panel.add(divide);

        JButton multiply = new JButton("*");
        multiply.setBounds(100, 160, 100, 30);
        panel.add(multiply);

        JButton dot = new JButton(".");
        dot.setBounds(100, 40, 100, 30);
        panel.add(dot);

        // numbers //
        JButton one = new JButton("1");
        one.setBounds(200, 70, 100, 30);
        panel.add(one);

        JButton two = new JButton("2");
        two.setBounds(300, 70, 100, 30);
        panel.add(two);

        JButton three = new JButton("3");
        three.setBounds(400, 70, 100, 30);
        panel.add(three);

        JButton four = new JButton("4");
        four.setBounds(200, 100, 100, 30);
        panel.add(four);

        JButton five = new JButton("5");
        five.setBounds(300, 100, 100, 30);
        panel.add(five);

        JButton six = new JButton("6");
        six.setBounds(400, 100, 100, 30);
        panel.add(six);

        JButton seven = new JButton("7");
        seven.setBounds(200, 130, 100, 30);
        panel.add(seven);

        JButton eight = new JButton("8");
        eight.setBounds(300, 130, 100, 30);
        panel.add(eight);

        JButton nine = new JButton("9");
        nine.setBounds(400, 130, 100, 30);
        panel.add(nine);

        JButton zero = new JButton("0");
        zero.setBounds(300, 160, 100, 30);
        panel.add(zero);

        // clear button//
        JButton clear = new JButton("clear");
        clear.setBounds(200, 160, 100, 30);
        panel.add(clear);



        // textField //
        JTextField input = new JTextField(10);
        input.setBounds(100, 190, 400, 40);
        panel.add(input);

        // result //
        class result {
            float result = 0;
        }

        one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (input.getText().equals("0")) {
                    input.setText("");
                }
                input.setText(input.getText() + "1");
            }
        });

        two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (input.getText().equals("0")) {
                    input.setText("");
                }
                input.setText(input.getText() + "2");
            }
        });

        three.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (input.getText().equals("0")) {
                    input.setText("");
                }
                input.setText(input.getText() + "3");
            }
        });

        four.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (input.getText().equals("0")) {
                    input.setText("");
                }
                input.setText(input.getText() + "4");
            }
        });

        five.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (input.getText().equals("0")) {
                    input.setText("");
                }
                input.setText(input.getText() + "5");
            }
        });

        six.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (input.getText().equals("0")) {
                    input.setText("");
                }
                input.setText(input.getText() + "6");
            }
        });

        seven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (input.getText().equals("0")) {
                    input.setText("");
                }
                input.setText(input.getText() + "7");
            }
        });

        eight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (input.getText().equals("0")) {
                    input.setText("");
                }
                input.setText(input.getText() + "8");
            }
        });

        nine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (input.getText().equals("0")) {
                    input.setText("");
                }
                input.setText(input.getText() + "9");
            }
        });

        zero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (input.getText().equals("0")) {
                    input.setText("");
                }
                input.setText(input.getText() + "0");
            }
        });

        equals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num2 = Double.parseDouble(input.getText());
                double result = 0;
                if (operator.equals("+")) {
                    result = num1 + num2;
                } else if (operator.equals("-")) {
                    result = num1 - num2;
                } else if (operator.equals("*")) {
                    result = num1 * num2;
                } else if (operator.equals("/")) {
                    result = num1 / num2;
                }
                input.setText(String.valueOf(result));
            }
        });

        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(input.getText());
                operator = "-";
                input.setText("");
            }
        });

        multiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(input.getText());
                operator = "*";
                input.setText("");
            }
        });

        divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(input.getText());
                operator = "/";
                input.setText("");
            }
        });

        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText("");
                num1 = 0;
            }
        });

        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(input.getText());
                operator = "+";
                input.setText("");
            }
        });
        dot.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = input.getText();
                if (!text.contains(".")) {
                    input.setText(text + ".");
                }
            }
        });

        frame.setVisible(true);
    }
}