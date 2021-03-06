package com.arolla.fraction;

import java.util.Objects;

/**
 * Created by aminebechraoui, on 02/02/2021, in com.arolla.fraction
 */
public class Fraction {

    private int num;
    private int div;

    public Fraction(int num, int div) {
        int gcd = gcd(num, div);
        this.num = num / gcd;
        this.div = div / gcd;
    }

    public Fraction add(Fraction fraction) {
        int numerator = num * fraction.div + fraction.num * div;
        int divisor = div * fraction.div;
        return new Fraction(numerator, divisor);
    }

    public int gcd(int num, int div) {
        return div == 0 ? num : gcd (div, num % div) ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fraction fraction = (Fraction) o;
        return num == fraction.num &&
                div == fraction.div;
    }

    @Override
    public int hashCode() {
        return Objects.hash(num, div);
    }
}
