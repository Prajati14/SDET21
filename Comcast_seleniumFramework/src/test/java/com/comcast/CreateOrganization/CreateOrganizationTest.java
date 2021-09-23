package com.comcast.CreateOrganization;

import org.testng.annotations.Test;

public class CreateOrganizationTest {
	
	@Test(groups ="Smoke")
	
	public void createOrgTest() {
		System.out.println("execute createOrgTest");
	}
	
	
	@Test(groups="Regression")
	public void createOrgWithContact() {
		System.out.println("execute createOrgWithContact");
	}
	@Test(groups="Regression")
	public void createOrgFromLead() {
		System.out.println("execute createOrgFromLead");
	}
	@Test(groups="Regression")
	public void createnewOrgFromLead() {
		System.out.println("execute createnewOrgFromLead");
	}
	
	

}
