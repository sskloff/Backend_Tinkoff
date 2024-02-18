package edu.java.bot.commands;

import com.pengrad.telegrambot.model.Update;
import org.springframework.stereotype.Component;

@Component("untrackCommandBean")
public class UntrackCommand implements Command {

    @Override
    public String command() {
        return "/untrack";
    }

    @Override
    public String description() {
        return "Stop tracking link";
    }

    @Override
    public String execute(Update update) {
        //TODO: Stop tracking link
        return "The link is no longer tracked";
    }
}
