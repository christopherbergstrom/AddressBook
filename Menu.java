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
				book.add();
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
