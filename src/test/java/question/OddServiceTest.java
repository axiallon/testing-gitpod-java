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
        int[] input = new int[] { 1, 2, 34, 3, 4, 5, 7, 23, 12 };
        OddService service = new OddService();
        boolean result = service.hasThreeConsecutiveOdds(input);
        assertTrue(result);
    }

    /**
     * Command to run test:
     *     mvn -Dtest=OddServiceTest#testOddServiceFalse test
     */
    @Test
    public void testOddServiceFalse() {
        int[] input = new int[] { 2, 6, 4, 1 };
        OddService service = new OddService();
        boolean result = service.hasThreeConsecutiveOdds(input);
        assertFalse(result);
    }

}
