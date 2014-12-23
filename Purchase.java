/* 
     Name:  Sean Staz
     Email:  ststasny@go.olemiss.edu
     Current Date:  6/28/13
     Sources Consulted: None. 
     
     Honor Code Statement: In keeping with the honor code policies of the University of Mississippi, the School of Engineering, and the Department of Computer and Information Science, I affirm that I have neither given nor received assistance on this programming assignment. This assignment represents my individual, original effort. 
                    ... My Signature is on File. 
*/ 

public class Purchase 
{
	String productDiscription;
	double amount;
	
	public Purchase()
	{
		productDiscription = "";
		amount = 0.0;
	}
	
	public Purchase(String pd, double a)
	{
		setProductDiscription(pd);
		setAmount(a);
	}
	
	public void setProductDiscription(String pd)
	{
		productDiscription = pd;
	}
	
	public void setAmount(double a)
	{
		amount = a;
	}
	
	public String getProductDiscription()
	{
		return productDiscription;
	}
	
	public double getAmount()
	{
		return amount;
	}
	
	public String toString()
	{
		String str = "[Product Discription " + productDiscription + "]" + " [Amount: " + amount + "]";	
		
		return str;
	}
}
