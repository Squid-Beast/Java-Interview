package streams;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class HireDate{
    private int id;
    private String name;
    private LocalDate hireDate;

    public HireDate(int id, String name, LocalDate hireDate) {
        this.id = id;
        this.name = name;
        this.hireDate = hireDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee: id = " + id + ", name = " + name + ", hireDate = " + hireDate.getYear();
    }
    
}
public class EmployeeHireDate {
    public static void main(String[] args) {
        List<HireDate> employeeHireDateList = Arrays.asList(
            new HireDate(101, "Peter Parker", LocalDate.of(2015, 5, 12)),
            new HireDate(201, "Tony Stark", LocalDate.of(2016, 6, 15)),
            new HireDate(301, "Joe Goldberg", LocalDate.of(2017, 7, 18)),
            new HireDate(401, "Tom Hardy", LocalDate.of(2018, 8, 21)),
            new HireDate(501, "Mike", LocalDate.of(2019, 9, 24))
        );

        employeeHireDateList.stream()
            .filter(employee -> employee.getHireDate().getYear() > 2016)
            .sorted(Comparator.comparing(HireDate::getHireDate))
            .forEach(System.out::println);
    }
}
