package commands;

import edu.java.bot.commands.UntrackCommand;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UntrackCommandTest {

    @Test
    @DisplayName("Проверка имени")
    void untrackCommandTest() {
        UntrackCommand untrackCommand = new UntrackCommand();
        assertEquals("/untrack", untrackCommand.command());
    }

    @Test
    @DisplayName("Проверка описания")
    void untrackDescriptionTest() {
        UntrackCommand untrackCommand = new UntrackCommand();
        assertEquals("Stop tracking link", untrackCommand.description());
    }

    //TODO: untrackExecuteTest
}
