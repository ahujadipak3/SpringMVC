package com.dipak.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestAppController {

	
	@RequestMapping(value="/rest", method=RequestMethod.GET)
	public String getSampleOutput() {
		return "in Rest";
	}
	
	
	
}
