package junior.spring.mvc.service;

import java.util.List;

import junior.spring.mvc.dao.CustomerDAO;
import junior.spring.mvc.domain.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerDAO customerDAO;

	@Override
	@Transactional
	public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerDAO.addCustomer(customer);
	}
	
	@Override
	@Transactional
	public Customer customerById(Integer id) {
		return customerDAO.customerById(id);
	}

	@Override
	@Transactional
	public List<Customer> listCustomer() {
		// TODO Auto-generated method stub
		return customerDAO.listCustomer();
	}

	@Override
	@Transactional
	public void removeCustomer(Integer id) {
		// TODO Auto-generated method stub
		customerDAO.removeCustomer(id);
	}

}
