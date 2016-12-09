package com.nisum.test.controller;

import java.security.Principal;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.nisum.test.*"})
public class HomeController {
	
@RequestMapping(value = "/", method = RequestMethod.GET)
public String getHomePage(){
	
	return "home";
}

@RequestMapping(value= "/user", method = RequestMethod.GET)
public Principal user(Principal principal) {
	/*System.out.println(principal.getName());
	System.out.println(principal.getClass());*/
  return principal;
}

@RequestMapping(value = "/hello", method = RequestMethod.GET)
public String getHelloPage(){
	
	return "hello";
}

@RequestMapping(value = "/login", method = RequestMethod.GET)
public String getLoginPage(){
	
	return "login";
}

}
