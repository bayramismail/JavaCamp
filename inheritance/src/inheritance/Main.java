package inheritance;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IndividualCustomer iniIndividualCustomer = new IndividualCustomer();
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		CustomerManager customerManager = new CustomerManager();
		iniIndividualCustomer.setCustomerNumber("123585");
		corporateCustomer.setCustomerNumber("8558855");
		Customer customers[] = new Customer[] { iniIndividualCustomer, corporateCustomer };
//		customerManager.add(iniIndividualCustomer);
//		customerManager.add(corporateCustomer);
		customerManager.addMultiple(customers);
	}

}