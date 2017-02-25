package br.com.mews.service;

import br.com.mews.shopping.service.ShoppingServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;

import br.com.mews.shopping.dao.AccountClient;
import br.com.mews.shopping.dao.CartClient;
import br.com.mews.shopping.dao.OrderClient;
import br.com.mews.shopping.dao.ProductClient;

public class ShoppingServiceImplTest {

	//	Class under test:
	ShoppingServiceImpl service;
	
	@Before
	public void setup() {

		service = new ShoppingServiceImpl();
		
		//	Establish Mock Dependencies:
		ProductClient productClient = Mockito.mock(ProductClient.class);
		CartClient cartClient = Mockito.mock(CartClient.class);
		AccountClient accountClient = Mockito.mock(AccountClient.class);
		OrderClient orderClient = Mockito.mock(OrderClient.class);

		service.setSubjectService(productClient);
		service.setArticleService(cartClient);
		service.setAdjectiveService(accountClient);
		service.setNounService(orderClient);
		
		//	Describe Mock Behaviors:
		Mockito.when(productClient.getProduct()).thenReturn("1");
		Mockito.when(cartClient.getCart()).thenReturn("2");
		Mockito.when(accountClient.getAccount()).thenReturn("3");
		Mockito.when(orderClient.getOrder()).thenReturn("3");
	}
	
	@Test
	public void test() {
		Assert.assertEquals("1 2 3 4 5.", service.getShoppingInfo());
	}

}
