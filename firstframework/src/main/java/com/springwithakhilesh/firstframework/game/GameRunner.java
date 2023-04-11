package com.springwithakhilesh.firstframework.game;

public class GameRunner {
	private  gameConsole game;
	public GameRunner( gameConsole game)
	{
		this.game=game;
	}

	public void run() {
		System.out.println("Mario is Running : "+game);
		game.up();
		game.down();
		game.left();
		game.right();
		
	}

}
