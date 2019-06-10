public class FizzBuzzPlayer {

    private static final String BUZZ = "Buzz";
    private static final String FIZZ = "Fizz";
    private static final String FIZZ_BUZZ = FIZZ + BUZZ;

    public String say(int i) {
        if (i % 15 == 0) {
            return FIZZ_BUZZ;
        } else if (i % 3 == 0) {
            return FIZZ;
        } else if (i % 5 == 0) {
            return BUZZ;
        }
        return String.valueOf(i);
    }

    public static void main(String[] args) {
        FizzBuzzPlayer player = new FizzBuzzPlayer();
        for (int i = 1; i <= 100; i++) {
            System.out.println(player.say(i));
        }
    }
}
