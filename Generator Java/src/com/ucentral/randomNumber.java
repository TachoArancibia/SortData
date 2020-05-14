package com.ucentral;

import java.util.Random;

public class randomNumber {

    private Random r;
    private final int low = 0;
    private final int high = 100000;

    public randomNumber() {
        this.r = new Random();
    }

    public String generateNumber(){
        return String.valueOf(this.r.nextInt(high-low + low));
    }

}
