package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline felineMock;

    //Тест метода getSound(), возвращает строку "Мяу"
    @Test
    public void getSoundDefaultReturnStringMeow() {
        Cat cat = new Cat(felineMock);
        Assert.assertEquals("Мяу", cat.getSound());
    }

    //Тест метода eatMeat(), возвращает список мясной еды кошек: ["Животные", "Птицы", "Рыба"]
    @Test
    public void getFoodDefaultReturnListOfMeat() throws Exception {
        Cat cat = new Cat(felineMock);
        List<String> meat = Arrays.asList("Животные", "Птицы", "Рыба");
        Mockito.when(cat.getFood()).thenReturn(meat);
        Assert.assertEquals(meat, cat.getFood());
    }
}