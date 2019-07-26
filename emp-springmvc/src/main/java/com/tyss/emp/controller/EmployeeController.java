package com.tyss.emp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/emp")
public class EmployeeController {

	@RequestMapping(path = "/getmsg", method = RequestMethod.GET)
	public ModelAndView getMessage() {
		ModelAndView m= new ModelAndView();
		//m.setViewName("/WEB-INF/view/messagePage.jsp");
		m.setViewName("messagePage");
		return m;
	}
	
	@GetMapping("/seemsg")
	public ModelAndView getMessage(ModelAndView modelAndView) {
		//modelAndView.setViewName("/WEB-INF/view/messagePage.jsp");
		modelAndView.setViewName("messagePage");
		return modelAndView;
		
	}
	
	
}
