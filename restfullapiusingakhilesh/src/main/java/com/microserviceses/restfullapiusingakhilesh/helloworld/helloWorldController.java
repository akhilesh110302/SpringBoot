package com.microserviceses.restfullapiusingakhilesh.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloWorldController {

	@GetMapping(path="/hello-world")
	public String printer()
	{
		return "Hello World";
	}
}
