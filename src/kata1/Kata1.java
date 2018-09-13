package kata1;

import java.util.Date;


public class Kata1 {

    public static void main(String[] args) {
        Person p1 = new Person("Ismael", new Date(49,8,24));
        System.out.println(p1.getName() + " tiene " + p1.getAge() + " años");
    }
    
}
