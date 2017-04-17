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
	
	
	public mapSpot(boolean weapon, boolean wall, boolean hasTrooper){
		this.weapon = weapon;
		this.hasTrooper = hasTrooper;
	}
	
	public mapSpot(boolean weapon, boolean wall, boolean hasTrooper, StormtrooperInterface trooper){
		this.weapon = weapon;
		this.hasTrooper = hasTrooper;
		this.trooper = trooper;
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
	
	
}
