package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerOperationsController {
	
	/*@RequestMapping("/home")
	public  String   showHome() {
		System.out.println("CustomerOperationsController.showHome()");
		//return  LVN
		return "welcome";
	}*/
	
	//@RequestMapping({"/home","/"})
	@RequestMapping("/")
	//@RequestMapping("/home")
	public  String   showHome() {
		System.out.println("CustomerOperationsController.showHome()");
		//return  LVN
		return "welcome";
	}

}
