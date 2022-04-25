package javapractice;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class UserInterface {

    public void print(Set<Contact> contactList) {
        for (Contact contact : contactList) {
            System.out.println(contact);
        }
    }

    public int showMenu() {
        System.out.println("Select an option: \n1.Create 2.Print 3.Edit 4.Remove 5.Exit");
        Scanner get = new Scanner(System.in);
        return get.nextInt();
    }

    public int showEditMenu() {
        System.out.println("Select an Option to edit:\n1.LastName\n2.Address" +
                "\n3.City\n4.State\n5.Pin-Code\n6.PhoneNumber\n7.EmailId\n8.Return to Menu ");
        Scanner get = new Scanner(System.in);
        return get.nextInt();
    }
}
