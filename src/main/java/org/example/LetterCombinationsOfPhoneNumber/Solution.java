package org.example.LetterCombinationsOfPhoneNumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        letterCombinations("23").forEach(System.out::println);
    }

    public static List<String> letterCombinations(String digits) {
        List<String> lettersFromDigits = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return Collections.emptyList();
        }
        Map<Character, String> buttonMap = Map.of('2', "abc",
                '3', "def",
                '4', "ghi",
                '5', "jkl",
                '6', "mno",
                '7', "pqrs",
                '8', "tuv",
                '9', "wxyz");

        lettersFromDigits.add("");

        for (char digit : digits.toCharArray()) {
            List<String> newCombinations = new ArrayList<>();
            String letters = buttonMap.get(digit);

            for (String combination : lettersFromDigits) {
                for (char letter : letters.toCharArray()) {
                    newCombinations.add(combination + letter);
                }
            }

            lettersFromDigits = newCombinations;
        }

        return lettersFromDigits;
    }
}
