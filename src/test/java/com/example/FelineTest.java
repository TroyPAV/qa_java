package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class FelineTest {

    //Тест метода eatMeat(), возвращает список мясной еды кошачьих: ["Животные", "Птицы", "Рыба"]
    @Test
    public void eatMeatPredatorReturnListOfMeat() throws Exception {
        Feline feline = new Feline();
        List<String> meat = Arrays.asList("Животные", "Птицы", "Рыба");
        Assert.assertEquals(meat, feline.eatMeat());
    }

    //Тест метода getFamily(), возвращает семейство Кошачьи
    @Test
    public void getFamilyDefaultReturnFeline() {
        Feline feline = new Feline();
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }

    //Тест метода getKittens(), возвращает количество котят:1
    @Test
    public void getKittensDefaultReturnOne() {
        Feline feline = new Feline();
        Assert.assertEquals(1, feline.getKittens());
    }

    //Тест метода getKittens(int kittensCount), возвращает натуральное число котят
    @Test
    public void getKittensIntKittensCountReturnIntKittensCount() {
        Feline feline = new Feline();
        Assert.assertEquals(5, feline.getKittens(5));
    }
}