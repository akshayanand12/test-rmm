package com.akshay.testrmm.helloworld;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@Autowired
	private MessageSource messageSource;
	
//	@RequestMapping(method = RequestMethod.GET, path = "/hello-world")
//	public String HelloWorld(@RequestHeader(name="Accept-Language", required = false) Locale locale) {
//		return messageSource.getMessage("good.morning.message", null, locale);
//	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/hello-world")
	public String HelloWorld() {
		return messageSource.getMessage("good.morning.message", null,
				LocaleContextHolder.getLocale());
	}

	@RequestMapping(method = RequestMethod.GET, path = "/hello-world-bean/path-variable/{name}")
	public HelloWorldBean HelloWorldBean(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello world, %s", name));
	}
}