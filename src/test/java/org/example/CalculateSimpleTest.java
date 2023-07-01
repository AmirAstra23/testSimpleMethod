package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculateSimpleTest {

    @Test
    void sum() {
        var testSum = new CalculateSimple();
        Assertions.assertEquals(5, testSum.sum(2, 3));
    }

    @Test
    void division() throws ArithmeticException {
        var testDivision = new CalculateSimple();
        Assertions.assertEquals(2, testDivision.division(6, 3));
        Assertions.assertEquals(0, testDivision.division(6, 0));

    }

    @Test
    void multiplication() {
        var testMultiplication = new CalculateSimple();
        Assertions.assertEquals(15, testMultiplication.multiplication(3, 5));
    }
}