package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;

@Controller
public class ContactController {
	@Autowired
	private springmvc.service.UserService userService;
	
	
	@ModelAttribute
	public void commonDataForModel(Model model) {
		
		model.addAttribute("Header", "Registration Form");
		model.addAttribute("Desc","Home for program");
		
	}
	
	
	
	@RequestMapping("/contact")
	public String showForm() {
		return "contact";
	}
	
	
	@RequestMapping(path="/processform",method=RequestMethod.POST)
	public String handleForm(@ModelAttribute User user,Model model
			) {

	
		System.out.println(user);
		
		
		if(user.getUserName().isBlank()) {
			return "redirect:/contact";
		}
		
		
		int createdUser=this.userService.createUser(user);
		
		
		model.addAttribute("msg", "User created with id"+ createdUser);
		
		model.addAttribute("user",user);
		

	    return "success";
	}
	
}
