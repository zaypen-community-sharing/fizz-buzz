public class FizzBuzzPlayer {

    private static final String BUZZ = "Buzz";
    private static final String FIZZ = "Fizz";

    public String say(int i) {
        StringBuilder sb = new StringBuilder();
        if (i % 3 == 0) {
            sb.append(FIZZ);
        }
        if (i % 5 == 0) {
            sb.append(BUZZ);
        }
        return sb.length() > 0 ? sb.toString() : String.valueOf(i);
    }

    public static void main(String[] args) {
        FizzBuzzPlayer player = new FizzBuzzPlayer();
        for (int i = 1; i <= 100; i++) {
            System.out.println(player.say(i));
        }
    }
}
