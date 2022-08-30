package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class AnimalTest {

    private final String animalKind;

    public AnimalTest(String animalKind) {
        this.animalKind = animalKind;
    }

    @Parameterized.Parameters
    public static Object[][] getAnimalKind() {
        return new Object[][] {
                {"Хищник"},
                {"Травоядное"},
                {"Десептикон"},
        };
    }

    //Тест метода getFood(), возвращает список еды в зависимости от типа животного
    //или выбрасывает исключение при вводе недопустимого типа
    @Test
    public void getFoodAnimalKindReturnListOfFoodOrException() {
        try {
            Animal animal = new Animal();
            if (animalKind.equals("Хищник")) {
                List<String> predator = Arrays.asList("Животные", "Птицы", "Рыба");
                Assert.assertEquals(predator, animal.getFood(animalKind));
            } else {
                List<String> herbivorous = Arrays.asList("Трава", "Различные растения");
                Assert.assertEquals(herbivorous, animal.getFood(animalKind));
            }
        } catch (Exception exception) {
            String expectedText = "java.lang.Exception: Неизвестный вид животного, используйте значение Травоядное или Хищник";
            Assert.assertEquals(expectedText, exception.toString());
        }
    }

    //Тест метода getFamily(), возвращает строку с перечислением семейств
    @Test
    public void getFamilyDefaultReturnString() {
        Animal animal = new Animal();
        String families = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        Assert.assertEquals(families, animal.getFamily());
    }
}