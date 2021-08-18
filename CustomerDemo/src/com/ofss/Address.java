package com.ofss;

public class Address {
	private int flatNum;
	private String streetName;
	private String city;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int flatNum, String streetName, String city) {
		super();
		this.flatNum = flatNum;
		this.streetName = streetName;
		this.city = city;
	}
	public int getFlatNum() {
		return flatNum;
	}
	public void setFlatNum(int flatNum) {
		this.flatNum = flatNum;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [flatNum=" + flatNum + ", streetName=" + streetName + ", city=" + city + "]";
	}
	
	
}
