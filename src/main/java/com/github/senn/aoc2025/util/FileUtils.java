package com.github.senn.aoc2025.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {

    public static List<String> readLinesFromFile(String fileName) throws IOException {
        File file = new File(FileUtils.class.getClassLoader().getResource(fileName).getFile());
        InputStream inputStream = new FileInputStream(file);
        List<String> lines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        }
        return lines;
    }
}
