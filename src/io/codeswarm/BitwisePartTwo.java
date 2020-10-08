package io.codeswarm;

public class BitwisePartTwo {

    public static void storeMultipleFlagsInOneVariable(int variable) {
        variable = variable | 1;
        variable = variable | 2;
        variable = variable | 4;
        //variable = variable | 8;

        if ((variable & 1) == 1) {
            System.out.println("Variable 1 true");
        } else {
            System.out.println("Variable 1 false");
        }

        if ((variable & 2) == 2) {
            System.out.println("Variable 2 true");
        } else {
            System.out.println("Variable 2 false");
        }

        if ((variable & 4) == 4) {
            System.out.println("Variable 4 true");
        } else {
            System.out.println("Variable 4 false");
        }

        // Unset all the flags
        variable = variable & (~(1 << 0));
        variable = variable & (~(1 << 1));
        variable = variable & (~(1 << 2));
    }

    public static String encryptString(String text) {
        StringBuilder sb = new StringBuilder();
        char[] temp = text.toCharArray();
        for (int i = 0; i < temp.length; i++) {
            temp[i] = (char) (temp[i] ^ '0');
            sb.append(temp[i]);
        }
        return sb.toString();
    }

    public static int getTheMaxOfTwoInts(int x, int y) {
        return y & ((x - y) >> 31) | x & (~(x - y) >> 31);
    }

    public static int getTheMinOfTwoInts(int x, int y) {
        return x & ((x - y) >> 31) | y & (~(x - y) >> 31);
    }

    public static long getTheMaxOfTwoLongs(long x, long y) {
        return y & ((x - y) >> 63) | x & (~(x - y) >> 63);
    }

    public static long getTheMinOfTwoLongs(long x, long y) {
        return x & ((x - y) >> 63) | y & (~(x - y) >> 63);
    }
}
