package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

	@RequestMapping("/showForm")
	public String showForm() {
		return "hello-world";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
	 return "helloworld";	
	}
	
	@RequestMapping("/processFormtwo")
	public String modelDemo(HttpServletRequest request,Model model) {
		String theName=request.getParameter("studentName");
		theName=theName.toUpperCase();
		model.addAttribute("message", theName);
		return "helloworld";
	}
	
	
	@RequestMapping("/processFormTwo")
	public String modelDemo(@RequestParam("studentName") String theName,Model model) {
		//String theName=request.getParameter("studentName");
		theName=theName.toUpperCase();
		model.addAttribute("message", theName);
		return "helloworld";
	}
	
	
}
