package kata01;

import java.util.Date;

public class Kata01{

    public static void main(String[] args) {
        Person person = new Person("Blas", new Date(49, 8, 24));
        System.out.println(person.getName() + " tiene " + person.getAge());
    }

}
