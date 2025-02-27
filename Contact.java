/**
 * A class to cover the creation of individual contacts.
 * Contacts must meet appropriate requirements for each field.
 * 
 * @author Cody MacLeod
 */
public class Contact {
	//variable declarations
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;
	private final String contactID;			// final so it cannot be changed after creation
	
	/*
	 * Constructor using five inputs, the ContacID, firstName, lastName, phoneNumber, and Address.
	 */
	public Contact(String contactID, String firstName, String lastName, String phoneNumber, String address){
		// Ensuring contact ID is not null and not longer than 10 characters
		if(contactID == null || contactID.length() > 10) {
			throw new IllegalArgumentException("Invalid contact ID");
		}
		
		// Setting the contact ID. It cannot be changed past this point.
		this.contactID = contactID;
		
		// Calling setter methods to set other components of the contact.
		setFirstName(firstName);
		setLastName(lastName);
		setPhoneNumber(phoneNumber);
		setAddress(address);
	}
	
	/*
	 * A getter method to return the contact ID.
	 * There is no setter method since the contact ID is unique and not updatable. 
	 * 
	 * @return A string containing the contactID.
	 */
	public String getContactID() {
		return contactID;
	}
	
	/*
	 * A getter method to return the first name of the contact.
	 * 
	 * @return A string containing the first name.
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/*
	 * A setter method to change the first name of the contact while ensuring it is valid.
	 */
	public void setFirstName(String firstName) {
		// Checking to ensure the the first name isn't null or greater than 10 characters.
		if(firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid first name");
		}
		
		this.firstName = firstName;
	}
	
	/*
	 * A getter method to return the last name of the contact.
	 * 
	 * @return A string containing the last name.
	 */
	public String getLastName() {
		return lastName;
	}
	
	/*
	 * A setter method to change the last name of the contact while ensuring it is valid.
	 */
	public void setLastName(String lastName) {
		// Checking that the last name fits the requirements of being less than 10 character and not null.
		if(lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid last name");
		}
		
		this.lastName = lastName;
	}
	
	/*
	 * A getter method to retrieve the phone number of the contact.
	 * 
	 * @return A string containing the phone number.
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	/*
	 * A setter method to change the phone number of the contact while ensuring it is exactly 
	 */
	public void setPhoneNumber(String phoneNumber) {
		// Checking that the string is not null and exactly 10 characters
		if(phoneNumber == null || phoneNumber.length() != 10) {
			throw new IllegalArgumentException("Invalid phone number");
		}
		
		this.phoneNumber = phoneNumber;
	}
	
	/*
	 * A getter method to return the address of the contract.
	 * 
	 *  @return A string containing the address.
	 */
	public String getAddress() {
		return address;
	}
	
	/*
	 * A setter method to change the address while ensuring it is not greater than 30 character or null.
	 */
	public void setAddress(String address) {
		// Checking that the string is not null and less than 30 characters long.
		if(address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid address");
		}
		
		this.address = address;
	}
	
}
