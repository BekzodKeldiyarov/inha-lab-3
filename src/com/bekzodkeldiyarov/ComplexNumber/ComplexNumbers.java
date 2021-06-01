package com.bekzodkeldiyarov.ComplexNumber;

public class ComplexNumbers {
    private float realPart = 0;
    private float imaginaryPart = 0;
    private final float i = Math.abs(-1);

    public ComplexNumbers(float realPart, float imaginaryPart) {
        setRealPart(realPart);
        setImaginaryPart(imaginaryPart);
    }

    public ComplexNumbers() {
        setImaginaryPart(1);
        setRealPart(1);
    }

    public void printComplexNumber() {
        System.out.println("Real Part is " + realPart + "\nImaginary part is " + imaginaryPart);
    }


    public float getRealPart() {
        return realPart;
    }

    public float getImaginaryPart() {
        return imaginaryPart;
    }

    public float getI() {
        return i;
    }

    public void setRealPart(float realPart) {
        if (realPart > 0) {
            this.realPart = realPart;
        } else {
            throw new IllegalArgumentException("Value should be positive");
        }
    }

    public void setImaginaryPart(float imaginaryPart) {
        if (imaginaryPart > 0) {
            this.imaginaryPart = imaginaryPart;
        } else {
            throw new IllegalArgumentException("Value should be positive");
        }
    }

    public static ComplexNumbers addComplexNumber(ComplexNumbers firstComplexNumber, ComplexNumbers secondComplexNumber) {

        return new ComplexNumbers((firstComplexNumber.getRealPart() + secondComplexNumber.getRealPart()), (firstComplexNumber.getImaginaryPart()) + secondComplexNumber.getImaginaryPart());
    }

    public static ComplexNumbers subtractComplexNumber(ComplexNumbers firstComplexNumber, ComplexNumbers secondComplexNumber) {

        return new ComplexNumbers((firstComplexNumber.getRealPart() - secondComplexNumber.getRealPart()), (firstComplexNumber.getImaginaryPart()) - secondComplexNumber.getImaginaryPart());
    }

}
