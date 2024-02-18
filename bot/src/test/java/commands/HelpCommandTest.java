package commands;

import edu.java.bot.commands.HelpCommand;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelpCommandTest {

    @Test
    @DisplayName("Проверка имени")
    void helpCommandTest() {
        HelpCommand helpCommand = new HelpCommand();
        assertEquals("/help", helpCommand.command());
    }

    @Test
    @DisplayName("Проверка описания")
    void helpDescriptionTest() {
        HelpCommand helpCommand = new HelpCommand();
        assertEquals("Display commands", helpCommand.description());
    }

    //TODO: helpExecuteTest
}
