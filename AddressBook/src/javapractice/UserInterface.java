package javapractice;

import java.util.List;
import java.util.Scanner;

public class UserInterface {

    public void print(List<Contact> contactList) {
        for (Contact contact : contactList) {
            System.out.println(contact);
        }
    }

    public int showMenu() {
        System.out.println("Select an option: \n1.Add Contact 2.Print Contact 3.Edit Contact " +
                "4.Remove contact 5. Exit");
        Scanner get = new Scanner(System.in);
        int userChoice = get.nextInt();
        return userChoice;
    }

    public int showUpdateMenu() {
        System.out.println("Select an Option to edit:\n1.LastName\n2.Address" +
                "\n3.City\n4.State\n5.Pin-Code\n6.PhoneNumber\n7.EmailId\n8.Return to Menu ");
        Scanner get = new Scanner(System.in);
        int userChoice = get.nextInt();
        return userChoice;
    }
}
