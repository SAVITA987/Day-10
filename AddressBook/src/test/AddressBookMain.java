package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

	public class AddressBookMain {
	    private Map<String, AddressBook> addressBooks;

	    // Constructor
	    public AddressBookMain() {
	        addressBooks = new HashMap<>();
	    }

	    // Method to add a new Address Book
	    public void addAddressBook(String name) {
	        AddressBook addressBook = new AddressBook();
	        addressBooks.put(name, addressBook);
	    }

	    public static void main(String[] args) {
	        AddressBookMain addressBookMain = new AddressBookMain();

	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Welcome to Address Book Program");

	        System.out.println("Enter the name of the Address Book: ");
	        String addressBookName = scanner.nextLine();
	        addressBookMain.addAddressBook(addressBookName);

	        System.out.println("Enter the details of the person:");
	        System.out.print("First Name: ");
	        String firstName = scanner.nextLine();
	        System.out.print("Last Name: ");
	        String lastName = scanner.nextLine();
	        System.out.print("Address: ");
	        String address = scanner.nextLine();
	        System.out.print("City: ");
	        String city = scanner.nextLine();
	        System.out.print("State: ");
	        String state = scanner.nextLine();
	        System.out.print("Zip: ");
	        String zip = scanner.nextLine();
	        System.out.print("Phone Number: ");
	        String phoneNumber = scanner.nextLine();
	        System.out.print("Email: ");
	        String email = scanner.nextLine();
	        System.out.println("Contact Saved Successfuly....");

	      
	        Contact newContact = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);

	        // Adding the contact to the specified Address Book
	        addressBookMain.addressBooks.get(addressBookName).addContact(newContact);

	      
	    }
	}

