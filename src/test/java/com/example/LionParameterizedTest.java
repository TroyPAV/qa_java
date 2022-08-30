package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionParameterizedTest {

    private static String sex;

    public LionParameterizedTest(String sex) {
        this.sex = sex;
    }

    @Parameterized.Parameters
    public static Object[][] getSex() {
        return new Object[][] {
                {"Самец"},
                {"Самка"},
                {"Сферический конь в вакууме"},
        };
    }

    //Тест метода doesHaveMane(), в зависимости от пола возващает true/false
    // или выбрасывает исключение при вводе недопустимого пола
    @Test
    public void doesHaveManeSexReturnBooleanOrException() {
        try {
            Lion lion = new Lion(sex);
            if (sex.equals("Самец")) {
                Assert.assertTrue(lion.hasMane);
            } else Assert.assertFalse(lion.hasMane);
        } catch (Exception exception) {
            String expectedText = "java.lang.Exception: Используйте допустимые значения пола животного - самец или самка";
            Assert.assertEquals(expectedText, exception.toString());
        }
    }
}