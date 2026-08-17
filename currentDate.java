import java.time.LocalDate;

public class currentDate {

    public static void main(String[] args) {

        LocalDate date = LocalDate.parse("2026-07-09");

        LocalDate updatedDate = date.withDayOfYear(1);

        System.out.println(updatedDate);
    }
}