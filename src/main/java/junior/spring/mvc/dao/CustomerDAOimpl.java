package junior.spring.mvc.dao;

import java.util.List;

import junior.spring.mvc.domain.Customer;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDAOimpl implements CustomerDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(customer);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Customer> listCustomer() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from Customer").list();
	}
	
	@Override
	public Customer customerById(Integer id) {
		return (Customer) sessionFactory.getCurrentSession()
				                        .createQuery("from Customer customer where customer.id = :id")
										.setInteger("id", id)
										.uniqueResult();
	}

	@Override
	public void removeCustomer(Integer id) {
		// TODO Auto-generated method stub
		Customer customer = (Customer) sessionFactory.getCurrentSession().load(Customer.class, id);
		if (null != customer) {
			sessionFactory.getCurrentSession().delete(customer);
		}
	}

}
