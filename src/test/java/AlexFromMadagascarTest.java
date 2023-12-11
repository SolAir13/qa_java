import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class AlexFromMadagascarTest {
    @Mock
    AlexFromMadagascar alexFromMadagascar;

    @Test
    public void testNameFriendsAlexAllName() throws Exception {
        AlexFromMadagascar alexFromMadagascar = new AlexFromMadagascar("Самец");
        String allNameFriends = alexFromMadagascar.getFriends();
        Assert.assertEquals("Марти, Глория, Мелман", allNameFriends);

    }

    @Test
    public void testCityLiveAlexOwnCityAlex() throws Exception {
        AlexFromMadagascar alexFromMadagascar = new AlexFromMadagascar("Самец");
        String cityAlex = alexFromMadagascar.getPlaceOfLiving();
        Assert.assertEquals("Нью-Йоркский зоопарк", cityAlex);
    }

    @Test
    public void testGetKittensWhenKittensZero() throws Exception {
        AlexFromMadagascar alexFromMadagascar = new AlexFromMadagascar("Самец");
        int kittens = alexFromMadagascar.getKittens();
        Assert.assertEquals(0, kittens);
    }


}
