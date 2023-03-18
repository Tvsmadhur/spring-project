package com.madhur.learnspring;

import org.springframework.stereotype.Component;

@Component

public class ContraGame implements GameType{
	public void run()
	{
		System.out.println("Game is Running");
	}
}
