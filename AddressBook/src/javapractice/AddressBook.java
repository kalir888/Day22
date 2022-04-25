package javapractice;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<Contact> contactList = new ArrayList<>();

    public void add(Contact contact) {
        contactList.add(contact);
    }

    public void remove(Contact contact){
        contactList.remove(contact);
    }

    public Contact getContact(String name) {
        for(Contact contact: contactList) {
            if(contact.firstName.equals(name))
                return contact;
        }
        return null;
    }

    public List<Contact> getContactList() {
        return contactList;
    }
}
