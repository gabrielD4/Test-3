import org.junit.jupiter.api.Test;

import java.time.DateTimeException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testParseDate() {
        String dateString = "2023-03-01T13:00:00Z";
        OffsetDateTime dateTime = Main.parseDate(dateString);
        assertEquals(OffsetDateTime.parse(dateString), dateTime);
    }

    @Test
    void testParseInvalidDate() {
        String dateString = "Invalid Date";
        assertThrows(DateTimeException.class, () -> Main.parseDate(dateString));
    }

    @Test
    void testFormatLongDate() {
        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String formatInLongDate = Main.formatDateInFull(dateTime);
        assertEquals(dateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)), formatInLongDate);
    }

}