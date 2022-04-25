package javapractice;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<Contact> contactList = new ArrayList<>();

    public void add(Contact contact) {
        contactList.add(contact);
    }

    public void remove(String name){
        contactList.removeIf(contact -> name == contact.firstName);
    }

    public List<Contact> getContactList() {
        return contactList;
    }
}
