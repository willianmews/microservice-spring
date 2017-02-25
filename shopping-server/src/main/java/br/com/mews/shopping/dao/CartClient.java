package br.com.mews.shopping.dao;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("CART")
public interface CartClient {

	@RequestMapping(value="/", method=RequestMethod.GET)
	public String getCart();

}
