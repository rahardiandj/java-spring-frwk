package com.rahardiandj.springdemo.serviceimpl;

import java.util.Random;

import com.rahardiandj.springdemo.service.RecruitmentService;

public class AgencyRecruitmentServiceImpl implements RecruitmentService {

	public String recruitEmployees(String companyName, String departmentName, int numberOfRecruitment) {
		
		Random random = new Random();
		
		String hiringFact = "\n" + companyName + "'s" + departmentName + " hired " + 
		random.nextInt(numberOfRecruitment) + " employees " + 
				" using various hiring agencies.";
		
		return hiringFact;
		
	}

}
