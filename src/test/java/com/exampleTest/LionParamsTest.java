package com.exampleTest;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParamsTest {

    private final boolean doesHaveMane;
    private final String sex;

    @Mock
    private Feline feline;

    public LionParamsTest(boolean doesHaveMane, String sex) {
        this.doesHaveMane = doesHaveMane;
        this.sex = sex;
    }

    @Parameterized.Parameters(name = "Пол льва. Тестовые данные: {0} {1}")
    public static Object[][] getTestDataTest() {
        return new Object[][]{
                {true, "Самец"},
                {false, "Самка"},
                {false, "Неопределенный"}
        };
    }

    @Test
    public void shouldShowLionGenderTest() {
        try {
            Lion lion = new Lion(sex, feline);
            boolean actual = lion.doesHaveMane();
            assertEquals(doesHaveMane, actual);
        } catch (Exception e) {
            assertEquals("Используйте допустимые значения пола животного - самец или самка", e.getMessage());
        }
    }
}
