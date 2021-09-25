package com.tuling.aop;

import com.tuling.aop.advice.ZhouyuAroundAdvise;
import com.tuling.aop.advice.ZhouyuBeforeAdvise;
import com.tuling.aop.service.UserService;
import com.tuling.converter.User;
import org.springframework.aop.TargetSource;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.aop.framework.autoproxy.BeanNameAutoProxyCreator;
import org.springframework.aop.target.CommonsPool2TargetSource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author 周瑜
 */
@Configuration
public class CommonsPool2TargetSourceDemo {

	@Bean
	public ZhouyuAroundAdvise zhouyuAroundAdvise(){
		return new ZhouyuAroundAdvise();
	}


	@Bean
	@Scope("prototype")
	public UserService userServiceTarget() {
		return new UserService();
	}

	@Bean
	public CommonsPool2TargetSource targetSource(){
		CommonsPool2TargetSource targetSource = new CommonsPool2TargetSource();
		targetSource.setTargetBeanName("userServiceTarget");
		targetSource.setMaxSize(2);
		return targetSource;
	}

	@Bean
	public ProxyFactoryBean userService(){
		ProxyFactoryBean proxyFactoryBean = new ProxyFactoryBean();
		proxyFactoryBean.setTargetSource(targetSource());
		proxyFactoryBean.setInterceptorNames("zhouyuAroundAdvise");
		proxyFactoryBean.setProxyTargetClass(true);
		proxyFactoryBean.setExposeProxy(true);
		return proxyFactoryBean;
	}

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext  =
				new AnnotationConfigApplicationContext(CommonsPool2TargetSourceDemo.class);

		UserService userService = applicationContext.getBean("userService", UserService.class);

		new Thread(() -> userService.test()).start();
		new Thread(() -> userService.test()).start();
		new Thread(() -> userService.test()).start();
		new Thread(() -> userService.test()).start();

	}
}
