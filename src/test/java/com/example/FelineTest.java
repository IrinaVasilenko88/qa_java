package com.example;

import com.example.Feline;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FelineTest {

    @Test
    public void familyTest() {
        Feline feline = new Feline();
        String family = feline.getFamily();
        assertEquals("Кошачьи", family);
    }

    @Test
    public void getKittensTest() {
        Feline feline = new Feline();
        assertEquals(1, feline.getKittens());

    }

    @Test
    public void countKittensTest() {
        Feline feline = new Feline();
        assertEquals(3, feline.getKittens(3));

    }
}
