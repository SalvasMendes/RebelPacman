package stormtroopers;

public abstract class Stormtroopers implements StormtrooperInterface {

	protected static final int SIZE = 3;
	protected int moveCounter;
	protected String[] moves;
	protected boolean active;
	protected int xPos;
	protected int yPos;
	protected String name;

	public String readMove() {
		return moves[moveCounter];
	}

	public boolean isActive() {
		return active;
	}

	public int getxPos() {
		return xPos;
	}

	public void setxPos(int xPos) {
		this.xPos = xPos;
	}

	public int getyPos() {
		return yPos;
	}

	public void setyPos(int yPos) {
		this.yPos = yPos;
	}

}
