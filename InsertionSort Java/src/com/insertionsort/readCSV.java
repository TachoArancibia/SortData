package com.insertionsort;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class readCSV {

    private int [] records;
    private String FILE;

    public readCSV(String FILE) {
        this.FILE = FILE;
    }

    public int [] readFile() throws IOException{
        try (BufferedReader br = new BufferedReader(new FileReader(this.FILE))) {
            String line;
            line = br.readLine();
            String[] values = line.split(",");
            return StringArrToIntArr(values);
        }
    }

    public int[] StringArrToIntArr(String[] s) {
        int[] result = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            result[i] = Integer.parseInt(s[i]);
        }
        return result;
    }
}
