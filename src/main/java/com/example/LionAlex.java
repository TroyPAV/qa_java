package com.example;

import java.util.List;

public class LionAlex extends Lion{

    public LionAlex(String sex, Feline lion) throws Exception {
        super("Самец", lion);
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
        return super.getFood();
    }
}
