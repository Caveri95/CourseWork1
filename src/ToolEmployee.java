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
    public static void averageSalaryPaiments(Employee[] employee) {
        double total = 0;
        for (Employee value : employee) {
            if (value != null) {
                total = total + value.getSalary();
            }
        }
        double average = total / employee.length;
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
}
