package game;

public interface GameInterface {

	// void addRebel();

	// void addStormtrooper();

	char[][] readMap();

	void moveHeros(String direction);

	void insertLine(String line, int l, int c);

	void createMatrix(int l, int c);

	boolean emptyMap();
	
	int getLines();
	
	int getColumns();
	
	int getEmptySpaces();
	
	int getTrooperCounter();
	
	int getRebelCounter();

}
