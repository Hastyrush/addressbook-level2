package seedu.addressbook.data.tag;

import seedu.addressbook.data.person.*;

public class Tagging {
	private Person person;
	private String sign;
	private Tag tag;
	
	public Tagging(Person person, String operator, Tag tag) {
		this.person = person;
		this.tag = tag;
		 if (operator.equals("+")) {
			 sign = "+";
		 }
		 else if (operator.equals("-")) {
			 sign = "-";
		 }
	}
	
	@Override
	public String toString() {
		return sign + person.getName() + tag.tagName;
	}

}
