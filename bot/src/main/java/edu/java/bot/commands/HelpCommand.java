package edu.java.bot.commands;

import com.pengrad.telegrambot.model.Update;
import org.springframework.stereotype.Component;

@Component("helpCommandBean")
public class HelpCommand implements Command {

    @Override
    public String command() {
        return "/help";
    }

    @Override
    public String description() {
        return "Display commands";
    }

    @Override
    public String execute(Update update) {
        //TODO: Display commands
        return null;
    }
}
