package edu.java.bot.services;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.model.request.ParseMode;
import com.pengrad.telegrambot.request.SendMessage;
import edu.java.bot.commands.Command;
import edu.java.bot.models.CommandsMap;
import java.util.Map;
import org.springframework.stereotype.Component;

@Component
public class ResponseService {
    private final TelegramBot telegramBot;
    private final Map<String, Command> commandMap;

    public ResponseService(TelegramBot telegramBot) {
        this.telegramBot = telegramBot;
        this.commandMap = CommandsMap.getCommandMap();
    }

    public void sendResponse(SendMessage message) {
        telegramBot.execute(message.parseMode(ParseMode.Markdown));
    }

    public String createResponse(Update update) {
        String message = update.message().text();
        Command command = commandMap.get(message);
        if (command == null) {
            return "There is no such command";
        }
        return command.execute(update);
    }
}
