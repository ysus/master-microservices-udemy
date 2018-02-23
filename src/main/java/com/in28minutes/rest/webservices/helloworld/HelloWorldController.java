package com.in28minutes.rest.webservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping(path="/hellow-world")
	public String helloWorld() {
		return "HW";
	}
	
	@GetMapping(path="/hellow-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("HWB");
	}
	
	@GetMapping(path="/hellow-world-bean/path-variable/{name}")
	public HelloWorldBean helloWorldBeanPathVariable( @PathVariable String name) {
		return new HelloWorldBean(String.format("HW %s", name));
	}

}
