package br.com.mews.shopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.mews.shopping.service.ShoppingService;



@Controller
public class ShoppingController {

	@Autowired
	ShoppingService shoppingService;
	
	/**
	 * Display a small list of Sentences to the caller:
	 */
	@RequestMapping("/store")
	public @ResponseBody String getShopping() {
	  return shoppingService.getShoppingInfo();
	}

}
