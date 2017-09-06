package com.rahardiandj.springdemo.domain;

import com.rahardiandj.springdemo.service.RecruitmentService;

public class HumanResourcesDept implements Department {

	private String deptName;
	private RecruitmentService recruitmentService;
	private Organization organization;
	
	public HumanResourcesDept(RecruitmentService recruitmentService, Organization organization) {
		super();
		this.recruitmentService = recruitmentService;
		this.organization = organization;
	}
	
	
	
	public String hiringStatus(int numberOfRecruitments) {
		String hiringFact = recruitmentService.recruitEmployees(organization.getComnpanyName(), deptName, numberOfRecruitments);
		return hiringFact;
				
	}



	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

}
