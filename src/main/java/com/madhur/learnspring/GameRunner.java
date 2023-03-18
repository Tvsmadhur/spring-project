package com.madhur.learnspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class GameRunner {
	@Autowired
	GamingConsole game;
	
	public GameRunner(GamingConsole game)
	{
		this.game=game;
	}

	@Bean
	public void run() {
		System.out.println("Running game:"+game);
		game.up();
		game.down();
		game.left();
		game.right();
		
	}
}
