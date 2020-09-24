package testing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UnitTests {

        public static void main(String[] args) {
        //OddServiceTest test = new OddServiceTest();
        //test.testOddServiceTrue();
        //test.testOddServiceFalse();
    }

    /**
     * Command to run test:
     *     mvn -Dtest=UnitTests#testOne
     */
    @Test
    public void testOne() {
        assertEquals("test", "test");
    }
}