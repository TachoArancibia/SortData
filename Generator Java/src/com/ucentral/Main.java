package com.ucentral;


import java.io.IOException;

public class Main {

    public static final String FILE = "data.csv";

    public static void main(String[] args) throws IOException {
        JavaGetFileSize obj = new JavaGetFileSize(FILE);
       // GenerateData generator = new GenerateData(FILE);
//        while(obj.getFileSizeMegaBytes() <= 100)
//        {
//            generator.insertData(100);
//        }

        System.out.println(obj.getFileSizeMegaBytes());

    }
}

