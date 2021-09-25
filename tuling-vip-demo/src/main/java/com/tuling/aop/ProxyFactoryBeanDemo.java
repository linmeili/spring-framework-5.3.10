package com.tuling.aop;

import com.tuling.aop.advice.ZhouyuAroundAdvise;
import com.tuling.aop.service.UserService;
import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author 周瑜
 */
@Configuration
public class ProxyFactoryBeanDemo {



	@Bean
	public ZhouyuAroundAdvise zhouyuAroundAdvise(){
		return new ZhouyuAroundAdvise();
	}


	@Bean
	public ProxyFactoryBean userService(){
		UserService userService = new UserService();

		ProxyFactoryBean proxyFactoryBean = new ProxyFactoryBean();
		proxyFactoryBean.setProxyTargetClass(true);
		proxyFactoryBean.setTarget(userService);
		proxyFactoryBean.setInterceptorNames("zhouyuAroundAdvise");
		return proxyFactoryBean;
	}

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext  =
				new AnnotationConfigApplicationContext(ProxyFactoryBeanDemo.class);
		UserService userService = applicationContext.getBean("userService", UserService.class);
		userService.test();
	}
}
