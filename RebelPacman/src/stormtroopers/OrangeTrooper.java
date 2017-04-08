package stormtroopers;

public class OrangeTrooper extends Stormtroopers {

	public OrangeTrooper(int number) {
		name = "ST-O-" + number;
		moves = new String[SIZE];
		moves[0] = "right";
		moves[1] = "down";
		moves[2] = "left";
		moves[3] = "up";
		moveCounter = 0;
		active = true;
	}
}
