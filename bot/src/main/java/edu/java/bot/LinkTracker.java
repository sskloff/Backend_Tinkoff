package edu.java.bot;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.UpdatesListener;
import edu.java.bot.services.CommandsMenu;
import org.springframework.stereotype.Component;

@Component
public class LinkTracker {
    private final CommandsMenu commandsMenu;
    private final UpdatesListener updatesListener;
    private final TelegramBot telegramBot;

    public LinkTracker(CommandsMenu commandsMenu, UpdatesListener updatesListener, TelegramBot telegramBot) {
        this.commandsMenu = commandsMenu;
        this.updatesListener = updatesListener;
        this.telegramBot = telegramBot;
    }

    public void start() {
        telegramBot.setUpdatesListener(updatesListener);
        telegramBot.execute(commandsMenu.getMenu());
    }
}
