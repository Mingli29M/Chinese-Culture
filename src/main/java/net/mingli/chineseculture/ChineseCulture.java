package net.mingli.chineseculture;

import net.fabricmc.api.ModInitializer;

import net.mingli.chineseculture.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChineseCulture implements ModInitializer {
	public static final String MOD_ID = "chinese_culture";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}