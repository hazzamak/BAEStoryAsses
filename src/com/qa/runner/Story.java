package com.qa.runner;

import java.util.Scanner;
import java.util.Random;

public class Story {

	public static int randNESW() {
		int max = 39;
		int min = 0;
		int int_random = (int)Math.floor(Math.random()*(max-min+1)+min);
		return int_random;
	} 
	public static int combatWeapon() {
		int enemyhealth = 2;
		int enemydamage = 0;
		int attackdmg = 3;
		while ((enemyhealth > 0) & (enemydamage < 3)) {
			Random rand = new Random();
			int Upper = 2;
			int int_random = rand.nextInt(Upper);
			if (int_random == 0) {
				System.out.println("You attack first! And kill the enemy");
				enemyhealth = enemyhealth - attackdmg;
			}else {
				System.out.println("The enemy attacks first! You loose a point of health");
				enemydamage = enemydamage + 1;
			}
		}
		return enemydamage;
	} 
	public static int combat() {
		int enemyhealth = 2;
		int enemydamage = 0;
		int attackdmg = 1;
		while ((enemyhealth > 0) & (enemydamage < 3)) {
			Random rand = new Random();
			int Upper = 2;
			int int_random = rand.nextInt(Upper);
			if (int_random == 0) {
				System.out.println("You attack first! And kill the enemy");
				enemyhealth = enemyhealth - attackdmg;
			}else {
				System.out.println("The enemy attacks first! You loose a point of health");
				enemydamage = enemydamage + 1;
			}
		}
		return enemydamage;
	} 
	public static void main(String[] args) {
		Scanner myObj = new Scanner (System.in);
		System.out.println("Welcome to the story. To start you leave you cabin in the middle of the woods"
				+ " in search of treasure that you know is near by, if you manage to not die to the dangers "
				+ "of the outside world");

		String[] storyList = {"You walk into a group of thugs.", "You come across a brown bear.", "you come across a group of robbers.",
								"You bump into a drunk man", "You cross a river and see a crocadile", "You get taunted by corrupt guards after your money",
								"A starving dog charges at you", "You suddenly get attacked by an outcast", "You get chased by an assasin after the treasure",
								"A snake starts slithering towards you",
								"You find a weapon do you pick it up?", "You find a weapon do you pick it up", "You find a weapon do you pick it up" , "You find a weapon do you pick it up",
								"You find a weapon do you pick it up",
								"You find a health pack do you pick it up", "You find a health pack do you pic it up", "You find a health pack do you pic it up", "You find a health pack do you pic it up",
								"You find a health pack do you pick it up",
								"You walk into a swamp", " You find an abandoned building", "You swim across a murky river", "you come across a hole through the cliff", "You happen apon a beach",
								"You find somewhere to rest for the night", "You find a dead deer and decide to eat it", "You find a pool of water to purify and drink", "You climb up a steep hill",
								"You traverse a rocky outcrop", "You walk through a lush field with an amazing view of a mountain range", "You come across a path of edable mushrooms",
								"You find a bush with berries on", "You walk around the edge of the town, better that you dont trust anyone", "You hear people approach and manage to hide just in time", 
								"You have to walk through a deep swamp",
								"You find a good place to rest and recover. Do you wish to carry on(type: walk) or recover(type: recover): ", "You find a good place to rest and recover. Do you wish to carry on(type: walk) or recover(type: recover): ",
								"You find a good place to rest and recover. Do you wish to carry on(type: walk) or recover(type: recover): ", "You find a good place to rest and recover. Do you wish to carry on(type: walk) or recover(type: recover): ",
								"You find a good place to rest and recover. Do you wish to carry on(type: walk) or recover(type: recover): ", "You find a good place to rest and recover. Do you wish to carry on(type: walk) or recover(type: recover): ",
								"You find a good place to rest and recover. Do you wish to carry on(type: walk) or recover(type: recover): ",
								};
		int PlayerLife = 3;
		boolean gamewin = false;
		boolean weapon = false;
		while ((PlayerLife > 0) & (gamewin = true)) {
			int num = randNESW();
			System.out.println(storyList[num]);
			if ((num >= 0) & (num < 9)) {
				System.out.println("Would you like to run away(type: run) or attack(type: attack)? ");
				String answer = myObj.nextLine();
				if (answer == "engage") {
					if (weapon = true) {
						PlayerLife = PlayerLife - combatWeapon();
					}else {
						PlayerLife = PlayerLife - combat();
					}
				}
				if (answer == "run") {
					Random rand = new Random();
					int Upper = 2;
					int int_random = rand.nextInt(Upper);
					if (int_random == 0) {
						System.out.println("You ran away successfully");
					} else if (int_random == 1) {
						System.out.println("You took a point of damage whilst running away");
						PlayerLife = PlayerLife - 1;
					}
				}
			} else if ((num >= 9) & (num <= 16)) {
				String answer = myObj.nextLine();
				if (answer == "yes") {
					weapon = true;
				}
			} else if ((num <= 32) & (num >= 16)) {
				System.out.println("Would you like to move N,E,S,W: ");
				String answer = myObj.nextLine();
			} else if ((num >= 33) & (num <= 40)) {
				String answer = myObj.nextLine();
				if (answer == "walk") {
					System.out.println("Would you like to move N,E,S,W: ");
					String answer1 = myObj.nextLine();
				}else if (answer == "recover") {
					PlayerLife = PlayerLife + 1;
					System.out.println("Would you like to move N,E,S,W: ");
					String answer1 = myObj.nextLine();
				}
				
			}
		}
		if (PlayerLife < 0) {
			System.out.println("You have died better luck next time");
		}
		myObj.close();
	}
}
