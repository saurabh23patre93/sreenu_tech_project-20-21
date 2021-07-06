/**
 * HelloWorldController.java Jun 30, 2021
 * 20_spring_boot_i18n
 */
package com.st.spring.boot.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author asus
 *
 */
@RestController
public class HelloWorldController {

	private MessageSource messageSource;

	@Autowired
	public HelloWorldController(MessageSource messageSource) {
		this.messageSource = messageSource;
	}
	
	@RequestMapping(value = "/hello",method = RequestMethod.GET)
	public String hello(Locale locale) {
		return this.messageSource.getMessage("hello.world",new Object[3], locale);
	}
}
