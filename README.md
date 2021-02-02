# Kata Fractions for Arolla nursery

## Goal
##### Write a program that implements the addition of fractions.

1. A fraction is a value object, once created it can't be mutated.

2. The add method must return a new Fraction object.

3. Fractions must be reduced.
 
##### Greater commun divisor implementation  

```
static int gcd (int a, int b) {
    return b == 0 ? a : gcd (b, a % b) ;
}
```