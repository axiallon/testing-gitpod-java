package testing;

import java.util.List;
import java.util.ArrayList;

public class AddressBook {
    public static List<Contact> findContactsInCity(String city) {
        List<Contact> contactsForReturn = new ArrayList<Contact>();

        for(Contact contact : getContacts()) {
            if(contact.matchCityIgnoreCase(city)) {
                contactsForReturn.add(contact);
            }
        }
        return contactsForReturn;
    }

    public static List<Contact> getContacts() {
        List<Contact> contacts = new ArrayList<Contact>();
        contacts.add(new Contact("John", "Doe", "Main St.", "London"));
        contacts.add(new Contact("Billy", "Bob", "Fourth Ave.", "Westchestertonfieldville", "United States"));
        contacts.add(new Contact("Sam", "Smith", "Baker Blvd.", "Sacramento"));
        return contacts;
    }
}