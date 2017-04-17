package game;

import java.util.Scanner;
import rebels.*;
import stormtroopers.*;
import map.*;

public class Game implements GameInterface {

	private int heroCounter;
	private HeroInterface[] heros;
	private StormtrooperInterface[] stws;
	private mapSpotInterface[][] map;
	private int rebelCounter;
	private int emptySpaces;
	private int trooperCounter;
	private int lines;
	private int columns;

	public Game() {
		heroCounter = 0;
		rebelCounter = 0;
		emptySpaces = 0;
		trooperCounter = 0;
		lines = -1;
		columns = -1;
	}

	public void moveHeros(String direction) {// podemos usar o char at tb
		Scanner str = new Scanner(direction);
		for (int i = 0; i < heroCounter; i++) {
			String move = str.next();
			int c = heros[i].getxPos();
			int l = heros[i].getyPos();
			heros[i].move(move);
			int cc = heros[i].getxPos();
			int ll = heros[i].getyPos();
			updateMap(c, l, cc, ll, heros[i]);
		}
		str.close();
	}

	public void createMatrix(int l, int c) {
		map = new mapSpotInterface[l][c];
		lines = l;
		columns = c;
	}

	public void insertLine(String line, int l, int c) {// acabar
		for (int i = 0; i < c; i++) {
			switch (line.charAt(i)) {
			case ' ':
				map[l][i] = new mapSpot(false, false, false);
				emptySpaces++;
				break;
			case '.':
				map[l][i] = new mapSpot(true,false, false);
			case 'O':
				stws[trooperCounter] = new OrangeTrooper(trooperCounter);
				map[l][i] = new mapSpot(false, false, true, stws[trooperCounter++]);
				break;
			case 'B':
				stws[trooperCounter] = new BlackTrooper(trooperCounter);
				map[l][i] = new mapSpot(false, false, true, stws[trooperCounter++]);
				break;
			case 'W':
				stws[trooperCounter] = new WhiteTrooper(trooperCounter);
				map[l][i] = new mapSpot(false, false, true, stws[trooperCounter++]);
				break;
			case '#':
				map[l][i] = new mapSpot(false, true, false);
				break;
			default:
				break;
			}
		}
	}

	private void updateMapHero(int c, int l, int cc, int ll, HeroInterface hero) {// retirar da posicao
															// (c,l) e colocar
															// na posicao
															// (cc,ll)
		map[l][c].removeHero();
		map[ll][cc].insertHero(hero);
	}

	public void createHero(String name, int xPos, int yPos) {

	}

	public char[][] readMap() {
		return map;
	}

	public boolean emptyMap() {
		return (lines == -1);
	}

	public int getLines() {
		return lines;
	}

	public int getColumns() {
		return columns;
	}

	public int getEmptySpaces() {
		return emptySpaces;
	}

	public int getTrooperCounter() {
		return trooperCounter;
	}

	public int getRebelCounter() {
		return rebelCounter;
	}

}
