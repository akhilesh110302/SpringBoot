package com.springwithakhilesh.firstframework.game;

public class GammingApp01 {

	public static void main(String[] args) 
	{
		var pacMan =new PacMan();
		var mariogame =new MarioGame();
		var supercontra =new SuperContra();
		var gameRunner =new GameRunner(mariogame);
		gameRunner.run();
	}

}
