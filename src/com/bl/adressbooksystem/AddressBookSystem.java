package com.bl.adressbooksystem;

public class AddressBookSystem {
    public static void main(String[] args) {
//        System.out.println("welcome to address book program");
//        AddressBook addressBook = new AddressBook("Shirisha", "Kadali","Telengana", "Hyderabad", 500011, 9999999999l,"babyshirisha24@gmail.com","hyderabad");
//        System.out.println(addressBook);
        System.out.println("welcome to address book program");
        IAddressBook addressBook = new AddressBook();
        addressBook.createContact();
        System.out.println(addressBook);
    }
}
