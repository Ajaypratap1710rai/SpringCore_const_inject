package com.springcore.const_inject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ci_Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/const_inject/ciconfig.xml");
		Person per=(Person) context.getBean("person");
		
		System.out.println(per);
		
		Ambiguity_problem simple=(Ambiguity_problem) context.getBean("add");
		simple.doSum();

	}

}
