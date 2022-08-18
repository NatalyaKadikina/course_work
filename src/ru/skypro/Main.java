package ru.skypro;

public class Main {
    static int count = 1;

    public static void main(String[] args) {
        Employee[] employees = new Employee[]
        {
            new Employee(count++,"Ivanov", "Ivan", "Ivanovich", 1, 45000),
            new Employee(count++,"Ivanov2", "Ivan2", "Ivanovich2", 2, 55000),
            new Employee(count++,"Ivanov3", "Ivan3", "Ivanovich3", 3, 65000),
            new Employee(count++,"Ivanov4", "Ivan4", "Ivanovich4", 4, 75000),
            new Employee(count++,"Ivanov5", "Ivan5", "Ivanovich5", 5, 85000),
            new Employee(count++,"Ivanov6", "Ivan6", "Ivanovich6", 1, 40000),
            new Employee(count++,"Ivanov7", "Ivan7", "Ivanovich7", 2, 50000),
            new Employee(count++,"Ivanov8", "Ivan8", "Ivanovich8", 3, 60000),
            new Employee(count++,"Ivanov9", "Ivan9", "Ivanovich9", 4, 70000),
            new Employee(count++,"Ivanov10", "Ivan10", "Ivanovich10", 5, 80000)
        };

        GetEmployees(employees);
        System.out.println(GetAllSalaries(employees));
        GetMinSalary(employees);
        GetMaxSalary(employees);
        GetAvgSalary(employees);
        GetFIO(employees);
    }

    static void GetEmployees(Employee[] employees){
        for(Employee emp : employees)
            System.out.println(emp);
    }

    static int GetAllSalaries(Employee[] employees){
        int all = 0;
        for(Employee emp : employees)
            all += emp.getSalary();
        return all;
    }

    static void GetMinSalary(Employee[] employees){
        int min = employees[employees.length - 1].getSalary();
        for(Employee emp : employees)
            if(min > emp.getSalary())
                min = emp.getSalary();
        System.out.println(min);
    }

    static void GetMaxSalary(Employee[] employees){
        int max = employees[employees.length - 1].getSalary();
        for(Employee emp : employees)
            if(max < emp.getSalary())
                max = emp.getSalary();
        System.out.println(max);
    }

    static void GetAvgSalary(Employee[] employees){
        int avg = GetAllSalaries(employees) / employees.length;
        System.out.println(avg);
    }

    static void GetFIO(Employee[] employees){
        for(Employee emp : employees)
            System.out.println(emp.getFirstName() + " " + emp.getLastName() + " " + emp.getPatronymic());
    }
}
