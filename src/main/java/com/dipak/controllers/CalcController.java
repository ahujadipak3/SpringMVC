package com.dipak.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class CalcController {

	@Value(value = "${username}")
	private String userName;
	
	@Value(value = "${password}")
	private String password;
	
	@RequestMapping(value="/calc", method=RequestMethod.GET)
	public ModelAndView getCalcDetail(@RequestParam int num1, @RequestParam int num2) {
		System.out.println("In calc method..");
		
		System.out.println("username and password are "+ userName + password);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display");
		mv.addObject("count", num1 +num2 );
		System.out.println(num1 +num2 );
		return mv;
	}
}
