package junior.spring.mvc.web;

import java.util.Map;

import junior.spring.mvc.domain.Customer;
import junior.spring.mvc.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("/customers")
	public String listCustomer(Map<String, Object> map) {
		
		map.put("customer", new Customer());
		map.put("customerList", customerService.listCustomer());
		
		return "customer";
	}
	
	@RequestMapping("/customers/{Id}")
	public String detailCustomer(@PathVariable("Id") Integer Id, Model model) {
		
		String msg = "Customer number " + Id;
		model.addAttribute("msg", msg);
		model.addAttribute("number", Id);
		model.addAttribute("customer", customerService.customerById(Id));
		
		return "customerid";
	}
	
	/*@RequestMapping("/")
	public String home() {
		return "redirect:/index";
	}*/
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addCustomer(@ModelAttribute("customer") Customer customer, BindingResult result) {
		
		customerService.addCustomer(customer);
		
		return "redirect:/index";
	}
	
	@RequestMapping("/delete/{customerId}")
	public String deleteContact(@PathVariable("customerId") Integer customerId) {
		 customerService.removeCustomer(customerId);
		 
		 return "redirect:/index";
	}
}
