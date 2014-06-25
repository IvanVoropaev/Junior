package junior.spring.mvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping("/index")
	public String showIndexPage(Model model) {
		
		String hello = "Hello! Push the button.";
		model.addAttribute("hello", hello);
		
		return "index";
	}
	
	@RequestMapping("/")
	public String index() {
		return "redirect:/index";
	}
	

}
