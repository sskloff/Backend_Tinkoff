package commands;

import edu.java.bot.commands.TrackCommand;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrackCommandTest {

    @Test
    @DisplayName("Проверка имени")
    void trackCommandTest() {
        TrackCommand trackCommand = new TrackCommand();
        assertEquals("/track", trackCommand.command());
    }

    @Test
    @DisplayName("Проверка описания")
    void trackDescriptionTest() {
        TrackCommand trackCommand = new TrackCommand();
        assertEquals("Start tracking link", trackCommand.description());
    }

    //TODO: trackExecuteTest
}
