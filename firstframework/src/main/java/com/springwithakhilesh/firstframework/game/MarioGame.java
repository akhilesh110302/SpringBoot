package com.springwithakhilesh.firstframework.game;

public class MarioGame implements gameConsole{
	public void up()
	{
		System.out.println("Mario is jumping");
	}
	public void down()
	{
		System.out.println("Mario is go to the hole");
	}
	public void left()
	{
		System.out.println("Mario is moving back");
	}
	public void right()
	{
		System.out.println("Mario is accelerating");
	}

}
