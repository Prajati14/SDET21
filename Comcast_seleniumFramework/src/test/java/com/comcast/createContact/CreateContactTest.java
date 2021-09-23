package com.comcast.createContact;

import org.testng.annotations.Test;

public class CreateContactTest {
	
	@Test(groups = "Smoke")
	public void createContact() {
		System.out.println("executing create contact");
	}
	@Test(groups = "Regression")
	public void createContactWithOrg() {
		System.out.println("executing create Contact With Org ");
	}
	
	@Test(groups="Regression")
	public void deleteContact() {
		System.out.println("execute delete contact");
	}

}
