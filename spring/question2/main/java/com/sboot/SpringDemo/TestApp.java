package com.sboot.SpringDemo;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");

	      Patient p = (Patient) context.getBean("patient1");
	      p.calculate();
	      context.close();
	}

}
