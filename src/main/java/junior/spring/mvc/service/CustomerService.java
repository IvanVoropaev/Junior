package junior.spring.mvc.service;

import java.util.List;

import junior.spring.mvc.domain.Customer;

public interface CustomerService {
	
	public void addCustomer(Customer customer);
	
	public List<Customer> listCustomer();
	
	public void removeCustomer(Integer id);

}
