package javapractice;

import java.util.HashMap;

public class AddressBookStorage {
    private static AddressBookStorage instance;
    private HashMap<String,AddressBook> AddressBookLibrary = new HashMap<>();

    private AddressBookStorage() {
    }

    public static AddressBookStorage getInstance() {
        if(instance == null)
            instance = new AddressBookStorage();
        return instance;
    }

    public boolean addressBookNameValidCheck(String name) {
        if(AddressBookLibrary.containsKey(name))
            return false;
        else
            return true;
    }

    public void addAddressBook(String key, AddressBook addressBook) {
        AddressBookLibrary.put(key, addressBook);
    }

    public void removeAddressBook(String key) {
        AddressBookLibrary.remove(key);
    }

    public AddressBook getAddressBook(String key) {
        return AddressBookLibrary.get(key);
    }

    public HashMap<String, AddressBook> getAddressBookLibrary() {
        return AddressBookLibrary;
    }
}
