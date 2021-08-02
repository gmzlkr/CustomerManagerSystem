import business.concretes.CustomerManager;
import entities.concretes.Customer;
import logger.Logger;
import logger.DatabaseLogger;
import logger.FileLogger;
import logger.SmsLogger;


public class Main {

	public static void main(String[] args) {
		
		Customer customer = new Customer(5,"GAMZE ULKER",36);
		CustomerManager customerManager = new CustomerManager(new FileLogger());
		customerManager.Add(customer);
		customerManager.Remove(customer);
		System.out.println("----------------------------------");
		
				
		Customer[] customers = new Customer[3];
		Customer customers1 = new Customer(1,"Elon Musk",812); 
		Customer customers2 = new Customer(2,"SpaceX",4565);
		Customer customers3 = new Customer(3,"Amazon",7854);
		customers[0]=customers1;
		customers[1]=customers2; 
		customers[2]=customers3; 
		
		customerManager.MultiAdd(customers);

	}

}