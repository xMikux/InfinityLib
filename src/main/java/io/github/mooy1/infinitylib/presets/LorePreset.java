package io.github.mooy1.infinitylib.presets;

import java.text.DecimalFormat;

import javax.annotation.Nonnull;

import lombok.experimental.UtilityClass;

import io.github.thebusybiscuit.slimefun4.implementation.SlimefunPlugin;

/**
 * Collection of utils for building item lore
 *
 * @author Mooy1
 */
@UtilityClass
public final class LorePreset {

    private static final DecimalFormat FORMAT = new DecimalFormat("###,###,###,###,###,###.#");
    private static final double TPS = 20D / SlimefunPlugin.getTickerTask().getTickRate();

    @Nonnull
    public static String energyPerSecond(int energy) {
        return "&8\u21E8 &e\u26A1 &7" + formatEnergy(energy) + " J/s";
    }

    @Nonnull
    public static String energyBuffer(int energy) {
        return "&8\u21E8 &e\u26A1 &7" + format(energy) + " J 緩衝";
    }

    @Nonnull
    public static String energy(int energy) {
        return "&8\u21E8 &e\u26A1 &7" + format(energy) + " J ";
    }

    @Nonnull
    public static String speed(int speed) {
        return "&8\u21E8 &b\u26A1 &7速度: &b" + speed + 'x';
    }

    @Nonnull
    public static String formatEnergy(int energy) {
        return FORMAT.format(energy * TPS);
    }

    @Nonnull
    public static String format(double number) {
        return FORMAT.format(number);
    }

}
