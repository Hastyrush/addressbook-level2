package seedu.addressbook.data.person;

/* This represents a person's postal code in the address class */

public class PostalCode {
	String postalCode = new String();
	
	public PostalCode () {
	}
	
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	public String getPostalCode() {
		return postalCode;
	}

}
