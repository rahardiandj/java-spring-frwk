package com.rahardiandj.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.rahardiandj.springdemo.domain.Organization;

public class DISetterApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");
		
		Organization org = (Organization) ctx.getBean("myorg");
		
		System.out.println(org.corporateSlogan());
		
		System.out.println(org.corporateService());
		
		System.out.println(org);
		
		((ClassPathXmlApplicationContext) ctx).close();
		
	}

}
