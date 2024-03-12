import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
        String dateString = "2023-03-01T13:00:00Z";
        OffsetDateTime dateTime = parseDate(dateString);
        String longFormattedDate = formatDateInFull(dateTime);
        System.out.println(longFormattedDate);
    }

    public static String formatDateInFull(OffsetDateTime dateTime) {
        return dateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
    }

    public static OffsetDateTime parseDate(String date) {
        return OffsetDateTime.parse(date);
    }
}