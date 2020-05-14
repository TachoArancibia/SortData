package com.quicksort;

import com.sun.istack.internal.NotNull;

import java.io.FileWriter;
import java.io.IOException;

public class writeCSV {

    private FileWriter writer;
    private int [] records;

    public writeCSV(@NotNull String FILE_NAME, int[] records) throws IOException {
        this.writer = new FileWriter(FILE_NAME);
        this.records = records;
    }

    public boolean insertData() throws IOException
    {
        for (int i = 0; i < this.records.length; i++) {
            insertNumber(records[i]);
            this.writer.write(",");
        }
        return true;
    }
    public boolean insertNumber(int s) {
        try {
            this.writer.write(String.valueOf(s));
            this.writer.flush();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        };
        return true;
    }
}
