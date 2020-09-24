package testing;

public class Contact {
    public String firstName;
    public String lastName;
    public String streetName;
    public String city;
    public String country;

    public Contact() {
    }

    public Contact(String firstName, String lastName, String streetName, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.streetName = streetName;
        this.city = city;
    } 

    public Contact(String firstName, String lastName, String streetName, String city, String country) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.streetName = streetName;
        this.city = city;
        this.country = country;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Boolean matchCityIgnoreCase(String cityToMatch) {
        return this.city.equalsIgnoreCase(cityToMatch);
    }
}