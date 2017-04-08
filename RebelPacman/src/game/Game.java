package game;

import java.util.Scanner;
import rebels.*;
import stormtroopers.OrangeTrooper;

public class Game implements GameInterface {

	private int heroCounter;
	private HeroInterface[] heros;
	private char[][] map;
	private int rebelCounter;
	private int emptySpaces;
	private boolean emptyMap;
	private int trooperCounter;

	public Game() {
		heroCounter = 0;
		rebelCounter = 0;
		emptySpaces = 0;
		trooperCounter = 0;
		emptyMap = true;
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
			updateMap(c, l, cc, ll);
		}
		str.close();
	}

	public void createMatrix(int l, int c) {
		map = new char[l][c];
	}

	public void insertLine(String line, int l, int c) {//acabar
		for (int i = 0; i < c; i++) {
			map[l][i] = line.charAt(i);
			switch(line.charAt(i)){
			case ' ': emptySpaces++; break;
			case 'O': new OrangeTrooper(++trooperCounter);
			}
		}
	}

	private void updateMap(int c, int l, int cc, int ll) {// retirar da posicao
															// (c,l) e colocar
															// na posicao
															// (cc,ll)
		char tempC = map[l][c];
		map[l][c] = ' ';
		tempC = map[ll][cc];
	}

	public char[][] readMap() {
		return map;
	}

	public boolean emptyMap() {
		return emptyMap;
	}

}
