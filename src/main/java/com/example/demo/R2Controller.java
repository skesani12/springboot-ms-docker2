package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class R2Controller {

private static final String template = "Hey, %s";

@RequestMapping("/name")

public Hello2 Hello2(@RequestParam(value="fname", defaultValue="charan")String fname) {
	return new Hello2(String.format(template, fname));
}
	
}
