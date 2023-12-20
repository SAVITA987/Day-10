package test;

import java.util.ArrayList;
import java.util.List;

class AddressBook {
    private List<Contact> contacts;

    // Constructor
    public AddressBook() {
        contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void editContact(String firstName, String lastName) {
        
    }

    public void deleteContact(String firstName, String lastName) {
      
    }

    }

