import java.util.Scanner;
import game.*;
import rebels.*;
import stormtroopers.*;

public class Main {

	private static void createMap(Scanner in, GameInterface game) {//inserir inputs autistas para dar erro
		int l = in.nextInt();
		int c = in.nextInt();
		in.nextLine();
		game.createMatrix(l, c);
		for (int i = 0; i < l; i++) {
			String line = in.nextLine();
			game.insertLine(line, i, c);
		}
	}
	
	private static void readMap(GameInterface game){
		
	}

	public static void main(String[] args) {
		GameInterface game = new Game();
		Scanner in = new Scanner(System.in);
		createMap(in, game);
	}

}
