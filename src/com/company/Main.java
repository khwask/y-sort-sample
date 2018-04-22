package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);

        // Display number
        String line = in.readLine();
        int num = Integer.parseInt(line);

        ArrayList<String> array = new ArrayList<>();

        while ((line = in.readLine()) != null) {
            array.add(line);
        }
        Collections.sort(array, new StringLengthComparator());
        for (int i = 0; i < num; i++) {
            System.out.println(array.get(i));
        }
    }
}
class StringLengthComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        if (o1.length() < o2.length()) {
            return 1;
        } else if (o1.length() > o2.length()) {
            return -1;
        } else {
            return 0;
        }
    }
}