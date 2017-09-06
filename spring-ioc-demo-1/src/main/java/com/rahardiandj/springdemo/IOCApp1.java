package com.rahardiandj.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class IOCApp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx = new FileSystemXmlApplicationContext("beans.xml");
		
		Organization org = (Organization) ctx.getBean("myorg");
		
		org.corporateSlogan();
		
		((FileSystemXmlApplicationContext) ctx).close();
		
	}

}
