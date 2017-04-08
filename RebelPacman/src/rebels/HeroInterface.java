package rebels;

public interface HeroInterface {

	String[] getPath();

	String getName();

	void givePotion();

	boolean hasPotion();

	int getxPos();

	int getyPos();

	void move(String direction);

}
