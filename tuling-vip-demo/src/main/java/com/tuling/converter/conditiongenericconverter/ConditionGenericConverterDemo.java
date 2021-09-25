package com.tuling.converter.conditiongenericconverter;

import com.tuling.converter.User;
import com.tuling.converter.service.OrderService;
import com.tuling.converter.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ConditionGenericConverterDemo {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		UserService userService = context.getBean("userService", UserService.class);
		System.out.println(userService.getUserName());
	}
}
