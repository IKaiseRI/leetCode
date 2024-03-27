package org.example.ReverseInteger;

public class Solution {
    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }

    public static int reverse(int x) {
        boolean isNegative = false;
        if (x == 0) {
            return x;
        } else if (x < 0) {
            isNegative = true;
            x *= -1;
        }
        int result = 0;
        while (x != 0) {
            int digit = x % 10;
            x /= 10;
            if (result > Integer.MAX_VALUE / 10 || result < Integer.MIN_VALUE / 10) {
                return 0;
            }
            result = result * 10 + digit;
        }
        return isNegative ? result * -1 : result;
    }
}
