package br.com.mews.shopping.dao;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("ACCOUNT")
public interface AccountClient {

	@RequestMapping(value="/", method=RequestMethod.GET)
	public String getAccount();

	static class HystrixClientFallback implements AccountClient {

		@Override
		public String getAccount() {
			return "Account Fallback";
		}	
	}	
}
