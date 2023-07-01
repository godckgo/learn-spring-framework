package com.in28minutes.learnspringframework;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		// 1. Launch a Spring context
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
		// 2. Configure the things that we want Spring to manage - @Configuration
//		System.out.println(context.getBean("person"));
//		System.out.println(context.getBean("person2MethodCall"));
//		System.out.println(context.getBean("person3Parameters"));
		System.out.println(context.getBean("person4Parameters"));
//		System.out.println(context.getBean("address2"));
		System.out.println(context.getBean(Address.class));
		
		/* How can I list all beans managed by Spring framework? */
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
	}

}
