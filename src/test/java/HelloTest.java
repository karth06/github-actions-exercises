package src.test.java;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import src.main.java.Test;

public class HelloTest {

    @Test
    public void testGreeting() {
        assertEquals("Hello Test lol!", Test.greet());
    }
}