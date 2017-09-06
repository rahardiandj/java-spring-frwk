package com.rahardiandj.springdemo.serviceimpl;

import java.util.Random;

import com.rahardiandj.springdemo.service.BusinessService;

public class CloudServiceImpl implements BusinessService {

	public String offerService(String companyName) {
		// TODO Auto-generated method stub
		Random random = new Random();
		
		String service = "\nAs an Organization,  " + companyName + 
				" offers world class Cloud computing infrastructure. "+
				"\nThe annual income exceeds " + random.nextInt(revenue) + " dollars.\n";
	
		return service;
	}

}
