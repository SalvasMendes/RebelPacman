package map;

import rebels.*;
import stormtroopers.*;

public class mapSpot implements mapSpotInterface{

	private boolean weapon;
	private boolean hasHero;
	private boolean wall;
	private HeroInterface hero;
	private boolean hasTrooper;
	private StormtrooperInterface trooper;
	private char mapRepresentation;

	public mapSpot(boolean weapon, boolean wall, boolean hasTrooper, char mapRepresentation){
		this.weapon = weapon;
		this.hasTrooper = hasTrooper;
		this.mapRepresentation = mapRepresentation;
	}
	
	public mapSpot(boolean weapon, boolean wall, boolean hasTrooper, StormtrooperInterface trooper, char mapRepresentation){
		this.weapon = weapon;
		this.hasTrooper = hasTrooper;
		this.trooper = trooper;
		this.mapRepresentation = mapRepresentation;
	}
	
	public boolean isEmpty(){
		return !(hasHero && hasTrooper && weapon);
	}
	
	public boolean isWall(){
		return (wall);
	}
	
	public void insertTrooper(StormtrooperInterface trooper){
		this.trooper = trooper;
	}
	
	public void insertHero(HeroInterface hero){
		this.hero = hero;
	}
	
	public void removeTrooper(){
		trooper = null;
	}
	
	public void removeHero(){
		hero = null;
	}

	public char getMapRepresentation() {
		return mapRepresentation;
	}
	
}
