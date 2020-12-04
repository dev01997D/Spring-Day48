package com.example.demo.greeting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Greeting;
import com.example.demo.model.User;
import com.example.demo.service.IGreetingService;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
	@Autowired
	private IGreetingService greetingService;

	@GetMapping(value = { "", "/", "/home" })
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World!") String name) {
		User user = new User();
		user.setFirstName(name);
		return greetingService.addGreeting(user);
	}
}
