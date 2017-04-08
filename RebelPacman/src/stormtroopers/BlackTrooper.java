package stormtroopers;

public class BlackTrooper extends Stormtroopers {

	public BlackTrooper(int number) {
		name = "ST-B-" + number;
		moves = new String[SIZE];
		moves[0] = "up";
		moves[1] = "down";
		moves[2] = "left";
		moves[3] = "right";
		moveCounter = 0;
		active = true;
	}

}
