package jtm.activity03;
import java.util.ArrayList;
/**
 * Black Knight is brave soldier who fights till he is alive. He doesn't bother
 * if some of his arms or legs are cut off. You can kill him only when he lose
 * head. More info at:
 * https://en.wikipedia.org/wiki/Black_Knight_%28Monty_Python%29
 */
public class BlackKnight {
	// Class variables which are shared between all class members (objects)
	public static short totalKnights; // total number of knights at the start of
										// the battle
	public static short aliveKnights; // total number of alive knights
	public static short deadKnights; // total number of dead knights
	public static BlackKnight[] knights; // array of knights in the battle	// instance variables which are separate for each class member (object)
	public String name; // knight name
	public byte arms, legs, head; // number of limbs
	public boolean alive; // is knight alive	
	public static void setBattle(int initialNumber) {
		// TODO initialize new array of knights with the passed size.
		// Reset total numbers of total and alive knights to zero
		// START
		knights = new BlackKnight[initialNumber];
		totalKnights = 0;
		aliveKnights = 0;
	}
		// END
	

public BlackKnight(String name) {
		// TODO set name of newly created knight
		// 1. set proper count of his arms, legs and head,
		// 2. set his status to alive
		// 3. put reference of this knight into next free cell of knights static
		// array
		// 4. increase number of total and alive knights of static counters
		// HINT: use "this.name" to access name of knight which otherwise is shadowed
		// by parameter of constructor, which is also called "name"
		// START
		this.name = name;
		this.arms = 2;
		this.legs = 2;
		this.head = 1;
		this.alive = true;
		knights[totalKnights] = this;
		totalKnights++;
		aliveKnights++;
		// END
	}	public String cutOffArm() {
		// TODO handle cutting off knight's arms in following way:
		// If knight is dead, return "Only chicken beats dead!"
		// If knight has some arms, cut one off and return "Bugger!"
		// Else return just "Haah!"
		// START
		if (!this.alive) {
			return "Only chicken beats dead!";
		} else if (this.arms > 0) {
			this.arms--;
			return "Bugger!";
		} else {
			return "Haah!";
		}
		// END
	}	public String cutOffLeg() {
		// TODO handle cutting off legs knight's legs in following way:
		// If knight is dead, return "Only chicken beats dead!"
		// If knight has some legs, cut one off and return "Bollocks!"
		// Else return just "Haah!"
		// START
		if (!this.alive) {
			return "Only chicken beats dead!";
		} else if (this.legs > 0) {
			this.legs--;
			return "Bollocks!";
		} else {
			return "Haah!";
		}
		// END
	}	public String cutOffHead() {
		// TODO handle cutting off knight's head in following way:
		// If knight is dead, return "Only chicken beats dead!"
		// If knight is alive and has head, cut it off and update
		// number of total alive and dead knights and then
		// If there are other knights alive return:
		// "You'l newer win! Arthur, Cnut will still fight!"
		// Where "Arthur, Cnut" are names of still alive knights
		// Else return "You'l burn in hell forever!"
		// START
		if (!this.alive) {
			return "Only chicken beats dead!";
		} else if (this.head > 0) {
			this.head--;
			this.alive = false;
			aliveKnights--;
			deadKnights++;
			if (aliveKnights > 0) {
				return "You'l newer win! " + this.aliveKnights() + " will still fight!";
			} else {
				return "You'l burn in hell forever!";
			}		}
		// END
		return "";
	}	// START
	private String aliveKnights() {
		// TODO
		// Build comma separated string of knights who are still alive
		// e.g. if Cnut and Arthur are still alive return Cnut, Arthur
		// If only Arthur is alive return Arthur
		// If no one is alive return empty string
		ArrayList<String> ar = new ArrayList<String>();
		for (int i = 0; i < totalKnights; i++) {
			if (knights[i].alive) {
				ar.add(knights[i].name);
			}
		}
//https://stackoverflow.com/questions/14098032/add-string-to-string-array
//https://stackoverflow.com/questions/599161/best-way-to-convert-an-arraylist-to-a-string
		return String.join(", ", ar);
	}
	// END
}