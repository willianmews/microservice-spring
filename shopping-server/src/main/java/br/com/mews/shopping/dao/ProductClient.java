package br.com.mews.shopping.dao;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("PRODUCT")
public interface ProductClient {

	@RequestMapping(value="/", method=RequestMethod.GET)
	public String getProduct();
	
}
