package com.springwithakhilesh.firstframework.game;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class GammingConfiguaration {

	@Bean
	public gameConsole game()
	{
		var game= new PacMan();
		return game;
	}
	@Bean
	public GameRunner GameRunner(gameConsole game)
	{
		var gameRunner=new GameRunner(game);
		return gameRunner;
	}
}
