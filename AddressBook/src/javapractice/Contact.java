package javapractice;

import java.util.Objects;

public class Contact {
    public String firstName;
    public String lastName;
    public String address;
    public String city;
    public String state;
    public String pinCode;
    public String phoneNumber;
    public String emailId;

    public Contact(String name) {
        firstName = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Contact contact = (Contact) o;
        return phoneNumber == contact.phoneNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneNumber);
    }

    @Override
    public String toString() {
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", pinCode=" + pinCode +
                ", phoneNumber=" + phoneNumber +
                ", emailId='" + emailId + '\'' +
                '}';
    }
}
