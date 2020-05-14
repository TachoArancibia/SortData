package com.ucentral;

import java.io.File;

public class JavaGetFileSize {

    private String FILE_NAME;
    private File file;

    public JavaGetFileSize(String FILE_NAME) {
        this.file = new File(FILE_NAME);
    }

    public int getFileSizeMegaBytes() {
        return (int) this.file.length() / (1024 * 1024);
    }
}