package org.example;

public class CalculateSimple {
    public int sum(int a, int b) {
        return a + b;
    }

    public int division(int a, int b) {
        if (b == 0) {

            System.out.println("Вы пытаетесь делить на ноль!\n"
                    + "Измените значение делителя");
            return Integer.MIN_VALUE;
        }
        return a / b;
    }

    public int multiplication(int a, int b) {
        return a * b;
    }
}
