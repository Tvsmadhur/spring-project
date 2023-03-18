package com.madhur.learnspring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration

public class GamingContext {
//	@Bean
//	public GameType game()
//	{
//		
//		var contraGame=new ContraGame();
//		
//		return contraGame;
//	}
	public GameType game;
	@Bean
	
	public GameRunner gameRunner(GameType game)
	{
		var gameRunner=new GameRunner(game);
		return gameRunner;
	}
	public static void main(String args[])
	{
//	
		var context=new AnnotationConfigApplicationContext(GamingContext.class);
		
		 GameRunner game=(GameRunner) context.getBean("gameRunner");
		 game.running();
		
		
	}
}
