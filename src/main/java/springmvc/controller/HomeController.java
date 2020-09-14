package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	
	@RequestMapping(path="/home",method=RequestMethod.GET)
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
	
	
	
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("Help url");
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("name","Karun");
		modelAndView.addObject("rollnumber","5025");
		modelAndView.setViewName("help");
		
		//marks
		List<Integer> list=new ArrayList<Integer>();
		list.add(11);
		list.add(12);
		list.add(13);
		modelAndView.addObject("marks", list);
		
		
		return modelAndView;
		
	}
	
	
	
	

}
