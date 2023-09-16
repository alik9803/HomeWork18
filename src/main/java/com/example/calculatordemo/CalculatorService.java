package com.example.calculatordemo;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public String welcome() {
        return "Добро пожаловать в калькулятор";
    }

    public String add(int num1, int num2) {
        int result = num1 + num2;
        return num1 + "+" + num2 + "=" + result;
    }

    public String subtract(int num1, int num2) {
        int result = num1 - num2;
        return num1 + " - " + num2 + " = " + result;
    }

    public String multiply(int num1, int num2) {
        int result = num1 * num2;
        return num1 + " * " + num2 + " = " + result;
    }

    public String divide(int num1, int num2) {
        if (num2 == 0) {
            return "Ошибка: делеть на ноль нельзя";
        }
        int result = num1 / num2;
        return num1 + " / " + num2 + " = " + result;
    }
}