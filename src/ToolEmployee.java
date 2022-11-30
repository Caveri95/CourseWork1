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
        for (Employee value : employee) {
            if (value != null) {
                System.out.println("После индексации на " + persent + "%, зарплата сотрудника " +
                        value.getEmployeeSurname() + " " +
                        value.getEmployeeName() + " " +
                        value.getEmployeePatronymic() + " составила: " +
                        (value.getSalary() * persent / 100 + value.getSalary()));
            }
        }
    }
    public static void maxSalaryOfEmployeeInSection(Employee[] employee, int section) {
        int maxSalary = 0;
        Employee employeeMaxSalary = null;
        for (Employee item : employee) {
            if (item != null && item.getSection() == section && item.getSalary() > maxSalary ) {
                maxSalary = item.getSalary();
                employeeMaxSalary = item;
            }
        }
        System.out.println("Максимальная зарплата по " + section + " отделу у сотрудника: " + employeeMaxSalary);
    }
    public static void minSalaryOfEmployeeInSection(Employee[] employee, int section) {
        int minSalary = employee[0].getSalary();
        Employee employeeMinSalary = null;
        for (Employee item : employee) {
            if (item != null && item.getSection() == section && item.getSalary() < minSalary ) {
                minSalary = item.getSalary();
                employeeMinSalary = item;
            }
        }
        System.out.println("Минимальная зарплата по " + section + " отделу у сотрудника: " + employeeMinSalary);
    }
    public static void averageSalaryInSection(Employee[] employee, int section) {
        int totalSalaryInSection = 0;
        float count = 0f;
        for (Employee item : employee) {
            if (item != null && item.getSection() == section) {
                totalSalaryInSection = totalSalaryInSection + item.getSalary();
            }
        }
        for (Employee item : employee) {
            if (item != null && item.getSection() == section) {
                count++;
            }
        }
        double averageSalaryInSection = totalSalaryInSection / count ;
        System.out.printf("Среднее значение заработной платы по " + section + " отделу составляет: %.2f \n", averageSalaryInSection);
    }
    public static void increaseSalaryInSection(Employee[] employee, int section, double persent) {
        for (Employee item : employee) {
            if (item != null && item.getSection() == section) {
                System.out.println("После индексации на " + persent + "%, зарплата сотрудника " +
                        item.getSection() + " отдела " +
                        item.getEmployeeSurname() + " " +
                        item.getEmployeeName() + " " +
                        item.getEmployeePatronymic() + " составила: " + (item.getSalary() * persent / 100 + item.getSalary()));
            }
        }
    }
    public static void printEmployeeInSection(Employee[] employee, int section) {
        for (Employee item : employee) {
            if (item != null && item.getSection() == section) {
                System.out.println(
                        item.getEmployeeSurname() + " " +
                        item.getEmployeeName() + " " +
                        item.getEmployeePatronymic() + ", заработная плата составляет: " +
                        item.getSalary() + ", идентификационный номер: " + item.getId());
            }
        }
    }
    public static void employeeSalaryLessThanNumber(Employee[] employee, int salary) {
        System.out.println("Сотрудники с заработной платой меньше " + salary);
        for (Employee item : employee) {
            if (item != null && item.getSalary() < salary) {
                System.out.println(
                        "Идентификационный номер: " + item.getId() + " " +
                        item.getEmployeeSurname() + " " +
                        item.getEmployeeName() + " " +
                        item.getEmployeePatronymic() + ". Заработная плата: " +
                        item.getSalary());

            }
        }
    }
    public static void employeeSalaryMoreThanNumber(Employee[] employee, int salary) {
        System.out.println("Сотрудники с заработной платой больше " + salary);
        for (Employee item : employee) {
            if (item != null && item.getSalary() >= salary) {
                System.out.println(
                        "Идентификационный номер: " + item.getId() + " " +
                                item.getEmployeeSurname() + " " +
                                item.getEmployeeName() + " " +
                                item.getEmployeePatronymic() + ". Заработная плата: " +
                                item.getSalary());

            }
        }
    }
}
