package de.krien.games.beyondbravery.model.common.hero;

public enum Class {

	BARBARIAN("Barbarian"),
	BARD("Bard"),
	CLERIC("Cleric"),
	DRUID("Druid"),
	FIGHTER("Fighter"),
	MONK("Monk"),
	PALADIN("Paladin"),
	RANGER("Ranger"),
	ROGUE("Rogue"),
	SORCERER("Sorcerer"),
	WIZARD("Wizard");
	
	private String name;

	private Class(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
