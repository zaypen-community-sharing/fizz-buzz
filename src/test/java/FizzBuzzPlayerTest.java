import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzPlayerTest {
    private FizzBuzzPlayer player = new FizzBuzzPlayer();

    @Test
    public void shouldReturn1WhenSay1() {
        assertEquals("1", player.say(1));
    }

    @Test
    public void shouldReturn2WhenSay2() {
        assertEquals("2", player.say(2));
    }

    @Test
    public void shouldReturnFizzWhenSay3() {
        assertEquals("Fizz", player.say(3));
    }

    @Test
    public void shouldReturnFizzWhenSay6() {
        assertEquals("Fizz", player.say(6));
    }

    @Test
    public void shouldReturnBuzzWhenSay5() {
        assertEquals("Buzz", player.say(5));
    }

    @Test
    public void shouldReturnBuzzWhenSay10() {
        assertEquals("Buzz", player.say(10));
    }

    @Test
    public void shouldReturnFizzBuzzWhenSay15() {
        assertEquals("FizzBuzz", player.say(15));
    }
}
