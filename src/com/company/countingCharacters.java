package com.company;

import java.awt.*;
import java.awt.List;
import java.lang.reflect.Array;
import java.util.*;

public class countingCharacters {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is the string you would like to count? ");
        String test = keyboard.nextLine().toLowerCase();
        char[] charactersInString = test.toCharArray();

        HashMap<Character, Integer> countedChars = new HashMap<>();


        for (char character : charactersInString) {
            int i = 0;
            if (Character.isLetter(character)) {
                if (countedChars.containsKey(character)) {
                    int value = countedChars.get(character);
                    countedChars.replace(character, value + 1);
                } else {
                    countedChars.put(character, i = 1);
                }
            }
        }

        for (Map.Entry<Character, Integer> letter : countedChars.entrySet()) {
            System.out.println(letter.getKey() + ": " + letter.getValue());

        }
    }

}
