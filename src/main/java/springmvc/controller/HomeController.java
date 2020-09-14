package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	
	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("Home url");
		model.addAttribute("name", "Karun Ahuja");
		model.addAttribute("id","50215");
		
		List<String> friends=new ArrayList<String>();
		friends.add("Karun");
		friends.add("Ahuja");
		friends.add("Abc");
		model.addAttribute("f", friends);
		
		return "index";
		
	}
	
	
	 
	
	@RequestMapping("/about")
	public String about() {
		System.out.println("About url");
		return "about";
		
	}
	
	
	
	

}
