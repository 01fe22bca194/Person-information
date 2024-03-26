import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
    private String name;
    private Date dob;

    public Person(String name, String dob) throws ParseException {
        this.name = name;
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        this.dob = sdf.parse(dob);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        Date currentDate = new Date();
        long diffInMillies = Math.abs(currentDate.getTime() - dob.getTime());
        long diff = diffInMillies / (24 * 60 * 60 * 1000);
        return (int) (diff / 365);
    }

    public void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + getAge());
    }

    public static void main(String[] args) throws ParseException {
        // Create a Person object and display details
        Person person = new Person("abc", "20-05-1990");
        person.displayPersonDetails();
    }
}
