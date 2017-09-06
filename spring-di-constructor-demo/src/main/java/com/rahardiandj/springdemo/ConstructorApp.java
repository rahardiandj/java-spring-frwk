package com.rahardiandj.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ConstructorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");
		
		Organization org = (Organization) ctx.getBean("myorg");
		
		org.corporateSlogan();
		
		System.out.println(org);
		
		((ClassPathXmlApplicationContext) ctx).close();
		
	}

}
