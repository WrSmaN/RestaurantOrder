package model;

/**
 * @author Wade - wrshafer3
 * CIS175 - Fall 2021
 * Sep 9, 2021
 */

public class RestaurantOrderLogic {

	public void confirmOrderNumber(RestaurantOrder order) {
		int orderNum = order.getOrderNum() + 1;
		order.setOrderNum(orderNum);
	}
	
	public double verifyPrice(RestaurantOrder order) {
		double finalPrice = 0;
		finalPrice = order.getPrice() * order.getTAX_RATE();
		return finalPrice;
	}
	
	public boolean checkForMenuItem(RestaurantOrder order) {
		String customerOrder = order.getMenuItem();
		
		if (customerOrder.equalsIgnoreCase("Chicken Soup")) {
			return true;
		}else if (customerOrder.equalsIgnoreCase("Garlic Bread")) {
			return true;
		}else {
			return false;
		}
	}
	
}
