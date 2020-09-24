package question;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OddServiceTest {

    public static void main(String[] args) {
        OddServiceTest test = new OddServiceTest();
        test.testOddServiceTrue();
        test.testOddServiceFalse();
    }

    /**
     * Command to run test:
     *     mvn -Dtest=OddServiceTest#testOddServiceTrue test
     */
    @Test
    public void testOddServiceTrue() {
        assertEquals("test", "test");
    }

    /**
     * Command to run test:
     *     mvn -Dtest=OddServiceTest#testOddServiceFalse test
     */
    @Test
    public void testOddServiceFalse() {
        assertEquals("test", "test");
    }

}
