package com.example;

import java.util.List;

public class Lion {

    boolean hasMane;
    private Feline lion;

    public Lion(String sex) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }

    public Lion(Feline feline) {
        this.lion = feline;
    }

    public int getKittens() {
        return lion.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return lion.eatMeat();
    }
}
