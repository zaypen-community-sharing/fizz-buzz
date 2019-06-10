import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzPlayerTest {
    private FizzBuzzPlayer player = new FizzBuzzPlayer();

    @Test
    public void shouldReturn1WhenSay1() {
        assertEquals("1", player.say(1));
    }
}
