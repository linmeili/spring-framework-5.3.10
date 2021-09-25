package com.tuling.converter.propertyeditorregistrar;

import com.tuling.converter.User;
import com.tuling.converter.service.OrderService;
import com.tuling.converter.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class CustomPropertyEditorRegistrarDemo {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		UserService userService = context.getBean("userService", UserService.class);
		User user = userService.getUser();
		System.out.println(user.getName());

		OrderService orderService = context.getBean("orderService", OrderService.class);
		User user1 = orderService.getUser();
		System.out.println(user1.getName());
	}
}
