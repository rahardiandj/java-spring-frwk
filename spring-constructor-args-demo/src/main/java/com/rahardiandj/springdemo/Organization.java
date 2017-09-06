package com.rahardiandj.springdemo;

public class Organization {

	private String comnpanyName;
	
	private int yearOfIncorporation;
	
	public Organization() {
		
	}
	
	public Organization(String comnpanyName, int yearOfIncorporation) {
		super();
		this.comnpanyName = comnpanyName;
		this.yearOfIncorporation = yearOfIncorporation;
	}

	public void corporateSlogan() {
		
		String slogan = "We build the ultimate driving machines!";
		
		System.out.println(slogan);
	}

	@Override
	public String toString() {
		return "Organization [comnpanyName=" + comnpanyName + ", yearOfIncorporation=" + yearOfIncorporation + "]";
	}
	
}
