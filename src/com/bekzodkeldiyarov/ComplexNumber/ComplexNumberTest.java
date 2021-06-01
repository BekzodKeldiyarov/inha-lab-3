package com.bekzodkeldiyarov.ComplexNumber;

public class ComplexNumberTest {
    public void start() {
        ComplexNumbers first = new ComplexNumbers(10, 12);
        ComplexNumbers second = new ComplexNumbers(5, 9);

        ComplexNumbers addedComplexNumber = ComplexNumbers.addComplexNumber(first, second);
//        ComplexNumbers

        addedComplexNumber.printComplexNumber();

        System.out.println(addedComplexNumber.getImaginaryPart());
    }
}
