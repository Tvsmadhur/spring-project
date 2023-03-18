package com.madhur.learnspring;

import org.springframework.stereotype.Component;

@Component
public class SuperContraGame implements GamingConsole {
	public void up()
	{
		System.out.println("jumped");
	}
	public void down()
	{
		System.out.println("Go Into Hole");
	}
	public void left()
	{
		System.out.println("Go Left");
	}
	public void right()
	{
		System.out.println("Go Right");
	}

}
