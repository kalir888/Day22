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
        System.out.println("Select an option: \n1.Add contact 2.Print contact 3. Remove " +
                "contact 4. Update contact 5. Exit");
        Scanner get = new Scanner(System.in);
        int userChoice = get.nextInt();
        return userChoice;
    }

}
