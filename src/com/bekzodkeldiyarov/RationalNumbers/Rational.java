package com.bekzodkeldiyarov.RationalNumbers;

public class Rational {
    private int numerator;
    private int denominator;

    public Rational() {
        setNumerator(1);
        setDenominator(1);
    }

    public Rational(int numerator, int denominator) {
        for (int i = numerator; i > 1; i--) {
            if (numerator % i == 0 && denominator % i == 0) {
                numerator /= i;
                denominator /= i;
            }
        }
        setNumerator(numerator);
        setDenominator(denominator);
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("The dominator cant be 0");
        }
        this.denominator = denominator;
    }

    public void showRationalNumber() {
        System.out.println(getNumerator() + "\\" + getDenominator());
    }

    public static Rational addRational(Rational first, Rational second) {
        return new Rational((first.getNumerator() * second.getDenominator() + first.getDenominator() * second.getNumerator()), first.getDenominator() * second.getDenominator());
    }

    public static Rational subtractRational(Rational first, Rational second) {
        return new Rational((first.getNumerator() * second.getDenominator() - first.getDenominator() * second.getNumerator()), first.getDenominator() * second.getDenominator());
    }


}
