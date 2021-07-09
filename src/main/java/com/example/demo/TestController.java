package com.example.demo;
  
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	
	@RequestMapping("/get/{name}")
	public String showData(@PathVariable("name") String name)
	{
		return "Hi "+name +"welcome" + "dev";
	}
}
