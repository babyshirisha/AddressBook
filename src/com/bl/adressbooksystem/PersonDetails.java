package com.bl.adressbooksystem;

public class PersonDetails {
    public String firstName;
    public String lastName;
    public String state;
    public String city;
    public int zip;
    public long phoneNumber;
    public String email;
    public String address;


    public void AddressBook(String firstName, String lastName, String state, String city, int zip, long phoneNumber, String email, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.state = state;
        this.city = city;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }
    public PersonDetails() {
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZip(Integer zip) {
        this.zip = zip;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    @Override
    public String toString() {
        return "AddressBook{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", zip=" + zip +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
