import java.util.Objects;
public class Employee {

    private final String employeeName;
    private final String employeeSurname;
    private final String employeePatronymic;
    private int section;
    private int salary;
    private final int id;
    private static int count = 1;

    public Employee(String employeeSurname, String employeeName, String employeePatronymic, int section, int salary) {
        this.id = count++;
        this.employeeName = employeeName;
        this.employeeSurname = employeeSurname;
        this.employeePatronymic = employeePatronymic;
        this.section = section;
        this.salary = salary;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public int getId() {
        return id;
    }
    public String getEmployeeSurname() {
        return employeeSurname;
    }

    public String getEmployeePatronymic() {
        return employeePatronymic;
    }

    public int getSection() {
        return section;
    }
    public int getSalary() {
        return salary;
    }
    public void setSection(int section) {
        this.section = section;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return  "Фамилия - " + employeeSurname +
                ", имя - " + employeeName +
                ", отчество - " + employeePatronymic +
                ", номер отдела - " + section +
                ", заработная плата - " + salary +
                ", идентификационный номер - " + id;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return  id == employee.id;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
