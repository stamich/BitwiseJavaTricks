package io.codeswarm;

public class BitwisePartOne {

    //
    // AND OPERATOR &
    //

    // Bitwise AND (&) operator checks if is number even
    public static boolean checkIfEven(int number) {
        return (number & 1) == 0;
    }

    // Bitwise AND (&) operator checks if is number odd
    public static boolean checkIfOdd(int number) {
        return (number & 1) == 1;
    }

    //
    // COMPLEMENT OPERATOR ~
    //

    public static int getTheOppositeNumber(int number) {
        return ~number + 1;
    }

    public static int addOne(int number) {
        return -~number;
    }

    public static int subtractOne(int number) {
        return ~-number;
    }

    //
    // LEFT SHIFT OPERATOR <<
    //

    // Left shift operator is equivalent to multiplication by 2 (<< 1)
    public static int multiplyByTwo(int number) {
        return number << 1;
    }

    // Left shift operator is equivalent to multiplication by 4 (<< 2)
    public static int multiplyByFour(int number) {
        return number << 2;
    }

    // Left shift operator is equivalent to multiplication by factor (<< factor * 2)
    public static int multiplyByFactor(int number, int factor) {
        return number << factor;
    }

    //
    // RIGHT SHIFT OPERATOR >>
    //

    // Right shift operator (>>) here is equivalent to division by 2 (>> 1)
    public static int divideByTwo(int number) {
        return number >> 1;
    }

    // Right shift operator (>>) here is equivalent to division by 4 (>> 2)
    public static int divideByFour(int number) {
        return number >> 2;
    }

    // Right shift operator (>>) here is equivalent to division by factor (>> factor / 2)
    public static int divideByFactor(int number, int factor) {
        return number >> factor;
    }
}
