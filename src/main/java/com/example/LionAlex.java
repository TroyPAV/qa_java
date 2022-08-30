package com.example;

import java.util.List;

public class LionAlex extends Lion{

    private Predator predator;

    public LionAlex(Predator predator) {
        this.predator = predator;
    }
    public LionAlex() {
        super.hasMane = true;
    }

    @Override
    public int getKittens() {
        return 0;
    }

    public List<String> getFriends() {
        return List.of("Марти", "Глория", "Мелман");
    }

    public String getPlaceOfLiving() {
        return "Нью-Йоркский зоопарк";
    }

    public List<String> getFood() throws Exception {
        return predator.eatMeat();
    }


}
