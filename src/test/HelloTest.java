import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloTest {

    @Test
    public void testGreeting() {
        assertEquals("Hello Test!", Main.greet());
    }
}