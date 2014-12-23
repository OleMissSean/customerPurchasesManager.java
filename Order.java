/* 
     Name:  Sean Staz
     Email:  ststasny@go.olemiss.edu
     Current Date:  6/28/13
     Sources Consulted: None. 
     
     Honor Code Statement: In keeping with the honor code policies of the University of Mississippi, the School of Engineering, and the Department of Computer and Information Science, I affirm that I have neither given nor received assistance on this programming assignment. This assignment represents my individual, original effort. 
                    ... My Signature is on File. 
*/ 


import java.util.ArrayList;

public class Driver 
{
	public static void main (String[] args)
	{	
		ArrayList<Order> order = new ArrayList<Order>();
			
		Order order1 = new Order("07/04/13", "Sean Stasny", "1234-5678-9123-4567");
			order.add(order1);
				order1.addPurchase("Flawless Motherboard", 119.99);
				order1.addPurchase("Storm CPU", 129.99);
				order1.addPurchase("Scream Video Card", 239.99);
				order1.addPurchase("Master Cooler Case", 99.99);
				order1.addPurchase("Ripped RAM", 49.99);
				order1.printOrder();
				order1.changeCustomer("Tom DeLonge");
				order1.totalPrint();
				
			
		Order order2 = new Order("07/05/13", "Kurt Cobain", "2545-6565-8585-2525");
			order.add(order2);
				order2.addPurchase("Claw Motherboard", 139.99);
				order2.addPurchase("Serious CPU", 119.99);
				order2.addPurchase("EVEA Video Card", 269.99);
				order2.addPurchase("Power Case", 79.99);
				order2.addPurchase("Cosair RAM", 59.99);
				order2.printOrder();
				order2.totalPrint();
			
		Order order3 = new Order("07/04/13", "Dave Grohl", "1478-5475-9565-3214");
			order.add(order3);
				order3.addPurchase("Slam Motherboard", 159.99);
				order3.addPurchase("Riot CPU", 109.99);
				order3.addPurchase("Light Video Card", 219.99);
				order3.addPurchase("Chasis Case", 89.99);
				order3.addPurchase("Independent RAM", 29.99);
				order3.printOrder();
				order3.changePurchase(52.99);
				order3.totalPrint();
			
		Order order4 = new Order("07/04/13", "Mark Hoppis", "1234-5252-3636-9696");
			order.add(order4);
				order4.addPurchase("Raven Motherboard", 129.99);
				order4.addPurchase("Saber CPU", 139.99);
				order4.addPurchase("Swift Video Card", 229.99);
				order4.addPurchase("Future Case", 69.99);
				order4.addPurchase("Patriot RAM", 39.99);
				order4.printOrder();
				order4.totalPrint();
			
		Order order5 = new Order("07/04/13", "Krist Novelselic", "1515-2626-4848-5959");
			order.add(order5);	
				order5.addPurchase("Motherboard", 189.99);
				order5.addPurchase("CPU", 165.99);
				order5.addPurchase("Video Card", 235.99);
				order5.addPurchase("Case", 68.99);
				order5.addPurchase("RAM", 35.99);
				order5.printOrder();
				order5.changeCustomer("Travis Barker");
				order1.totalPrint();
		
		System.out.println("!!!!!!!MODIFIED CODE!!!!!!!");
		System.out.println("");
		order1.printOrder();
		order1.totalPrint();
		order3.printOrder();
		order3.totalPrint();
		order5.printOrder();
		order5.totalPrint();
	}
}
