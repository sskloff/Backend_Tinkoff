package commands;

import edu.java.bot.commands.StartCommand;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StartCommandTest {

    @Test
    @DisplayName("Проверка имени")
    void startCommandTest() {
        StartCommand startCommand = new StartCommand();
        assertEquals("/start", startCommand.command());
    }

    @Test
    @DisplayName("Проверка описания")
    void startDescriptionTest() {
        StartCommand startCommand = new StartCommand();
        assertEquals("Register a user", startCommand.description());
    }

    //TODO: startExecuteTest
}
