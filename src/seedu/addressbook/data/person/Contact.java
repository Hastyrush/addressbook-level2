package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

public class Contact {
	public final String value;
    private boolean isPrivate;


    /**
     * Validates given contact.
     *
     * @throws IllegalValueException if given address string is invalid.
     */
    public Contact(String contact, boolean isPrivate, String example, String constraints, String validRegex) throws IllegalValueException {
        this.isPrivate = isPrivate;
        contact = contact.trim();
        if (!isValidContact(contact, validRegex)) {
            throw new IllegalValueException(constraints);
        }
        this.value = contact;
    }

    /**
     * Returns true if a given string is a valid person email.
     */
    public static boolean isValidContact(String test, String validRegex) {
        return test.matches(validRegex);
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Contact // instance of handles nulls
                && this.value.equals(((Contact) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }

}
