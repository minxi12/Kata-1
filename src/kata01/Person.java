package kata01;

import java.util.Date;

public class Person {

    private final String name;
    private final Date brithday;

    public String getName() {
        return name;
    }

    public Date getBrithday() {
        return brithday;
    }

    public Person(String name, Date brithday) {
        this.name = name;
        this.brithday = brithday;
    }

    public int getAge() {
        return (int) ((new Date().getTime() - brithday.getTime()) / 31536000000L);
    }
}
