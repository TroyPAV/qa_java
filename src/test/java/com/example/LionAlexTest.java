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
public class LionAlexTest {

    @Mock
    Feline felineMock;

    //Тест метода doesHaveMane(), всегда возвращает true
    @Test
    public void doesHaveManeAlexReturnTrue() throws Exception {
        LionAlex alex = new LionAlex("Самец");
        Assert.assertTrue(alex.doesHaveMane());
    }

    //Тест метода getKittens(), всегда возвращает 0
    @Test
    public void getKittensAlexReturnZero() throws Exception {
        LionAlex alex = new LionAlex("Самец");
        Assert.assertEquals(0, alex.getKittens());
    }

    //Тест метода getFriends(), возвращает сисок друзей Алекса
    @Test
    public void getFriendsAlexReturnListOfFriends() throws Exception {
        LionAlex alex = new LionAlex("Самец");
        List<String> friends = Arrays.asList("Марти", "Глория", "Мелман");
        Assert.assertEquals(friends, alex.getFriends());
    }

    //Тест метода getPlaceOfLiving(), возвращает "Нью-Йоркский зоопарк"
    @Test
    public void getPlaceOfLivingAlexReturnStringZoo() throws Exception {
        LionAlex alex = new LionAlex("Самец");
        String zoo = "Нью-Йоркский зоопарк";
        Assert.assertEquals(zoo, alex.getPlaceOfLiving());
    }

    //Тест метода eatMeat(), возвращает список мясной еды ["Животные", "Птицы", "Рыба"]
    @Test
    public void getFoodForLionListOfMeat() throws Exception {
        LionAlex alex = new LionAlex(felineMock);
        List<String> meat = Arrays.asList("Животные", "Птицы", "Рыба");
        Mockito.when(alex.getFood()).thenReturn(meat);
        Assert.assertEquals(meat, alex.getFood());
    }

}