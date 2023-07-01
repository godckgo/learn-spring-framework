package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.PacmanGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		// 1: Object creation
		var game 		= new PacmanGame();	
		// 2: Object creation + Wiring of Dependencies
		var gameRunner 	= new GameRunner(game);	
		
		gameRunner.run();
	}

}
