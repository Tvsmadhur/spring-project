package com.madhur.learnspring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//import com.madhur.learnspring.MarioGame;
import com.madhur.learnspring.GameRunner;
public class App02HelloWorld {
	public static void main(String args[])
	{
//		var game=new SuperContraGame();
//		var gameRunner=new GameRunner(game);
//		gameRunner.run();
	var context=new AnnotationConfigApplicationContext(GameRunner.class);
	context.getBean("run");
	
	
				
	}

}
