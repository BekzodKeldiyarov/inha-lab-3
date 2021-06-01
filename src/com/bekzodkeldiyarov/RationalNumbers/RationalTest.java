package com.bekzodkeldiyarov.RationalNumbers;

public class RationalTest {
    public void start() {
        Rational first = new Rational(2, 3);
        Rational second = new Rational(4, 6);
        first.showRationalNumber();
        second.showRationalNumber();

        Rational added = Rational.subtractRational(first, second);
        added.showRationalNumber();
    }
}

