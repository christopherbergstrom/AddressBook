package addressBook;

import java.util.HashMap;

public class Book
{
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
	public void add(Person p)
	{
		
	}
	public void update()
	{
		
	}
	public void delete()
	{
		
	}
}
