package map;

import rebels.HeroInterface;
import stormtroopers.StormtrooperInterface;

public interface mapSpotInterface {

	boolean isEmpty();
	
	void insertTrooper(StormtrooperInterface trooper);
	
	void insertHero(HeroInterface hero);
	
	void removeTrooper();
	
	void removeHero();
	
	char getMapRepresentation();
	
}
