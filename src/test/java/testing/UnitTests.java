package testing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class UnitTests {

    public static void main(String[] args) {
        UnitTests test = new UnitTests();
        test.testOne();
        test.testTwo();
        test.testThree();
        test.testFour();
    }

    /**
     * Command to run test:
     *     mvn -Dtest=UnitTests#testOne test
     */
    @Test
    public void testOne() {
        System.out.println("Starting Test One!");
        int[] input = new int[] {15, 32, 8, 99, 12};
        int min = MathUtil.findMin(input);
        assertEquals(8, min);
        System.out.println("Finished Test One!");
    }

    /**
     * Command to run test:
     *     mvn -Dtest=UnitTests#testTwo test
     */
    @Test
    public void testTwo() {
        System.out.println("Starting Test Two!");
        int[] input = new int[] {};
        int min = MathUtil.findMin(input);
        assertEquals(0, min);
        System.out.println("Finished Test Two!");
    }

    /**
     * Command to run test:
     *     mvn -Dtest=UnitTests#testThree test
     */
    @Test
    public void testThree() {
        System.out.println("Starting Test Three!");
        int[] input = new int[] {2, 67, 10};
        int min = MathUtil.findMin(input);
        assertEquals(2, min);
        System.out.println("Finished Test Three!");
    }

    /**
     * Command to run test:
     *     mvn -Dtest=UnitTests#testFour test
     */
    @Test
    public void testFour() {
        System.out.println("Starting Test Four!");
        List<Contact> contacts = AddressBook.findContactsInCity("London");
        assertEquals(1, contacts.size());
        Contact contact = contacts.get(0);
        assertEquals("John", contact.firstName);
        System.out.println("Finished Test Four!");
    }
}