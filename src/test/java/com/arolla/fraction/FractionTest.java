package com.arolla.fraction;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 * Created by aminebechraoui, on 02/02/2021, in PACKAGE_NAME
 */
public class FractionTest {

    @Test
    void should_sum_fraction_1_div_2_and_1_div_3() {
        // Given
        Fraction fraction = new Fraction(1, 2);

        // When
        Fraction fractionResult = fraction.add(new Fraction(1, 3));

        // Then
        assertEquals(new Fraction(5, 6), fractionResult);
    }

    @Test
    void should_sum_fraction_3_div_6_and_1_div_3() {
        // Given
        Fraction fraction = new Fraction(3, 6);

        // When
        Fraction fractionResult = fraction.add(new Fraction(1, 3));

        // Then
        assertEquals(new Fraction(5, 6), fractionResult);
    }

    @Test
    void should_sum_fraction_4_div_5_and_1_div_4() {
        // Given
        Fraction fraction = new Fraction(3, 5);

        // When
        Fraction fractionResult = fraction.add(new Fraction(1, 4));

        // Then
        assertEquals(new Fraction(17, 20), fractionResult);
    }

    @Test
    void should_reduce_3_div_6_to_1_div_2() {
        // Given
        Fraction fraction;

        // When
        fraction = new Fraction(3, 6);

        // Then
        assertEquals(new Fraction(1, 2), fraction);
    }

    @Test
    void should_reduce_4_div_12_to_1_div_3() {
        // Given
        Fraction fraction;

        // When
        fraction = new Fraction(4, 12);

        // Then
        assertEquals(new Fraction(1, 3), fraction);
    }

    @Test
    void should_reduce_5_div_20_to_1_div_4() {
        // Given
        Fraction fraction;

        // When
        fraction = new Fraction(5, 20);

        // Then
        assertEquals(new Fraction(1, 4), fraction);
    }

}
