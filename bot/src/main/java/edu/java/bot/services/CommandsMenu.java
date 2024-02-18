package edu.java.bot.services;

import com.pengrad.telegrambot.model.BotCommand;
import com.pengrad.telegrambot.request.SetMyCommands;
import edu.java.bot.commands.Command;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class CommandsMenu {
    private final List<Command> commandlist;

    public CommandsMenu(List<Command> commandlist) {
        this.commandlist = commandlist;
    }

    public SetMyCommands getMenu() {
        List<BotCommand> botCommands = commandlist.stream().map(
            command -> new BotCommand(command.command(), command.description())).toList();
        return new SetMyCommands(botCommands.toArray(new BotCommand[0]));
    }
}
