public class Main {
    public static void main(String[] args) {

        Employee[] employee = new Employee[10];

        employee[0] = new Employee("Лугов", "Виталий", "Анатольевич", 1, 40000);
        employee[1] = new Employee("Иванов", "Максим", "Вячеславович", 2, 42000);
        employee[2] = new Employee("Кержакова", "Анна", "Сергеевна", 1, 19000);
        employee[3] = new Employee("Смирнов", "Федор", "Юрьевич", 3, 99000);
        employee[4] = new Employee("Ковалев", "Никита", "Вячеславович", 4, 54000);
        employee[5] = new Employee("Луст", "Тимофей", "Игоревич", 5, 67000);
        employee[6] = new Employee("Гришина", "Анна", "Евгеньевна", 3, 32000);
        employee[7] = new Employee("Миронов", "Валерий", "Алексеевич", 5, 33000);
        employee[8] = new Employee("Барон", "Юрий", "Валентинович", 4, 98000);
        employee[9] = new Employee("Маник", "Вера", "Карповна", 5, 87000);

        for (Employee value : employee) {
            System.out.println(value);
        }

        ToolEmployee.maxSalaryOfEmployee(employee); // Метод на определение максимальной ЗП
        ToolEmployee.minSalaryOfEmployee(employee); // Метод на определение минимальной ЗП
        ToolEmployee.totalSalaryPaiments(employee); // Метод на затраты на ЗП
        ToolEmployee.averageSalaryPaiments(employee); // Метод на серднюю ЗП
        ToolEmployee.nameSurnamePatronymic(employee); // Метод на вывод ФИО сотрудников

        // Повышенная сложность

        ToolEmployee.increaseSalary(employee, 10); // Индексация зарплаты
        ToolEmployee.maxSalaryOfEmployeeInSection(employee, 5); // Поиск максимальной ЗП по отделу
        ToolEmployee.minSalaryOfEmployeeInSection(employee,1); // Поиск минимальной ЗП по отделу
        ToolEmployee.averageSalaryInSection(employee, 1); // Средняя ЗП по отделу
        ToolEmployee.increaseSalaryInSection(employee, 5, 6.5); // Индексация зарплаты по отделу
        ToolEmployee.printEmployeeInSection(employee, 5); // Список сотрудников по отделам
        ToolEmployee.employeeSalaryLessThanNumber(employee, 50000); // Список сотрудников с ЗП меньше искомой
        ToolEmployee.employeeSalaryMoreThanNumber(employee, 70000); // Список сотрудников с ЗП выше искомой
    }
}

