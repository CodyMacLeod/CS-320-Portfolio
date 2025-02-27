/**
 * A set of tests for the ContactService class to ensure it meets requirements
 * 
 * @author Cody MacLeod
 */
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ContactServiceTest {

	/*
	 * A test to ensure the constructor works and creates the ArrayList for the contacts.
	 */
	@Test
	@DisplayName("Testing creation of Contact Service")
	void testContactService() {
		ContactService contactList = new ContactService();
		assertTrue(contactList.contacts != null);
	}
	
	/*
	 * A series of test to ensure that a new contact can be added to the array list.
	 * We also confirm that the contact ID is unique.
	 */
	@Test
	@DisplayName("Testing that adding a contact to the list works and adding a non unique ID doesn't")
	void testAddContact(){
		ContactService contactList = new ContactService();
		contactList.addContact("1", "First", "Last", "1112223333", "Address");
		assertTrue(contactList.checkContact("1") != null); 
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contactList.addContact("1", "First", "Last", "1112223333", "Address");
		});
	}
	
	/*
	 * A series of tests to ensure that a contact can be removed from the contacts list.
	 */
	@Test
	@DisplayName("Testing that a contact can be removed from the list")
	void testRemoveContact() {
		ContactService contactList = new ContactService();
		contactList.addContact("1", "First", "Last", "1112223333", "Address");
		contactList.removeContact("1");
		assertTrue(contactList.checkContact("1") == null);
	}

	/*
	 * A series of tests to ensure you can update the first name of a contact based on the contactID
	 */
	@Test
	@DisplayName("Testing that the first name of a contact can be modified")
	void testUpdateFirstName() {
		ContactService contactList = new ContactService();
		contactList.addContact("1", "First", "Last", "1112223333", "Address");
		contactList.updateFirstName("1", "New Name");
		assertTrue(contactList.checkContact("1").getFirstName().equals("New Name"));
	}
	
	/*
	 * A series of tests to ensure you can update the last name of a contact based on the contactID
	 */
	@Test
	@DisplayName("Testing that the last name of a contact can be modified")
	void testUpdateLastName() {
		ContactService contactList = new ContactService();
		contactList.addContact("1", "First", "Last", "1112223333", "Address");
		contactList.updateLastName("1", "New Name");
		assertTrue(contactList.checkContact("1").getLastName().equals("New Name"));
	}
	
	/*
	 * A series of tests that ensure you can update the phone number of a contact based on the contactID
	 */
	@Test
	@DisplayName("Testing that the phone number of a contact can be updated")
	void testUpdatePhoneNumber() {
		ContactService contactList = new ContactService();
		contactList.addContact("1", "First", "Last", "1112223333", "Address");
		contactList.updatePhoneNumber("1", "3332221111");
		assertTrue(contactList.checkContact("1").getPhoneNumber().equals("3332221111"));
	}
	
	/*
	 * A series of tests that ensure you can update the address of a contact based on the contactID
	 */
	@Test
	@DisplayName("Testing that the address of a contact can be updated based on the contactID")
	void testUpdateAddress() {
		ContactService contactList = new ContactService();
		contactList.addContact("1", "First", "Last", "1112223333", "Address");
		contactList.updateAddress("1", "New Address");
		assertTrue(contactList.checkContact("1").getAddress().equals("New Address"));
	}
}
