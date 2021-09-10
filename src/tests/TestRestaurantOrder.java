package tests;
/**
 * @author Wade - wrshafer3
 * CIS175 - Fall 2021
 * Sep 9, 2021
 */


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Before;
import org.junit.Test;

import model.RestaurantOrderLogic;
import model.RestaurantOrder;


public class TestRestaurantOrder {
	
	RestaurantOrderLogic newOrderLogic = new RestaurantOrderLogic();
	RestaurantOrder newOrder = new RestaurantOrder();
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testOrderNumber() {
		newOrder.setOrderNum(1);
		int orderNum = newOrder.getOrderNum() + 1;
		assertEquals(2, orderNum, 0.0);
		
	}
	
	@Test
	public void testPrice() {
		newOrder.setPrice(80);
		double finalPrice = newOrderLogic.verifyPrice(newOrder);
		assertEquals(newOrder.getPrice() * newOrder.getTAX_RATE(), finalPrice, 0.0);
	}
	
	@Test
	public void testOrder() {
		newOrder.setMenuItem("Chicken Soup");
		assertTrue(newOrderLogic.checkForMenuItem(newOrder));
	}
	
	@Test
	public void testFalseOrder() {
		newOrder.setMenuItem("Bananas");
		assertFalse(newOrderLogic.checkForMenuItem(newOrder));
	}
}
