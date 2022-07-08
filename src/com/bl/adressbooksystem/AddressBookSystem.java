package com.bl.adressbooksystem;

import java.util.Scanner;

public class AddressBookSystem {
    public static void main(String[] args) {
//        System.out.println("welcome to address book program");
//        AddressBook addressBook = new AddressBook("Shirisha", "Kadali","Telengana", "Hyderabad", 500011, 9999999999l,"babyshirisha24@gmail.com","hyderabad");
//        System.out.println(addressBook);
        System.out.println("welcome to address book program");
        IAddressBook addressBook = new AddressBook();
        Scanner input = new Scanner(System.in);
        char choice;
        do {
            System.out.println("Select your Option: \n1.Add new Contact \n2.Edit Contact");
            int option = input.nextInt();
            switch (option) {
                case 1:
                    addressBook.createContact();
                    break;
                case 2:
                    addressBook.editContact();
                    break;
            }
            System.out.println("Are you wish to continue:  Y?N");
            choice = input.next().toUpperCase().charAt(0);
        } while (choice != 'N');
        System.out.println(addressBook);
//        addressBook.createContact();
//        System.out.println(addressBook);
    }
}
