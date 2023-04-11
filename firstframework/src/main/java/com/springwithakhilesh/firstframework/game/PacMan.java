package com.springwithakhilesh.firstframework.game;

public class PacMan implements gameConsole{
	public void up()
	{
		System.out.println("PacMan is jumping");
	}
	public void down()
	{
		System.out.println("PacMan is go to the hole");
	}
	public void left()
	{
		System.out.println("PacMan is moving back");
	}
	public void right()
	{
		System.out.println("PacMan is accelerating");
	}

}
