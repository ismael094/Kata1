package kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class Kata1 {

    public static void main(String[] args) {
        Calendar p;
        p = GregorianCalendar.getInstance();
        p.set(1949,9,24);
        Person p1 = new Person("Ismael", p);
        System.out.println(p1.getName() + " tiene " + p1.getAge() + " años");
    }
    
}
