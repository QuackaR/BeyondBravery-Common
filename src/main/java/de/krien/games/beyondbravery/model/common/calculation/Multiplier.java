package de.krien.games.beyondbravery.model.common.calculation;

import java.math.BigDecimal;
import java.util.Map;

import de.krien.games.beyondbravery.model.common.hero.Class;
import de.krien.games.beyondbravery.model.common.hero.Rarity;

public class Multiplier {

	private static Map<Class, BigDecimal> levelMultiplier;
	private static Map<Class, Rarity> rarityMultiplier;
	private static Map<Class, Integer> starMultiplier;

	public static Map<Class, BigDecimal> getLevelMultiplier() {
		return levelMultiplier;
	}

	public static void setLevelMultiplier(Map<Class, BigDecimal> levelMultiplier) {
		Multiplier.levelMultiplier = levelMultiplier;
	}

	public static Map<Class, Rarity> getRarityMultiplier() {
		return rarityMultiplier;
	}

	public static void setRarityMultiplier(Map<Class, Rarity> rarityMultiplier) {
		Multiplier.rarityMultiplier = rarityMultiplier;
	}

	public static Map<Class, Integer> getStarMultiplier() {
		return starMultiplier;
	}

	public static void setStarMultiplier(Map<Class, Integer> starMultiplier) {
		Multiplier.starMultiplier = starMultiplier;
	}

}
