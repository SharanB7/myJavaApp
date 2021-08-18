package com.ofss;

public class Customer {
	private String name;
	private String mobNum;
	private Address addr;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String name, String mobNum, Address addr) {
		super();
		this.name = name;
		this.mobNum = mobNum;
		this.addr = addr;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobNum() {
		return mobNum;
	}
	public void setMobNum(String mobNum) {
		this.mobNum = mobNum;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", mobNum=" + mobNum + ", addr=" + addr + "]";
	}
	
	

}
