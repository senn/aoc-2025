package com.github.senn.aoc2025;

import com.github.senn.aoc2025.util.FileUtils;
import java.util.List;

public class Day1 {

    private static final int MIN = 0;
    private static final int MAX = 99;
    private static final int START_POS = 50;

    public static void main(String[] args) throws Exception {
        List<String> rotations = FileUtils.readLinesFromFile("Day1_input.txt");

        int pos = START_POS;
        int onZero = 0;
        for (String rotation : rotations) {
            char direction = rotation.charAt(0);
            int clicks = Integer.parseInt(rotation.substring(1));
            int move = 'R' == direction ? clicks : -clicks;

            pos += move;
            while (pos > MAX) {
                pos = pos - (MAX + 1);
            }
            while (pos < MIN) {
                pos = pos + (MAX + 1);
            }

            if (pos == 0) {
                onZero++;
            }
        }
        System.out.println("On zero: " + onZero);
    }

}
