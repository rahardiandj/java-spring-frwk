package com.rahardiandj.springdemo.domain;

import com.rahardiandj.springdemo.service.BusinessService;

public class Organization {

	private String comnpanyName;
	
	private int yearOfIncorporation;
	
	private String postalCode;
	
	private int employeeCount;
	
	private String slogan;
	
	private BusinessService businessService;

	/*
	public Organization() {
		
	}
	*/
	
	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}

	public void setBusinessService(BusinessService businessService) {
		this.businessService = businessService;
	}

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

	public String corporateSlogan() {
		return slogan;
	}
	
	
	public String corporateService() {
		
		return businessService.offerService(comnpanyName);
	}
	
	@Override
	public String toString() {
		return "Organization [comnpanyName=" + comnpanyName + ", yearOfIncorporation=" + yearOfIncorporation
				+ ", postalCode=" + postalCode + ", employeeCount=" + employeeCount + "]";
	}
	
}
