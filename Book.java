package addressBook;

import java.util.HashMap;

public class Book
{
	HashMap<String, Person> book = new HashMap<String, Person>();
	public void createDefault()
	{
		
		Person p1 = new Person("Behind", "You", "Nowhere Inc.", "me@myself.com", "123 Nowhere St,", "01/11/10", "123-123-1234");
		book.put("default", p1);
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
