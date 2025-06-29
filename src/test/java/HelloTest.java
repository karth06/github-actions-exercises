package src.test.java;
import src.main.java.Hello;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloTest{
    @Test
    void testGreeting() {
        assertEquals("Hello",Hello.greet()); // will fail
    }
}