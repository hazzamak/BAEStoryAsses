package come.qa.randgen;
import java.util.Random;

public class RandGen {
	public int randNESW() {
		Random rand = new Random();
		int Upper = 10;
		int int_random = rand.nextInt(Upper);
		return int_random;
	}
	public String[] storyList = {"You walk into an abandoned building. You find some water to do drink. Do you move N,E,S,W: ",
						"You find yourself in a gloomy forest. Your starting to get hungry. Do you move N,E,S,W: ",
						"You enter into ghost town with wooden shutter closed and broken glass on the floor, Do you move N,E,S,W: ",
						"You meet a crazy man with a gun, you loose a life point as you run away. You run in a random direction",
						"You find an injured deer and manage to eat it. Your not as hungry anymore. Do you move N,E,S,W: ",
						"You find what looks to be a cabin, inside you find a bed to rest in. After waking up do you move N,E,S,W: ",
						"You come to a crossroads. Do you move N,E,S,W: ",
						"You find a spade in a pile of dirt, you dig up the dirt and find the treasure, you have won. Well done.",
						"You walk past some thugs, they beat you up and you loose a life. You run away in a random direction",
						"You get bitten by a snake and pass out loosing a life. When you finally wake up do you move N,E,S,W: "};
	public int PlayerLife = 3;
	
	
	
	
}
