package com.contacts.mypackages;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class Contact {
	
	private String name;
	private Set<String> emails = new HashSet<String>();
	private Set<String> phones = new HashSet<String>();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<String> getEmails() {
		return emails;
	}
	public void setEmails(Set<String> emails) {
		this.emails = emails;
	}
	public Set<String> getPhones() {
		return phones;
	}
	public void setPhones(Set<String> phones) {
		this.phones = phones;
	}
	
	public Contact(String name) {
		this.name = name;
	}
	
	public Contact(String name, String email) {
		this.name = name;
		if(!email.isEmpty())
		{
			emails.add(email);
		}
	}
	
	public Contact(String name, long phone) 
	{
		this.name = name;
		String phoneNo = formatterPhone(phone);
		phones.add(phoneNo);
	}
		
	public Contact(String name, String email, long phone) {
		this.name = name;
		if(!email.isEmpty())
		{
			emails.add(email);
		}
		String phoneNo = formatterPhone(phone);
		phones.add(phoneNo);
	}
	
	public String formatterPhone(long phoneNo)
	{
		String phoneNumberStr = "";
		if(phoneNo != 0 && String.valueOf(phoneNo).length() < 11)
		{
		   phoneNumberStr = String.valueOf(phoneNo);
		}
	    return "(" + phoneNumberStr.substring(0, 3) + ")-" + phoneNumberStr.substring(3, 6) + "-" + phoneNumberStr.substring(6);	    
	}
	
	public void showData()
	{
		Iterator<String> value = phones.iterator(); 
		  
        System.out.println("The iterator values are: "); 
        while (value.hasNext()) { 
            System.out.println("values : " + value.next()); 
        }
	}
	
	public Contact mergeContactData(Contact contact)
	{
		
	}
}
