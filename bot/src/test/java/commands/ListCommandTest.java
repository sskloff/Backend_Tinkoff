package commands;

import edu.java.bot.commands.ListCommand;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListCommandTest {

    @Test
    @DisplayName("Проверка имени")
    void listCommandTest() {
        ListCommand listCommand = new ListCommand();
        assertEquals("/list", listCommand.command());
    }

    @Test
    @DisplayName("Проверка описания")
    void listDescriptionTest() {
        ListCommand listCommand = new ListCommand();
        assertEquals("Display tracked links", listCommand.description());
    }

    //TODO: listExecuteTest
}
