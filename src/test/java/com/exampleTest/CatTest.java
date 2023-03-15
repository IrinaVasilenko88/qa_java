package com.exampleTest;

import com.example.Cat;
import com.example.Feline;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CatTest {

    @Test
    public void getSoundTest() {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        String expected = "Мяу";
        assertEquals(expected, cat.getSound());
    }

    @Test
    public void getFoodTest() throws Exception {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        List<String> expectedMeat = Arrays.asList("Животные", "Птицы", "Рыба");
        assertEquals(expectedMeat, cat.getFood());
    }
}
