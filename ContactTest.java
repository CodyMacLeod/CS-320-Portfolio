/**
 * A set of tests for the Contact class to ensure it meets requirements
 * 
 * @author Cody MacLeod
 */
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ContactTest {

	/*
	 * A series of tests that ensures functionality of the constructor, setter, and getter methods.
	 */
	@Test
	@DisplayName("Creating contact and assigning variables works")
	void testContact() {
		Contact contact = new Contact("1", "First", "Last", "1112223333", "Address St");
		assertTrue(contact.getContactID().equals("1"));
		assertTrue(contact.getFirstName().equals("First"));
		assertTrue(contact.getLastName().equals("Last"));
		assertTrue(contact.getPhoneNumber().equals("1112223333"));
		assertTrue(contact.getAddress().equals("Address St"));
	}
	
	/*
	 * A series of tests to ensure the ContactID can't be longer than 10 characters or null.
	 */
	@Test
	@DisplayName("ContactID tests for > 10 character and null")
	void  testContactID() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345678910", "First", "Last","111222333", "Address St");
		});		
	Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Contact(null, "First", "Last","111222333", "Address St");
		});		
	}
	
	/*
	 * A series of tests to ensure that firstName isn't longer than 10 characters or null.
	 */
	@Test
	@DisplayName("FirstName tests for > 10 character and null")
	void  testFirstName() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "FirstNameTooLong", "Last","111222333", "Address St");
		});		
	Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Contact("2", null, "Last","111222333", "Address St");
		});		
	}
	
	/*
	 * A series of tests to ensure that lastName isn't longer than 10 character or null.
	 */
	@Test
	@DisplayName("LastName tests for > 10 character and null")
	void  testLastName() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "First", "LastNameTooLong","111222333", "Address St");
		});		
	Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Contact("2", "First", null,"111222333", "Address St");
		});		
	}
	
	/*
	 * A series of tests that ensure the phone number is exactly 10 character and not null.
	 */
	@Test
	@DisplayName("PhoneNumber tests for > 10, < 10, and null")
	void  testPhoneNumber() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "First", "Last","11122233339", "Address St");
		});		
	Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Contact("2", "First", "Last","1", "Address St");
		});		
	Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Contact("3", "First", "Last", null, "Address St");
		});
	}
	
	/*
	 * A series of tests that ensures the address isn't longer than 30 character and not null.
	 */
	@Test
	@DisplayName("Address tests for >30 and null")
	void  testAddress() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "First", "Last","1112223333", "1234567890123456789012345678901");
		});		
	Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Contact("2", "First", "Last", "1112223333", null);
		});		
	}
	
}
