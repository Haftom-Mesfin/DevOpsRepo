package com.haftom.gebreselassie.bootstringreversedemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.haftom.gebreselassie.bootstringreversedemo.service.StringReverseInterface;

@Controller
public class StringReverseController {
	
	@Autowired
	private StringReverseInterface stringReverseInterface;
	
//	@RequestMapping(value = "/reverse", method = RequestMethod.GET)
//	public String getString() {
//		return stringReverseInterface.reverse("haftom");
//	}
}
