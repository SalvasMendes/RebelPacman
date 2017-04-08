package stormtroopers;

public class WhiteTrooper extends Stormtroopers{

	public WhiteTrooper(int number) {
		name = "ST-W-" + number;
		moves = new String[SIZE];
		moves[0] = "left";
		moves[1] = "right";
		moves[2] = "down";
		moves[3] = "up";
		moveCounter = 0;
		active = true;
	}
	
}
