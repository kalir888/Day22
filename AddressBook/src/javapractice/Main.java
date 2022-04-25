package javapractice;

import java.util.Scanner;

public class Main {
    AddressBook addressBook = new AddressBook();

    public void handleUserOption(int choice) {
        Scanner get = new Scanner(System.in);

        switch(choice) {
            case 1:
                addContact(addressBook);
                break;
            case 2:
                UserInterface userInterface = new UserInterface();
                userInterface.print(addressBook.getContactList());
                break;
            default:
                System.out.println("Invalid Menu option");
                break;
        }
    }

    private void addContact(AddressBook addressBook) {
        Scanner get = new Scanner(System.in);
        System.out.println("Enter the First Name");
        Contact contact = new Contact(get.next());
        System.out.println("Enter the Last Name\n to skip the step press 1");
        String temp = get.next();
        if(temp != "1")
            contact.lastName = temp;
        System.out.println("Enter the Address\n to skip the step press 1");
        Scanner read = new Scanner(System.in);
        String temp1 = read.nextLine();
        if(temp1 != "1")
            contact.address = temp1;
        System.out.println("Enter the city\n to skip the step press 1");
        temp = get.next();
        if(temp != "1")
            contact.city = temp;
        System.out.println("Enter the state\n to skip the step press 1");
        temp = get.next();
        if(temp != "1")
            contact.state = temp;
        System.out.println("Enter the pin-code\n to skip the step press 1");
        temp = get.next();
        if(temp != "1")
            contact.pinCode = temp;
        System.out.println("Enter the phone number");
        contact.phoneNumber = get.next();
        System.out.println("Enter the email id\n to skip the step press 1");
        temp = get.next();
        if(temp != "1")
            contact.emailId = temp;

        addressBook.add(contact);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book System");

        UserInterface userInterface = new UserInterface();
        Main main = new Main();

        int choice = 0;
        while(choice <= 5) {
            if(choice == 5) {
                System.out.println("Exiting from Menu");
                break;
            }
            choice = userInterface.showMenu();
            main.handleUserOption(choice);
        }
    }
}
