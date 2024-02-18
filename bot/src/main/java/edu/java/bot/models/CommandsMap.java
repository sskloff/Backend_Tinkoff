package edu.java.bot.models;

import edu.java.bot.commands.Command;
import edu.java.bot.commands.HelpCommand;
import edu.java.bot.commands.ListCommand;
import edu.java.bot.commands.StartCommand;
import edu.java.bot.commands.TrackCommand;
import edu.java.bot.commands.UntrackCommand;
import java.util.Map;

public class CommandsMap {

    private CommandsMap() {
    }

    public static Map<String, Command> getCommandMap() {
        return Map.ofEntries(
            Map.entry("/start", new StartCommand()),
            Map.entry("/help", new HelpCommand()),
            Map.entry("/track", new TrackCommand()),
            Map.entry("/untrack", new UntrackCommand()),
            Map.entry("/list", new ListCommand())
        );
    }
}
