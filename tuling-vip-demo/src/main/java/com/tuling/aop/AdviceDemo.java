package com.tuling.aop;

import com.tuling.aop.advice.ZhouyuAfterReturningAdvise;
import com.tuling.aop.advice.ZhouyuAroundAdvise;
import com.tuling.aop.advice.ZhouyuBeforeAdvise;
import com.tuling.aop.advice.ZhouyuThrowsAdvice;
import com.tuling.aop.service.UserInterface;
import com.tuling.aop.service.UserService;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Before;
import org.springframework.aop.IntroductionAdvisor;
import org.springframework.aop.framework.ProxyFactory;

/**
 * @author 周瑜
 */
public class AdviceDemo {

	public static void main(String[] args) {
		UserService userService = new UserService();
		ProxyFactory proxyFactory = new ProxyFactory(userService);
		proxyFactory.addAdvice(new ZhouyuBeforeAdvise());
		proxyFactory.addAdvice(new ZhouyuBeforeAdvise());
//		proxyFactory.addAdvice(new ZhouyuAfterReturningAdvise());
//		proxyFactory.addAdvice(new ZhouyuThrowsAdvice());
//		proxyFactory.addAdvice(new ZhouyuAroundAdvise());
		UserInterface proxy = (UserInterface) proxyFactory.getProxy();
		proxy.hashCode();
	}
}
