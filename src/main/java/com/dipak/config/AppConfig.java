package com.dipak.config;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
/*
 * @Autowired, @Qualifier, @Resource, @PostConstruct, @Predestroy 
 * <ctx:annotation-config /> works on annotation tags
 */
@EnableWebMvc 
/*
 * @Component, @Repository, @Controller, @Bean, @Service
 *<ctx:component-scan /> works on Component, Repository,
 */
@ComponentScan(basePackages = "com.dipak.controllers") // 

@PropertySource("classpath:mvc.properties")

public class AppConfig implements WebMvcConfigurer {

	@Bean
	public InternalResourceViewResolver interalResolver() {
		InternalResourceViewResolver ir = new InternalResourceViewResolver();
		ir.setSuffix(".jsp");
		ir.setPrefix("WEB-INF/jsp/");
		return ir;
	}

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/test").setViewName("default");
	}
	
	/*@Bean
	public  PropertyPlaceholderConfigurer propertyPlaceHolder() {
		
	}*/
}

/*mvc:annotation-driven
mvc:annotation-driven is used for enabling the Spring MVC components with its default configurations. If you dont include mvc:annotation-driven also your MVC application would work if you have used the context:component-scan for creating the beans or defined the beans in your XML file. But, mvc:annotation-driven does some extra job on configuring the special beans that would not have been configured if you are not using this element in your XML file.

This tag would registers the HandlerMapping and HandlerAdapter required to dispatch requests to your @Controllers. In addition, it also applies some defaults based on what is present in your classpath. Such defaults are:

Using the Spring 3 Type ConversionService as a simpler and more robust alternative to JavaBeans PropertyEditors
Support for formatting Number fields with @NumberFormat
Support for formatting Date, Calendar, and Joda Time fields with @DateTimeFormat, if Joda Time is on the classpath
Support for validating @Controller inputs with @Valid, if a JSR-303 Provider is on the classpath
Support for reading and writing XML, if JAXB is on the classpath
Support for reading and writing JSON, if Jackson is on the classpath*/
