public class ToolEmployee {
    public static void maxSalaryOfEmployee(Employee[] employee) {
        int maxSalary = 0;
        for (Employee item : employee) {
            if (item != null) {
                if (item.getSalary() > maxSalary) {
                    maxSalary = item.getSalary();
                }
            }
        }
        for (Employee value : employee) {
            if (value != null) {
                if (maxSalary == value.getSalary()) {
                    System.out.println("Самая высокая заработная плата у сотрудника - " + value);
                }
            }
        }
    }
    public static void minSalaryOfEmployee(Employee[] employee) {
        int minSalary = employee[0].getSalary();
        for (Employee value : employee) {
            if (value != null) {
                if (minSalary > value.getSalary()) {
                    minSalary = value.getSalary();
                }
            }
        }
        for (Employee value : employee) {
            if (value != null) {
                if (minSalary == value.getSalary()) {
                    System.out.println("Самая низкая заработная плата у сотрудника - " + value);
                }
            }
        }
    }
    public static void totalSalaryPaiments(Employee[] employee) {
        int total = 0;
        for (Employee value : employee) {
            if (value != null) {
                total = total + value.getSalary();
            }
        }
        System.out.println("Сумма затрат на зарплаты сотрудникам в месяц составляет: " + total);
    }

    public static int totalEmployeeInCompany(Employee[] employee) {
        int count = 0;
        for (Employee value : employee) {
            if (value != null) {
                count++;
            }
        }
        return count;
    }
    public static void averageSalaryPaiments(Employee[] employee) {
        double total = 0;
        for (Employee value : employee) {
            if (value != null) {
                total = total + value.getSalary();
            }
        }
        double average = total / totalEmployeeInCompany(employee);
        System.out.println("Среднее значение зарплат сотрудникам в месяц составляет: " + average);
    }
    public static void nameSurnamePatronymic(Employee[] employee) {
        for (Employee value : employee) {
            if (value != null) {
                System.out.println("ФИО: " + value.getEmployeeSurname() + " " + value.getEmployeeName() + " " +
                        value.getEmployeePatronymic());
            }
        }
    }

    // Повышенная сложность

    public static void increaseSalary(Employee[] employee, int persent) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                System.out.println("После индексации на " + persent + "%, зарплата сотрудника " +
                        employee[i].getEmployeeSurname() + " " +
                        employee[i].getEmployeeName() + " " +
                        employee[i].getEmployeePatronymic() + " составила: " +
                        (employee[i].getSalary() * persent / 100 + employee[i].getSalary()));
            }
        }
    }



    public static void maxSalaryInSection(Employee[] employee, int section) {

        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSection() == section) {
                int salary = 0;
                if (employee[i].getSalary() > salary) {
                    salary = employee[i].getSalary();
                }
                System.out.println("Максимальная зарплата по " + section + " отделу составляет: " + salary);
            }
        }



    }
}
