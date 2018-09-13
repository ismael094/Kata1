package kata1;
import java.util.Date;

public class Person {
    private String name;
    private Date birthdate;
    
    public Person(String name, Date birthdate) {
        this.name = name;
        this.birthdate = birthdate;     
    }
    
    public String getName() {
        return name;
    }
    
    public Date getBirthdate() {
        return birthdate;
    }
    
    public int getAge() {
        return (int) ((new Date().getTime() - birthdate.getTime())/31553700000L);
    }
}
