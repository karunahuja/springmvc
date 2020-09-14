package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SearchController {
	
	
	@RequestMapping("/homer")
	public String homer() {
		
		
		
		return "homer";
	}

	
	@RequestMapping("/search")
	public String redirect(@RequestParam("querybox") String query) {
		
		
		System.out.println(query);
		String url="https://www.google.com/search?q="+query;
		String x="redirect:"+url;
		
		return x;
	}

	
}
