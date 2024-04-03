package org.example.LongestCommonPrefix;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {

    }

    public static String longestCommonPrefix(String[] strings) {
        return strings == null || strings.length == 0 ? "" : Arrays.stream(strings)
                .reduce((s1, s2) -> {
                    int length = Math.min(s1.length(), s2.length());
                    int index = 0;
                    while (index < length && s1.charAt(index) == s2.charAt(index)) {
                        index++;
                    }
                    return s1.substring(0, index);
                })
                .orElse("");
    }

}
