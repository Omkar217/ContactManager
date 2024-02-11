package com.contacts.mypackages;
class Main
{
	public static void main(String args[])
	{
		Contact contact1 = new Contact("omkar","xyz@123.com", 1234567896);
		Contact contact2 = new Contact("rohit","jkl@567.com", 9998887777L);
		Contact contact3 = new Contact("pratik","helper@123.com",3890654332L);

		contact1.showData();
		contact2.showData();
		contact3.showData();
	}
}
