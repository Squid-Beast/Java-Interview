package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class EmployeeDetails {
    private int id;
    private String name;
    private double salary;

    public EmployeeDetails(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee: id = " + id + ", name = " + name + ", salary = " + salary;
    }
}

public class EmployeeSalary {
    public static void main(String[] args) {
        List<EmployeeDetails> employeeList = Arrays.asList(
            new EmployeeDetails(101, "Peter", 25000),
            new EmployeeDetails(201, "Tony", 30000),
            new EmployeeDetails(301, "Joe Goldberg", 28000),
            new EmployeeDetails(401, "Davis", 35000),
            new EmployeeDetails(501, "Krishna", 33000)
        );

        employeeList.stream()
            .filter(employee -> employee.getSalary() > 25000)
            .sorted(Comparator.comparing(EmployeeDetails::getSalary).reversed())
            .forEach(System.out::println);
    }
}
