package inheritance;

public class CustomerManager {
	// polymorphism
		public void add(Customer customer) {
			System.out.println(customer.getCustomerNumber() + " has been added.");
		}
		
		// bulk insert
		public void addMultiple(Customer[] customers) {
			
			for(Customer customer: customers) {
				add(customer); // The add method over top
			}
		}
}
