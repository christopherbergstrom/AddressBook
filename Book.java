package addressBook;

import java.util.HashMap;
import java.util.Scanner;

public class Book
{
	Scanner input = new Scanner(System.in);
	HashMap<Integer, Person> book = new HashMap<Integer, Person>();
	public Book()
	{
		
		Person p1 = new Person("Behind", "You", "Nowhere Inc", "me@myself.com", "123 Nowhere St", "01/11/10", "123-123-1234");
		book.put(1, p1);
	}
	public void read()
	{
		int i = 1;
		System.out.println("First name, Last name, Company, Phone, Email, Address, Birthday\n");
		for(int s : book.keySet())
		{
			System.out.println(i+" "+book.get(s));
			i ++;
		}
		System.out.println();
	}
	public void add()
	{
		System.out.println("Enter new contact's info:");
		System.out.print("First name: ");
		String firstname = input.next();
		System.out.print("Last name: ");
		String lastname = input.next();
		System.out.print("Company: ");
		String company = input.next();
		System.out.print("Phone: ");
		String phone = input.next();
		System.out.print("Email: ");
		String email = input.next();
		System.out.print("Address: ");
		String address = input.next();
		System.out.print("Birthday: ");
		String birthday = input.next();
		Person p = new Person(firstname, lastname, company, phone, email, address, birthday);
		book.put(book.size()+1, p);
	}
	public void update()
	{
		
	}
	public void delete()
	{
		
	}
}
