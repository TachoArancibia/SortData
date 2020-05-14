package com.ucentral;

import com.sun.istack.internal.NotNull;

import java.io.FileWriter;
import java.io.IOException;

public class GenerateData {

    private FileWriter writer;
    private randomNumber generator;

    public GenerateData(@NotNull String FILE_NAME) throws IOException {
        this.writer = new FileWriter(FILE_NAME);
        this.generator = new randomNumber();
    }

    public boolean insertData(int limit) throws IOException
    {
        int i = 0;
        while (i<=limit) {
            insertNumber();
            this.writer.write(",");
            i++;
        }
        return true;
    }
    public boolean insertNumber() {
        try {
            this.writer.write(this.generator.generateNumber());
            this.writer.flush();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        };
        return true;
    }
}
