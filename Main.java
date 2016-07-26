import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {


        Calendar date;
        date = GregorianCalendar.getInstance();
        date.set(1964,6,25);

        Person miPerson = new Person("Enrique",date);
        System.out.println(miPerson.getName() +  " tiene " + miPerson.getAge() + " años.");

        date.set (1964,6,26);
        Person miPerson1 = new Person("Ana",date);
        System.out.println(miPerson1.getName() +  " tiene " + miPerson1.getAge() + " años.");

    }


}
