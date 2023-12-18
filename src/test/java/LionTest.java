import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    Feline feline;

    @Test
    public void testConstructorValidSex() throws Exception {
        Lion lion = new Lion("Самец", feline);
        // Предполагаемый результат
        boolean expectedHasMane = true;
        // Проверка значения hasMane
        Assert.assertEquals(expectedHasMane, lion.doesHaveMane());
    }

    @Test
    public void testDoesHaveManeTrue() throws Exception {
        Lion lion = new Lion("Самец", feline);
        boolean result = lion.doesHaveMane();
        assertTrue(result);
    }

    @Test
    public void testDoesHaveManeFalse() throws Exception {
        Lion lion = new Lion("Самка", feline);
        boolean result = lion.doesHaveMane();
        assertFalse(result);
    }

    @Test
    public void testLionConstructorInvalidSex() {
        Exception exception = Assert.assertThrows(Exception.class, () -> new Lion("INVALID", feline));
        Assert.assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
        }

    @Test
    public void testGetKittens() throws Exception {
        Mockito.when(feline.getKittens()).thenReturn(1);
        Lion lion = new Lion("Самец", feline);
        // Проверяем, что значение kittens равно 1
        Assert.assertEquals("Число неверное!", 1, lion.getKittens());
    }

    @Test
    public void testGetKittensWithArgument() throws Exception {
        Mockito.when(feline.getKittens()).thenReturn(1);
        Lion lion = new Lion("Самец", feline);
        // Проверяем, что значение kittens равно 3
        Assert.assertNotEquals("Число неверное!", 3, lion.getKittens());
    }

    @Test
    public void testEatMeat() throws Exception {
        Lion lion = new Lion("Самец", feline);
        List<String> meal_list = List.of("Животные", "Птицы", "Рыба");
        List<String> food = lion.eatMeat();
        // Проверка списка еды на значения из интерфейса Predator
        Assert.assertEquals(meal_list, food);
    }

}