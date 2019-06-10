public class FizzBuzzPlayer {

    public String say(int i) {
        if (i % 3 == 0) {
            if (i % 5 == 0) {
                return "FizzBuzz";
            } else {
                return "Fizz";
            }
        } else if (i % 5 == 0) {
            return "Buzz";
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
