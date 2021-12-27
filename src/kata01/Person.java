package kata01;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.time.*;

public class Person {

    private final String name;
    private final LocalDate date;

    public Person(String name, LocalDate date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getAge(LocalDate dateStart, LocalDate dateEnd) {
        return Period.between(dateStart, dateEnd).getYears();
    }
}
