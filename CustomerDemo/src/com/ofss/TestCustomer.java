package com.ofss;

public class TestCustomer {
	public static void main(String[] args) {
		Address addr1 = new Address(501, "Kalyani Nagar", "Warangal");
		Customer cust1 = new Customer("Mr. Sharan","9666026090",addr1);
		
		System.out.println(cust1);

	}
	
}
