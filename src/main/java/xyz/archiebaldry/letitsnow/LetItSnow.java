package xyz.archiebaldry.letitsnow;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModificationContext;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.ModificationPhase;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.dimension.DimensionOptions;

public class LetItSnow implements ModInitializer {

    public static final String MOD_ID = "letitsnow";

    @Override
    public void onInitialize() {
        BiomeModifications.create(new Identifier(MOD_ID, "let_it_snow")).add(ModificationPhase.REPLACEMENTS, context -> context.canGenerateIn(DimensionOptions.OVERWORLD), context -> {
            final BiomeModificationContext.WeatherContext weather = context.getWeather();

            weather.setPrecipitation(Biome.Precipitation.SNOW);
            weather.setTemperature(0F);
            weather.setTemperatureModifier(Biome.TemperatureModifier.NONE);
        });
    }

}
