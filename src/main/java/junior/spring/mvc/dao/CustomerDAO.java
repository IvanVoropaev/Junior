package junior.spring.mvc.dao;

import java.util.List;

import junior.spring.mvc.domain.Customer;

public interface CustomerDAO {
	
	public void addCutomer(Customer customer);
	
	public List<Customer> listCustomer();
	
	public void removeCustomer(Integer id);

}
