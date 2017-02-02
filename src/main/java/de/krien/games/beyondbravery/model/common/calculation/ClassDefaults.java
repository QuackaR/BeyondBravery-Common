package de.krien.games.beyondbravery.model.common.calculation;

import java.util.List;
import java.util.Map;

import de.krien.games.beyondbravery.model.common.hero.AbilityScores;
import de.krien.games.beyondbravery.model.common.hero.Class;
import de.krien.games.beyondbravery.model.common.hero.Skill;

public class ClassDefaults {

	private static Map<Class, AbilityScores> defaultAbilityScores;
	private static Map<Class, List<Skill>> defaultSpells;

	public static Map<Class, AbilityScores> getDefaultAbilityScores() {
		return defaultAbilityScores;
	}

	public static void setDefaultAbilityScores(Map<Class, AbilityScores> defaultAbilityScores) {
		ClassDefaults.defaultAbilityScores = defaultAbilityScores;
	}

}
