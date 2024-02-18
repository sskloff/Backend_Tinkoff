package edu.java.bot.commands;

import com.pengrad.telegrambot.model.Update;
import org.springframework.stereotype.Component;

@Component("listCommandBean")
public class ListCommand implements Command {

    @Override
    public String command() {
        return "/list";
    }

    @Override
    public String description() {
        return "Display tracked links";
    }

    @Override
    public String execute(Update update) {
        //TODO: Display tracked links
        return "List of tracking links is empty";
    }
}
