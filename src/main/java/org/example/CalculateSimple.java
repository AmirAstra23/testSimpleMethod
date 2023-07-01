package org.example;

public class CalculateSimple {
    public int sum(int a, int b) {
        return a + b;
    }

    public int division(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException exception) {
            System.out.println("Ошибка! На ноль делить нельзя! " + exception);
        }

        return 0;
    }

    public int multiplication(int a, int b) {
        return a * b;
    }
}
