package junior.spring.mvc.dao;

import java.util.List;

import junior.spring.mvc.domain.Customer;

public interface CustomerDAO {
	
	public void addCustomer(Customer customer);
	
	public List<Customer> listCustomer();
	
	public Customer customerById(Integer id);
	
	public void removeCustomer(Integer id);

}
