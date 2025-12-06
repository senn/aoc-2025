package com.github.senn.aoc2025;

import com.github.senn.aoc2025.util.FileUtils;
import java.util.List;

public class Day1 {

    private static final int START_POS = 50;

    public static void main(String[] args) throws Exception {
        List<String> rotations = FileUtils.readLinesFromFile("Day1_input.txt");

        int pos = START_POS;
        int onZero = 0;
        for (String rotation : rotations) {
            // Parsing
            char direction = rotation.charAt(0);
            int clicks = Integer.parseInt(rotation.substring(1));
            int factor = 'R' == direction ? 1 : -1;

            // Use individual clicks out of desperation
            while (clicks > 0) {
                pos = (pos + factor) % 100;
                if (pos == 0) {
                    onZero++;
                }
                clicks--;
            }
        }
        System.out.println("On zero: " + onZero);
    }

}
