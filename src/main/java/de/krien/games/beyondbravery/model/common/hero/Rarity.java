package de.krien.games.beyondbravery.model.common.hero;

public enum Rarity {

	COMMON("Common"), 
	UNCOMMON("Uncommon"), 
	RARE("Rare"), 
	EPIC("Epic"), 
	LEGENDARY("Legendary");

	private String name;

	private Rarity(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
