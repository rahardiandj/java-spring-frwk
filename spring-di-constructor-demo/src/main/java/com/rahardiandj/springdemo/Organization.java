package com.rahardiandj.springdemo;

public class Organization {

	private String comnpanyName;
	
	private int yearOfIncorporation;
	
	private String postalCode;
	
	private int employeeCount;

	/*
	public Organization() {
		
	}
	*/
	
	public Organization(String comnpanyName, int yearOfIncorporation) {
		super();
		this.comnpanyName = comnpanyName;
		this.yearOfIncorporation = yearOfIncorporation;
	}
	
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}

	public void corporateSlogan() {
		
		String slogan = "We build the ultimate driving machines!";
		
		System.out.println(slogan);
	}

	@Override
	public String toString() {
		return "Organization [comnpanyName=" + comnpanyName + ", yearOfIncorporation=" + yearOfIncorporation
				+ ", postalCode=" + postalCode + ", employeeCount=" + employeeCount + "]";
	}
	
}
