package com.springwithakhilesh.firstframework.game;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springwithakhilesh.firstframework.helloworld.HelloworldConfiguration;

public class GammingApp03 {

	public static void main(String[] args) {
		// 1. launch a spring context
		try (var context = new AnnotationConfigApplicationContext(GammingConfiguaration.class)) {
			context.getBean(gameConsole.class).up();
			context.getBean(GameRunner.class).run();
		
			
		}

	}

}
