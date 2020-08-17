package com.dipak.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebMvc
@Configuration
public class TestConfig implements WebMvcConfigurer {

/*	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName(" ");
   }
	*/
	
	 /*@Override
	  public void addViewControllers(ViewControllerRegistry registry) {
	      //this will map uri to jsp view directly without a controller
	      registry.addViewController("/hi")
	              .setViewName("hello");
	  }*/
}