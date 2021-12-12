import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
    System.out.println("Welcome to the parking calculator app!");
    
    Customer c1 = new Customer("David", "SK-0433-NA", 4);
    
    
    Customer c2 = new Customer("Filip", "SK-0233-NA", 7);
    
    
    Customer c3 = new Customer("Stole", "NE-0633-NA", 5);
    
    
    Customer c4 = new Customer("Marija", "SK-0553-NA", 9);
    
    System.out.println(c1);
    
    System.out.println(c2);

    System.out.println(c3);

    System.out.println(c4);
    
    List<Customer> customers = new ArrayList();
    customers.add(c1);
    customers.add(c2);
    customers.add(c3);
    customers.add(c4);
    
    double price = 0.00;
    
    for(Customer customer : customers ) {
    	
    	price += customer.calculatePrice();
    	
    }
    
    System.out.println("Total price for the parking garage for each customer is: "+ price);

    
    
    
    
    
    
	}

}
