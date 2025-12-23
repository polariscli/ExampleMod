package org.afterlike.examplemod;

import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ExampleMod {
	private static final @Nullable ExampleMod instance = new ExampleMod();
	private static final @NotNull String VERSION = org.afterlike.examplemod.BuildConstants.VERSION;

	public ExampleMod() {
	}

    public static @NotNull ExampleMod get() {
        return Objects.requireNonNull(instance);
    }

	public @NotNull String getVersion() {
		return VERSION;
	}
}