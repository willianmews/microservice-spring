package br.com.mews.account.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AccountController {
	
	@RequestMapping("/")
	public @ResponseBody String getAccount() {
		return "Account information";
	}
}
