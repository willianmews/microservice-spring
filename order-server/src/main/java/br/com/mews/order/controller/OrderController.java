package br.com.mews.order.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class OrderController {
	
	@RequestMapping("/")
	public @ResponseBody String getWord() {
		return "Order information";
	}
}
