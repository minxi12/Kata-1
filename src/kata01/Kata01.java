package kata01;

import java.time.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Kata01 {

    public static void main(String[] args) {
        LocalDate ahora = LocalDate.now();
        LocalDate date = LocalDate.parse("1949-09-24"); //error: 1949-9-24
        Person person = new Person("Blas", date);
        System.out.println(person.getName() + "tiene " + person.getAge(date, ahora) + " años");

    }

}
