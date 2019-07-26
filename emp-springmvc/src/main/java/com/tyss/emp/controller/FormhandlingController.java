package com.tyss.emp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tyss.emp.dto.UserBean;

@Controller
@RequestMapping("/form")
public class FormhandlingController {
	@GetMapping("/getform")
	public String getForm() {
		
		return "myForm";
	}
	
	@PostMapping("/formsubmit")
	public String submitForm(HttpServletRequest req) {
		String email=req.getParameter("email");
		String pass=req.getParameter("password");
		req.setAttribute("email", email);
		req.setAttribute("password", pass);
		 
		return "displayFormdata";
		
	}
	
	@PostMapping("/formsubmit2")
	public String submitForm2(String email,String password,ModelMap map) {
		map.addAttribute("email", email);
		map.addAttribute("password", password);
		return "displayFormdata";
		
	}
	
	@PostMapping("/formsubmit3")
	public String submitForm3(UserBean userBean,ModelMap modelMap) {
		modelMap.addAttribute("userBean", userBean);
		return "displayFormdata";
		
	}
	
	@PostMapping("/formsubmit4")
	public String submitForm4(@RequestParam(name="email") 
	String anyname,@RequestParam(name="password")String anypassword,ModelMap map) {
		map.addAttribute("email", anyname);
		map.addAttribute("password", anypassword);
		return "displayFormdata";
		
	}
	
	@PostMapping("/formsubmit5")
	public String submitForm5(UserBean userBean,ModelMap modelMap) {
		modelMap.addAttribute("userBean", userBean);
		return "displayFormdata";
		
	}
	
	
}
