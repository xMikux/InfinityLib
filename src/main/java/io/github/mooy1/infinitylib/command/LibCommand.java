package io.github.mooy1.infinitylib.command;

import lombok.Getter;
import org.bukkit.command.CommandSender;

import javax.annotation.Nonnull;
import java.util.List;

@Getter
public abstract class LibCommand {
    
    private final boolean op;
    private final String name;
    private final String description;
    
    public LibCommand(@Nonnull String name, @Nonnull String description, boolean op) {
        this.name = name;
        this.description = description;
        this.op = op;
    }

    public abstract void onExecute(@Nonnull CommandSender sender, @Nonnull String[] args);

    @Nonnull
    public abstract List<String> onTab(@Nonnull CommandSender sender, @Nonnull String[] args);
    
}
