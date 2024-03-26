import java.text.ParseException;

public class EmployeeDetails extends Person {
    private int empId;
    private double salary;

    public EmployeeDetails(String name, String dob, int empId, double salary) throws ParseException {
        super(name, dob);
        this.empId = empId;
        this.salary = salary;
    }

    public void displayEmployeeDetails() {
        displayPersonDetails();
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: $" + salary);
    }

    public static void main(String[] args) throws ParseException {
        // Create an EmployeeDetails object and display details
        EmployeeDetails employee = new EmployeeDetails("John Doe", "20-05-1990", 12345, 50000);
        employee.displayEmployeeDetails();
    }
}
