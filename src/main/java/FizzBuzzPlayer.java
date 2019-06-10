public class FizzBuzzPlayer {

    public String say(int i) {
        if (i == 3) {
            return "Fizz";
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
