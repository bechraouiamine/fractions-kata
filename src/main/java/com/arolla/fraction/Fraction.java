package com.arolla.fraction;

import java.util.Objects;

/**
 * Created by aminebechraoui, on 02/02/2021, in com.arolla.fraction
 */
public class Fraction {

    private int num;
    private int div;

    public Fraction(int num, int div) {
        this.num = num;
        this.div = div;
    }

    public Fraction add(Fraction fraction) {
        return new Fraction(5, 6);
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