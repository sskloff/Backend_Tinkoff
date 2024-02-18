package edu.java.bot.services;

import com.pengrad.telegrambot.UpdatesListener;
import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.request.SendMessage;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class MessageHandleService implements UpdatesListener  {
    private final ResponseService responseService;

    public MessageHandleService(ResponseService responseService) {
        this.responseService = responseService;
    }

    @Override
    public int process(List<Update> list) {
        for (Update update : list) {
            if (update.message() != null && update.message().text() != null) {
                SendMessage message = new SendMessage(
                    update.message().chat().id(), responseService.createResponse(update));
                responseService.sendResponse(message);
            }
        }
        return UpdatesListener.CONFIRMED_UPDATES_ALL;
    }
}
