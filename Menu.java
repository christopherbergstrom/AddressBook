package addressBook;

import java.util.Scanner;

public class Menu
{
	Scanner input = new Scanner(System.in);
	Book book = new Book();
	public void menu()
	{
		String choice;
		while(true)
		{
			// Create Read Update Delete
			System.out.println("(1) Show all contacts\n(2) Add new contact\n(3) Update a contact\n(4) Delete a contact");
			choice = input.next();
			if (choice.equals("1"))
			{
				book.read();
			}
			else if (choice.equals("2"))
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
				book.add(p);
			}
			else if (choice.equals("3"))
			{
				book.update();
			}
			else if (choice.equals("4"))
			{
				book.delete();
			}
			else
			{
				System.out.println("* * * * * * * * * * *");
				System.out.println("Choose a valid choice");
				System.out.println("* * * * * * * * * * *\n");
			}
		}
	}
}
