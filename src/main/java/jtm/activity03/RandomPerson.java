package jtm.activity03;

public class RandomPerson {

	// TODO Create _private_ structure of random person to store values:
	// name as String,
	// age as int,
	// weight as float,
	// isFemale as boolean;
	// smile as char
	// HINT: use Alt+Shift+A to switch to Block selection (multi-line cursor)
	// to edit list of all properties at once
	// START
	private String name;
	private int age;
	private float weight;
	private boolean isFemale;
	private char smile;
	// END

	// TODO Generate getters and setters for all private fields of the class
	// START
	private String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	private int getAge() {
		return age;
	}

	private void setAge(int age) {
		this.age = age;
	}

	private float getWeight() {
		return weight;
	}

	private void setWeight(float weight) {
		this.weight = weight;
	}

	private boolean isFemale() {
		return isFemale;
	}

	private void setFemale(boolean isFemale) {
		this.isFemale = isFemale;
	}

	private char getSmile() {
		return smile;
	}

	private void setSmile(char smile) {
		this.smile = smile;
	}

}

// END
