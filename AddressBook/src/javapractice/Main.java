package javapractice;

import java.util.Scanner;

public class Main {
    AddressBook addressBook = new AddressBook();

    public void handleUserMenuOption(int choice) {
        Scanner get = new Scanner(System.in);

        switch(choice) {
            case 1:
                addContact(addressBook);
                break;
            case 2:
                UserInterface userInterface = new UserInterface();
                userInterface.print(addressBook.getContactList());
                break;
            case 3:
                System.out.println("Enter First Name of the Contact to edit");
                String name = get.next();
                Contact contactToEdit = addressBook.getContact(name);
                if(contactToEdit != null)
                    update(contactToEdit);
                else
                    System.out.println("Given Name not found \n if you want to add new Contact use Add Contact option in Menu");
                break;
            default:
                System.out.println("Invalid Menu option");
                break;
        }
    }

    private void update(Contact contact) {
        int updateChoice = 0;
        UserInterface userInterface = new UserInterface();
        while(updateChoice <= 8) {
            if(updateChoice == 8) {
                System.out.println("Returning to Menu");
                break;
            }
            updateChoice = userInterface.showUpdateMenu();
            handleUserEditOption(updateChoice,contact);
        }
    }

    private void handleUserEditOption(int updateChoice, Contact contact) {
        Scanner get = new Scanner(System.in);
        switch(updateChoice) {
            case 1:
                System.out.println("Enter the new Last Name");
                contact.lastName = get.next();
                break;
            case 2:
                System.out.println("Enter the new Address");
                contact.address = get.next();
                break;
            case 3:
                System.out.println("Enter the new City");
                contact.city = get.next();
                break;
            case 4:
                System.out.println("Enter the new State");
                contact.state = get.next();
                break;
            case 5:
                System.out.println("Enter the new Pin-code");
                contact.pinCode = get.next();
                break;
            case 6:
                System.out.println("Enter the new PhoneNumber");
                contact.phoneNumber = get.next();
                break;
            case 7:
                System.out.println("Enter the new Email Id");
                contact.emailId = get.next();
                break;
            default:
                System.out.println("Invalid Option");
                break;
        }
    }

    private void addContact(AddressBook addressBook) {
        Scanner get = new Scanner(System.in);
        System.out.println("Enter the First Name");
        Contact contact = new Contact(get.next());
        String SKIP = "1";
        System.out.println("Enter the Last Name\n to skip the step press 1");
        String temp = get.next();
        if(!temp.equals(SKIP))
            contact.lastName = temp;
        System.out.println("Enter the Address\n to skip the step press 1");
        temp = get.next();
        if(!temp.equals(SKIP))
            contact.address = temp;
        System.out.println("Enter the city\n to skip the step press 1");
        temp = get.next();
        if(!temp.equals(SKIP))
            contact.city = temp;
        System.out.println("Enter the state\n to skip the step press 1");
        temp = get.next();
        if(!temp.equals(SKIP))
            contact.state = temp;
        System.out.println("Enter the pin-code\n to skip the step press 1");
        temp = get.next();
        if(!temp.equals(SKIP))
            contact.pinCode = temp;
        System.out.println("Enter the phone number");
        contact.phoneNumber = get.next();
        System.out.println("Enter the email id\n to skip the step press 1");
        temp = get.next();
        if(!temp.equals(SKIP))
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
            main.handleUserMenuOption(choice);
        }
    }
}
