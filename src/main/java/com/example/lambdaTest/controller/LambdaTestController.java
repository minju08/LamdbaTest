package com.example.lambdaTest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LambdaTestController {

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public void lambdaTestMethod() throws Exception {
		
	}
}
