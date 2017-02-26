package br.com.mews.shopping.service;

import br.com.mews.shopping.dao.AccountClient;
import br.com.mews.shopping.dao.OrderClient;
import br.com.mews.shopping.dao.ProductClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mews.shopping.dao.CartClient;

/**
 * Build a sentence by assembling randomly generated subjects, verbs, 
 * articles, adjectives, and nouns.  The individual parts of speech will 
 * be obtained by calling the various DAOs.
 */
@Service
public class ShoppingServiceImpl implements ShoppingService {

	ProductClient productClient;
	CartClient cartClient;
	AccountClient accountClient;
	OrderClient orderClient;

	/**
	 * Assemble a sentence by gathering random words of each part of speech:
	 */
	public String getShoppingInfo() {
		String shoppingInfo = "There was a problem assembling the sentence!";
		shoppingInfo =
			String.format("%s %s %s %s .",
					productClient.getProduct(),
					cartClient.getCart(),
					accountClient.getAccount(),
					orderClient.getOrder());
		return shoppingInfo;
	}

	@Autowired
	public void setSubjectService(ProductClient productClient) {
		this.productClient = productClient;
	}

	@Autowired
	public void setArticleService(CartClient cartClient) {
		this.cartClient = cartClient;
	}

	@Autowired
	public void setAdjectiveService(AccountClient accountClient) {
		this.accountClient = accountClient;
	}

	@Autowired
	public void setNounService(OrderClient orderClient) {
		this.orderClient = orderClient;
	}	
	
}
