package com.haftom.gebreselassie.bootstringreversedemo.serviceImpl;

import org.springframework.stereotype.Service;

import com.haftom.gebreselassie.bootstringreversedemo.service.StringReverseInterface;

@Service
public class IterateString implements StringReverseInterface{

	@Override
	public String reverse(String str) {
		
		StringBuilder reverseStr = new StringBuilder();
		for(int i = str.length() - 1; i >= 0; i--) {
			reverseStr.append(str.charAt(i));
		}
		return reverseStr.toString();
	}

}
