package com.arabsoft.sip.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	//@ResponseBody // sans vue 
	public String HomController() {
	 
		//return "<h1>Spring</h1>";
		return "home";
	}
	@RequestMapping("/liste")
	//@ResponseBody // sans vue 
	public String ListCondidat() {
	 
		//return "<h1>Spring</h1>";
		return "liste_condidat";
	}

}
