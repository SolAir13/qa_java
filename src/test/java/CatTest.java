import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    private Cat cat;

    @Before
    public void setUp() {
        Feline feline = new Feline();
        cat = new Cat(feline);
    }

    @Test
    public void testGetSoundCatSayMaay() {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        String catSound = cat.getSound();
        assertEquals("Мяу", catSound);
    }

    @Test
    public void testGetFoodCatEatingMeatBirdFish() throws Exception {
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        List<String> actualFood = cat.getFood();
        assertEquals(expectedFood, actualFood);
    }

    @Test(expected = Exception.class)
    public void testGetFoodEmptyValues() throws Exception {
        Cat catWithEmptyValues = new Cat(null);
        catWithEmptyValues.getFood();
    }

}
