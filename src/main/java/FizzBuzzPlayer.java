public class FizzBuzzPlayer {

    public String say(int i) {
        return String.valueOf(i);
    }

    public static void main(String[] args) {
        FizzBuzzPlayer player = new FizzBuzzPlayer();
        for (int i = 1; i <= 100; i++) {
            System.out.println(player.say(i));
        }
    }
}
