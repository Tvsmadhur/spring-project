package com.madhur.learnspring;

public class GameRunner {
	GameType game;
  public GameRunner(GameType game)
  {
	  this.game=game;
  }
  
 

public void running()
  {
	  game.run();
  }
}
