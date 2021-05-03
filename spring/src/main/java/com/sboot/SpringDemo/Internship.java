package com.sboot.SpringDemo;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Internship {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
DXC dxc=(DXC)context.getBean("dxc1");
dxc.display();
context.close();


	}

}
