package org.example.atoi;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        System.out.println(myAtoi("-91283472332"));
    }

    public static int myAtoi(String string) {
        if (string.isBlank() || string.isEmpty())
            return 0;

        Matcher matcher = Pattern.compile("^\\s*[-+]?[0-9]+").matcher(string);
        if (matcher.find()) {
            String trim = matcher.group().trim();
            try {
                return Integer.parseInt(trim);
            } catch (NumberFormatException e) {
                return trim.charAt(0) == '-' ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
        }
        return 0;
    }
}
