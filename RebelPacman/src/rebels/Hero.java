package rebels;

public class Hero implements HeroInterface {

	private static final int SIZE = 4;

	private String[] path;
	private String name;
	private int potionCounter;
	private int xPos;
	private int yPos;
	private int steps;

	public Hero(String name, int xPos, int yPos) {
		this.name = name;
		this.xPos = xPos;
		this.yPos = yPos;
		potionCounter = 0;
		path = new String[SIZE];
	}

	public String[] getPath() {
		return path;
	}

	public String getName() {
		return name;
	}

	public void givePotion() {
		potionCounter = 4;
	}

	public boolean hasPotion() {
		return (potionCounter > 0);
	}

	public int getxPos() {
		return xPos;
	}

	public int getyPos() {
		return yPos;
	}

	public void move(String direction) {
		if (direction.equals("D")) {
			yPos--;
		}
		if (direction.equals("U")) {
			yPos++;
		}
		if (direction.equals("L")) {
			xPos--;
		}
		if (direction.equals("D")) {
			xPos++;
		}
		steps++;
	}

	public int getSteps() {
		return steps;
	}

	private void resize() {
		// inserir resize
	}

}
