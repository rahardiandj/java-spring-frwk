package com.rahardiandj.springdemo.serviceimpl;

import java.util.Random;

import com.rahardiandj.springdemo.service.BusinessService;

public class EcommerceServiceImpl implements BusinessService {

	public String offerService(String companyName) {
		
		Random random = new Random();
		
		String service = "\nAs an Organization,  " + companyName + 
				" offers world class Ecommerce infrastructure. "+
				"\nThe annual income exceeds " + random.nextInt(revenue) + " dollars.\n";
	
		return service;
		

	}

}
