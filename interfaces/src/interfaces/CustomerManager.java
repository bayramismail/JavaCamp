package interfaces;

public class CustomerManager {
	private Logger[] loggers;

	public CustomerManager(Logger[] logger) {
		super();
		this.loggers = logger;
	}

	// loosly - tightly coupled
	public void add(Customer customer) {
		System.out.println("Customer added " + customer.getFirstName());
		// this.logger.log(customer.getFirstName());
		Utils.runLoggers(loggers, customer.getFirstName());
	}

	public void delete(Customer customer) {
		System.out.println("Customer deleted");
		Utils.runLoggers(loggers, customer.getFirstName());
	}

}
