package edu.java.bot.commands;

import com.pengrad.telegrambot.model.Update;
import org.springframework.stereotype.Component;

@Component("startCommandBean")
public class StartCommand implements Command {

    @Override
    public String command() {
        return "/start";
    }

    @Override
    public String description() {
        return "Register a user";
    }

    @Override
    public String execute(Update update) {
        //TODO: Register a user
        return "Registration is completed";
    }
}
