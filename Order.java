/* 
     Name:  Sean Staz
     Email:  ststasny@go.olemiss.edu
     Current Date:  6/28/13
     Sources Consulted: None. 
     
     Honor Code Statement: In keeping with the honor code policies of the University of Mississippi, the School of Engineering, and the Department of Computer and Information Science, I affirm that I have neither given nor received assistance on this programming assignment. This assignment represents my individual, original effort. 
                    ... My Signature is on File. 
*/ 

public class Customer 
{
	String name;
	String creditCard;
	
	public Customer()
	{
		name = "";
		creditCard = "";
	}
	
	public Customer (String n, String cc)
	{
		setName(n);
		setCC(cc);
	}
	
	public void setName(String n)
	{
		name = n;
	}
	
	public void setCC(String cc)
	{
		creditCard = cc;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getCC()
	{
		return creditCard;
	}
	
	public String toString()
	{
		String str = "[Name: " + name + "]" + " [Credit Card Number: " + creditCard + "]";	
		
		return str;
	}
}
