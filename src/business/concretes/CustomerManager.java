package business.concretes;

import entities.concretes.Customer;
import logger.Logger;

public class CustomerManager extends Customer {
	
	private Logger logger;
	
	public CustomerManager(Logger logger) {
		this.logger=logger;
	}

	public void Add(Customer customer) {
		System.out.println(" Customer added. \n Customer : " +customer.getNameSurname());
		this.logger.log("");
	}
	
	public void MultiAdd1(Customer[] customers) {
		
	}
	
	public void MultiAdd(Customer[] customers) {
		
		System.out.println("Multiple Logger :");
	
		for(Customer c:customers) {
			System.out.println(" Customers added.  Customers : " +c.getNameSurname());
			MultiAdd1(customers);
			logger.log("");
		}
	}
	
	public void Remove(Customer customer) {
		System.out.println(" Customer removed. \n Customer : " +customer.getCustomerNo());
		this.logger.log("");
	     }
	}
