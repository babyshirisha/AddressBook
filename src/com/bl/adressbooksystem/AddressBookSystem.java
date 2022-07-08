package com.bl.adressbooksystem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookSystem {
    public static void main(String[] args) {
//        System.out.println("welcome to address book program");
//        AddressBook addressBook = new AddressBook("Shirisha", "Kadali","Telengana", "Hyderabad", 500011, 9999999999l,"babyshirisha24@gmail.com","hyderabad");
//        System.out.println(addressBook);
        System.out.println("welcome to address book program");
        //IAddressBook addressBook = new AddressBook();
        Map<String, IAddressBook> addressSystem = new HashMap<>();
        Scanner input = new Scanner(System.in);
        char choice;
        do {
            System.out.println("add address book to system");
            System.out.println("enter the name of address book");
            IAddressBook addressBook1 = new AddressBook();
            String bookName = input.next();
            addressSystem.put(bookName, addressBook1);
            System.out.println("Are you wish add multiple address book:  Y?N");
            choice = input.next().toUpperCase().charAt(0);
        } while (choice != 'N');
        do {
            System.out.println("Select the AddressBook");
            for (Map.Entry<String, IAddressBook> entry : addressSystem.entrySet()) {
                System.out.println(entry.getKey());
            }
            String bookName = input.next();
            if (addressSystem.containsKey(bookName)) {
                do {
                    System.out.println("Select your Option: \n1.Add new Contact \n2.Edit Contact \n3.Delete Contact");
                    int option = input.nextInt();
                    switch (option) {
                        case 1:
                            addressSystem.get(bookName).createContact();
                            break;
                        case 2:
                            addressSystem.get(bookName).editContact();
                            break;
                        case 3:
                            addressSystem.get(bookName).deleteContact();
                            break;
                        case 4:
                            addressSystem.get(bookName).contactList();
                            break;
                    }
                    System.out.println("Are you wish to continue:  Y?N");
                    choice = input.next().toUpperCase().charAt(0);
                } while (choice != 'N');
            }
            System.out.println("Are you wish to continue in address book:  Y?N");
            choice = input.next().toUpperCase().charAt(0);
        } while (choice != 'N');
        for (Map.Entry<String, IAddressBook> entry : addressSystem.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
//        addressBook.createContact();
//        System.out.println(addressBook);
                }
            }
        }