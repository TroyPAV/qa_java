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
public class LionTest {

    @Mock
    Kittens kittensMock;

    @Mock
    Predator predatorMock;

    //Тест метода getFood(), возвращает список мясной еды льва: ["Животные", "Птицы", "Рыба"]
    @Test
    public void getFoodForLionListOfMeat() throws Exception {
        Lion lion = new Lion(predatorMock);
        List<String> meat = Arrays.asList("Животные", "Птицы", "Рыба");
        Mockito.when(lion.getFood()).thenReturn(meat);
        Assert.assertEquals(meat, lion.getFood());
    }

    //Тест метода getKittens(), возвращает количество львят:1
    @Test
    public void getKittensDefaultReturnOne() {
        Lion lion = new Lion(kittensMock);
        Mockito.when(lion.getKittens()).thenReturn(1);
        Assert.assertEquals(1, lion.getKittens());
    }
}