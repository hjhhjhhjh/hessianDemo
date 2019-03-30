package com.hjh.test.hessian.demo;

import com.hjh.test.hessian.demo.IHelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.remoting.caucho.HessianProxyFactoryBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Bean
	public HessianProxyFactoryBean helloClient() {
		HessianProxyFactoryBean factory = new HessianProxyFactoryBean();
		factory.setServiceUrl("http://localhost:8080/HelloService");
		factory.setServiceInterface(IHelloService.class);
		return factory;
	}

	@Autowired
	IHelloService iHelloService;

	@Test
	public void contextLoads() {
		System.out.println(iHelloService.sayHello("123"));
	}

}
