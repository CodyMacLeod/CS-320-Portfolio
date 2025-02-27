/**
 * A class covering the contact services.
 * It's able to hold all contacts, add new ones, delete ones,
 * and change the fields besides the contactID.
 * 
 * @author Cody MacLeod
 *
 */
import java.util.ArrayList;

public class ContactService {
	// declaring an array list to hold all the contacts
	public ArrayList<Contact> contacts; 
	
	/*
	 * A constructor to create the ArrayList for the contacts.
	 */
	public ContactService() {
		contacts = new ArrayList<Contact>();
	}
	
	/*
	 * A method to see if a contact is already in the list.
	 * Used for ensuring the contact ID remains unique.
	 * 
	 * @return The contact corresponding to the ID or null.
	 */
	public Contact checkContact(String contactID) {
		// Iterating through the arrayList to check if the contact already exists
		for(int i = 0; i < contacts.size(); ++i) {
			if(contacts.get(i).getContactID().equals(contactID)) {
				return contacts.get(i);
			}
		}
		
		// If no contact is found, return null.
		return null;
	}
	
	/*
	 * A method to add a new contact to the ArrayList.
	 * It must call checkContact to ensure the contactID is unique.
	 */
	public void addContact(String contactID, String firstName, String lastName, String phoneNumber, String address) {
		// Verify a contact with that contactID does not already exist
		if(checkContact(contactID) == null) {
			// Create the new contact and add it to the list
			Contact newContact = new Contact(contactID, firstName, lastName, phoneNumber, address);
			contacts.add(newContact);
		}
		else {
			// If it is not unique, throw an illegal argument exception.
			throw new IllegalArgumentException("Contact ID not unique");
		}
	}
	
	/*
	 * A method to remove a contact from the ArrayList
	 */
	public void removeContact(String contactID) {
		// Ensuring the contact exists
		if(checkContact(contactID) != null) {
			// Removing from the arrayList
			contacts.remove(checkContact(contactID));
		}
	}
	
	/*
	 * A method to modify the first name of the contact for the corresponding contactID
	 */
	public void updateFirstName(String contactID, String firstName) {
		// Ensuring the contact actually exists
		if(checkContact(contactID) != null) {
			// Changing the first name of the contact
			checkContact(contactID).setFirstName(firstName);
		}
	}
	
	/*
	 * A method to modify the last name of the contact for the corresponding contactID
	 */
	public void updateLastName(String contactID, String lastName) {
		// Ensuring the contact actually exists
		if(checkContact(contactID) != null) {
			// Changing the last name of the contact
			checkContact(contactID).setLastName(lastName);
		}
	}

	/*
	 * A method to modify the phone number of the contact for the corresponding contactID
	 */
	public void updatePhoneNumber(String contactID, String phoneNumber) {
		// Ensuring the contact actually exists
		if(checkContact(contactID) != null) {
			// Changing the phone number of the contact
			checkContact(contactID).setPhoneNumber(phoneNumber);
		}
	}
	
	/*
	 * A method to modify the address of the contact for the corresponding contactID
	 */
	public void updateAddress(String contactID, String address) {
		// Ensuring the contact actually exists
		if(checkContact(contactID) != null) {
			// Changing the address of the contact
			checkContact(contactID).setAddress(address);
		}
	}
}
