package com.titanic.bean;

public class TestMysqlBean
{

	private String name;
	private String email;
	private String address;
	private String back;

	public TestMysqlBean()
	{
	}

	public TestMysqlBean(String name, String email, String address, String back)
	{
		super();
		this.name = name;
		this.email = email;
		this.address = address;
		this.back = back;
	}

	@Override
	public String toString()
	{
		return "TestMysqlBean [name=" + name + ", email=" + email
				+ ", address=" + address + ", back=" + back + "]";
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
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

	public String getBack()
	{
		return back;
	}

	public void setBack(String back)
	{
		this.back = back;
	}

}
