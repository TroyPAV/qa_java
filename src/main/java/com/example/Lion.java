package com.example;

import java.util.List;

public class Lion {

    boolean hasMane;
    private Kittens kittens;
    private Predator predator;

    public Lion(String sex) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }

    public Lion(Kittens kittens) {
        this.kittens = kittens;
    }

    public Lion(Predator predator) {
        this.predator = predator;
    }

    public Lion() {
    }

    public int getKittens() {
        return kittens.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return predator.eatMeat();
    }
}
