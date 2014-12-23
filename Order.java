/* 
     Name:  Sean Staz
     Email:  ststasny@go.olemiss.edu
     Current Date:  6/28/13
     Sources Consulted: None. 
     
     Honor Code Statement: In keeping with the honor code policies of the University of Mississippi, the School of Engineering, and the Department of Computer and Information Science, I affirm that I have neither given nor received assistance on this programming assignment. This assignment represents my individual, original effort. 
                    ... My Signature is on File. 
*/ 
public class Order 
{	
	int pCount = 0;
	Purchase[] purchase = new Purchase[5];
	Customer cust;
	String date;
			
	public Order()
	{
		date = "";
	}
	
	public Order(String d, String n, String cc)
	{
		date = d;
		cust = new Customer(n,cc);
	}
		
	public String getOrder()
	{
		return date;
	}
	
	public void addPurchase(String pd, double a)
	{
		purchase[pCount] =  new Purchase(pd, a);
		pCount++;
	}
	
	public void changeCustomer(String n)
	{
		cust.setName(n);
	}
	
	public void changePurchase(double a)
	{
		purchase[1].setAmount(a);
	}
	
	public void printOrder()
	{
		System.out.println("The date of the order is: " + date );
		System.out.println(cust);
			
		for(int i = 0; i < purchase.length; i++ )
		{
			System.out.println(purchase[i]);
		}
	}
	
	public void totalPrint()
	{
		double total = 0.0;
		
		for (int i = 0; i < purchase.length; i++)
		{
			total += purchase[i].getAmount();
		}
		
		System.out.println("The total is: " + total);
		System.out.println("");
	}
}
