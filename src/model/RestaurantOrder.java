package model;
/**
 * @author Wade - wrshafer3
 * CIS175 - Fall 2021
 * Sep 9, 2021
 */


public class RestaurantOrder {
	private int orderNum;
	private double price;
	private double TAX_RATE = 1.07;
	private String menuItem;
	
	
	public int getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getTAX_RATE() {
		return TAX_RATE;
	}
	public void setTAX_RATE(double tAX_RATE) {
		TAX_RATE = tAX_RATE;
	}
	public String getMenuItem() {
		return menuItem;
	}
	public void setMenuItem(String menuItem) {
		this.menuItem = menuItem;
	}
}
