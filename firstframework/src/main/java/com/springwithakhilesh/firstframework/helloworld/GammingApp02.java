package com.springwithakhilesh.firstframework.helloworld;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GammingApp02 {

	public static void main(String[] args) {
		// 1. launch a spring context
		try (var context = new AnnotationConfigApplicationContext(HelloworldConfiguration.class)) {

			// 2. Configure the things that we want spring to manage @configuration
//			System.out.println(context.getBean("name"));
//			System.out.println(context.getBean("age"));
//			System.out.println(context.getBean(Person.class));
//			System.out.println(context.getBean("personwithnameandage"));
//			System.out.println(context.getBean("ad"));
			System.out.println(context.getBean(Address.class));
			//Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		}

	}

}
