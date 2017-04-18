import java.util.Scanner;
import game.*;
import rebels.*;
import stormtroopers.*;
import map.*;

public class Main {

	private static void createMap(Scanner in, GameInterface game) {// inserir inputs autistas para dar erro
		int l = in.nextInt();
		int c = in.nextInt();
		in.nextLine();
		game.createMatrix(l, c);
		for (int i = 0; i < l; i++) {
			String line = in.nextLine();
			game.insertLine(line, i, c);
		}
	}

	private static void printMap(GameInterface game) {
		String line;
		mapSpotInterface[][] mapa = game.readMap();
		for(int i = 0; i<game.getLines();i++){
			line = "";
			for(int ii = 0; ii<game.getColumns(); ii++){
				line = line + mapa[i][ii].getMapRepresentation();
			}
			System.out.println(line);
		}
	}
	
	private static void createRebel(Scanner in, GameInterface game){
		
	}

	private static void moveRebel(Scanner in, GameInterface game){
		for(int i = 0; i<game.getRebelCounter(); i++){
			
		}
	}
	
	public static void main(String[] args) {
		GameInterface game = new Game();
		
		Scanner in = new Scanner(System.in);
		createMap(in, game);
		System.out.println(game.getEmptySpaces());
		printMap(game);
		System.out.println(game.getTrooperCounter());
	}

}
