package com.bubblesort;

import java.io.IOException;

public class Main {

    //public final static String FILE = "Users/jarancibia/Desktop/Lab1 ESC/Generator Java/data.csv";
    public final static String RFILE = "data.csv";
    public final static String WFILE = "odata.csv";
    public final static int low = 0;
    public int [] records;

    public static void main(String[] args) throws IOException {
        readCSV reader = new readCSV(RFILE);
        int [] records = reader.readFile();
        bubbleSort sort = new bubbleSort();
        int high = records.length - 1;
        sort.sort(records);
        writeCSV writer = new writeCSV(WFILE,records);
        writer.insertData();
    }
}
