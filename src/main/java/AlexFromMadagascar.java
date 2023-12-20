public class AlexFromMadagascar extends Lion {


    public AlexFromMadagascar(String sex) throws Exception {
        super("Самец", null);
    }


    public String getFriends() {
        return "Марти, Глория, Мелман";
    }

    public String getPlaceOfLiving() {
        return "Нью-Йоркский зоопарк";
    }

    @Override
    public int getKittens() {
        return 0;
    }
}
