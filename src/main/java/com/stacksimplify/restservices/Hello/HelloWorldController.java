package com.stacksimplify.restservices.Hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	// Below Example with @RequestMapping
	@RequestMapping(method = RequestMethod.GET, path="/helloWorld")
	public String HelloWorld() {
		return "Hello World";
	}
	
	@GetMapping("/helloWorld1")
	public String HelloWorld1() {
		return "HelloWorld1";
	}
	
	@GetMapping("/userDetailsBean")
	public UserDetails userDetailsBean() {
		return new UserDetails("Natarajan", "Swaminathan", "Chennai");
	}
}
