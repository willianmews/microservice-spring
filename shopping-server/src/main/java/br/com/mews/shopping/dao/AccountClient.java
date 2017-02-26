package br.com.mews.shopping.dao;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "ACCOUNT", fallback = AccountClientFallback.class)
public interface AccountClient {

	@RequestMapping(value="/", method=RequestMethod.GET)
	public String getAccount();

}

@Component
class AccountClientFallback implements AccountClient {

	@Override
	public String getAccount() {
		return "Account Fallback";
	}
}