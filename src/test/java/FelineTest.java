import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    @Mock
    Feline feline;

    @Test
    public void testGetFamilyReturnsCats(){
        Feline feline = new Feline();
        String result = feline.getFamily();

        // Проверяем, что список еды содержит ожидаемые значения
        Assert.assertEquals("Кошачьи", result);
        // Другие ожидаемые значения еды, если есть
    }

    @Test
    public void testGetKittens() {
        Feline feline = new Feline();
        int kittens = feline.getKittens();

        // Проверяем, что значение kittens равно 1
        Assert.assertEquals(1, kittens);
    }

    @Test
    public void testGetKittensWithArgument() {
        Feline feline = new Feline();
        int kittens = feline.getKittens(3);

        // Проверяем, что значение kittens равно 3
        Assert.assertEquals(3, kittens);
    }
    @Test
    public void testEatMeat() throws Exception {
        List<String> mealList = List.of("Животные", "Птицы", "Рыбы");
        Mockito.when(feline.eatMeat()).thenReturn(mealList);
        List<String> food = feline.eatMeat();
        // Проверяем, что список еды содержит ожидаемые значения
        Assert.assertEquals(food, mealList);
    }
}
