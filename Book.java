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
		for(int key : book.keySet())
		{
			System.out.println("#"+key+" "+book.get(key));
			i ++;
		}
		System.out.println();
	}
	public void add()
	{
		System.out.println("Enter new contact's info:");
		System.out.print("First name: ");
		String firstName = input.next();
		System.out.print("Last name: ");
		String lastName = input.next();
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
		Person p = new Person(firstName, lastName, company, phone, email, address, birthday);
		book.put(book.size()+1, p);
		System.out.println();
	}
	public void update()
	{
		Integer num = null;
		while (num == null)
		{
			
			System.out.println("Enter number of contact to update");
			System.out.print("Number: ");
			String number = input.next();
			try
			{				
				num = Integer.valueOf(number);
				if (book.containsKey(num))
				{
					String choice;
					while(true)
					{
						System.out.println("\nWhat do you want to update?\n(1) First name\n(2) Last name\n(3) Company\n(4) Phone\n(5) Email\n(6) Address\n(7) Birthday\n(8) Back");
						choice = input.next();
						if (choice.equals("1"))
						{
							System.out.print("Enter new first name:");
							String firstName = input.next();
							Person p = book.get(num);
							p.setFirstname(firstName);
							book.put(num, p);
						}
						else if (choice.equals("2"))
						{
							System.out.print("Enter new last name:");
							String lastName = input.next();
							Person p = book.get(num);
							p.setLastname(lastName);
							book.put(num, p);
						}
						else if (choice.equals("3"))
						{
							System.out.print("Enter new company:");
							String company = input.next();
							Person p = book.get(num);
							p.setCompany(company);
							book.put(num, p);
						}
						else if (choice.equals("4"))
						{
							System.out.print("Enter new phone:");
							String phone = input.next();
							Person p = book.get(num);
							p.setPhone(phone);
							book.put(num, p);
						}
						else if (choice.equals("5"))
						{
							System.out.print("Enter new email:");
							String email = input.next();
							Person p = book.get(num);
							p.setEmail(email);
							book.put(num, p);
						}
						else if (choice.equals("6"))
						{
							System.out.print("Enter new address:");
							String address = input.next();
							Person p = book.get(num);
							p.setAddress(address);
							book.put(num, p);
						}
						else if (choice.equals("7"))
						{
							System.out.print("Enter new birthday:");
							String birthday = input.next();
							Person p = book.get(num);
							p.setBirthday(birthday);
							book.put(num, p);
						}
						else if (choice.equals("8"))
						{
							break;
						}
						else
						{
							System.out.println("* * * * * * * * * * *");
							System.out.println("Choose a valid choice");
							System.out.println("* * * * * * * * * * *\n");
						}
					}
				}
				else
					System.out.println("Enter a valid contact's number\n");
			}
			catch (Exception e)
			{
				System.out.println("You didn't enter a number\n");				
			}
		}
	}
	public void delete()
	{
		Integer num = null;
		while (num == null)
		{
			
			System.out.println("Enter number of contact to delete");
			System.out.print("Number: ");
			String number = input.next();
			try
			{				
				num = Integer.valueOf(number);
				if (book.containsKey(num))
				{					
					book.remove(num);
					System.out.println("Contact number "+num+" removed\n");
				}
				else
					System.out.println("Enter a valid contact's number\n");
			}
			catch (Exception e)
			{
				System.out.println("You didn't enter a number\n");				
			}
		}
	}
}
