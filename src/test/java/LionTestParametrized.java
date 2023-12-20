import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;


import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class LionTestParametrized {
    @Mock
    Feline feline;

    private String sex;
    private Boolean isMane;

    public LionTestParametrized(String sex, Boolean isMane) {
        this.sex = sex;
        this.isMane = isMane;
    }

    @Test
    public void testDoesHaveManeTrue() throws Exception {
        Lion lion = new Lion(sex, feline);
        boolean result = lion.doesHaveMane();
        assertEquals(isMane, result);
    }

    @Parameterized.Parameters
    public static Object[][] testDataValidSex() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }
}