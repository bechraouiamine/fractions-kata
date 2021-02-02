package com.arolla.fraction;

import com.arolla.fraction.Fraction;
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
    void should_reduce_3_div_6_to_1_div_2() {
        // Given
        Fraction fraction;

        // When
        fraction = new Fraction(3, 6);

        // Then
        assertEquals(new Fraction(1, 2), fraction);
    }
    
}
