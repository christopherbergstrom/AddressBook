package addressBook;

public class Person
{
	private String firstname, lastname, company, email, address, birthday, phone;
	public Person()
	{
		this.firstname = "";
		this.lastname = "";
		this.company = "";
		this.email = "";
		this.address = "";
		this.birthday = "";
		this.phone = "";
	}
	public Person(String firstname, String lastname, String company, String email, String address, String birthday, String phone)
	{
		this.firstname = firstname;
		this.lastname = lastname;
		this.company = company;
		this.email = email;
		this.address = address;
		this.birthday = birthday;
		this.phone = phone;
	}
	public String getFirstname()
	{
		return firstname;
	}
	public void setFirstname(String firstname)
	{
		this.firstname = firstname;
	}
	public String getLastname()
	{
		return lastname;
	}
	public void setLastname(String lastname)
	{
		this.lastname = lastname;
	}
	public String getCompany()
	{
		return company;
	}
	public void setCompany(String company)
	{
		this.company = company;
	}
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	public String getAddress()
	{
		return address;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}
	public String getBirthday()
	{
		return birthday;
	}
	public void setBirthday(String birthday)
	{
		this.birthday = birthday;
	}
	public String getPhone()
	{
		return phone;
	}
	public void setPhone(String phone)
	{
		this.phone = phone;
	}
	@Override
	public String toString()
	{
		return "Person [firstname=" + firstname + ", lastname=" + lastname + ", company=" + company + ", email=" + email
				+ ", address=" + address + ", birthday=" + birthday + ", phone=" + phone + "]";
	}
}
