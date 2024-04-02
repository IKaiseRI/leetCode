package org.example.RegularExpressionMatching;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isMatch("aa", "a***abc"));
    }

    public static boolean isMatch(String string, String pattern) {
        pattern = pattern.replaceAll("\\*+", "*");
        System.out.println(pattern);
        Matcher matcher = Pattern.compile("^" + pattern + "$").matcher(string);
        if (matcher.find())
            return true;
        else return false;
    }
}
