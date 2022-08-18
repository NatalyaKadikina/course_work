package ru.skypro;

public class Main {
    private static int count = 1;
    private static int indexing = 25;
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

        IndexingSalary(employees, indexing);
        GetMinSalaryDepartment(employees, 2);
        GetMaxSalaryDepartment(employees, 2);
        System.out.println(GetAllSalariesDepartment(employees, 2));
        GetAvgSalaryDepartment(employees, 2);
        IndexingSalaryDepartment(employees, 2, indexing);
        GetFIODepartment(employees, 2);
        System.out.println();
        GetMinSalaryEmployee(employees, 50000);
        System.out.println();
        GetMaxSalaryEmployee(employees, 60000);
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

    static  void IndexingSalary(Employee[] employees, int indexing) {
        for(Employee emp : employees) {
            int newSalary = emp.getSalary() + Math.round(emp.getSalary() * indexing / 100);
            emp.setSalary(newSalary);
        }
    }

    static void GetMinSalaryDepartment(Employee[] employees, int department) {
        int min = 0;
        for(Employee emp : employees) {
            if(emp.getDepartmentNumber() == department) {
                min = emp.getSalary();
                break;
            }
        }
        for(Employee emp : employees) {
            if(emp.getDepartmentNumber() == department) {
                if (min > emp.getSalary())
                    min = emp.getSalary();
            }
        }
        System.out.println(min);
    }

    static void GetMaxSalaryDepartment(Employee[] employees, int department) {
        int max = 0;
        for(Employee emp : employees) {
            if(emp.getDepartmentNumber() == department) {
                max = emp.getSalary();
                break;
            }
        }
        for(Employee emp : employees) {
            if(emp.getDepartmentNumber() == department) {
                if (max < emp.getSalary())
                    max = emp.getSalary();
            }
        }
        System.out.println(max);
    }

    static int GetAllSalariesDepartment(Employee[] employees, int department){
        int all = 0;
        for(Employee emp : employees) {
            if(emp.getDepartmentNumber() == department)
                all += emp.getSalary();
        }
        return all;
    }

    static void GetAvgSalaryDepartment(Employee[] employees, int department){
        int count = 0;
        for(Employee emp : employees)
            if(emp.getDepartmentNumber() == department)
                count++;
        int avg = GetAllSalariesDepartment(employees, department) / count;
        System.out.println(avg);
    }

    static  void IndexingSalaryDepartment(Employee[] employees, int department, int indexing) {
        for(Employee emp : employees) {
            if(emp.getDepartmentNumber() == department) {
                int newSalary = emp.getSalary() + Math.round(emp.getSalary() * indexing / 100);
                emp.setSalary(newSalary);
            }
        }
    }

    static void GetFIODepartment(Employee[] employees, int department){
        for(Employee emp : employees)
            if(emp.getDepartmentNumber() == department)
                System.out.println(emp.getId() + " " + emp.getFirstName() + " " + emp.getLastName() + " " + emp.getPatronymic() + " " + emp.getSalary());
    }

    static void GetMinSalaryEmployee(Employee[] employees, int salary){
        for(Employee emp : employees)
            if(salary > emp.getSalary()) {
                System.out.println(emp.getId() + " " + emp.getFirstName() + " " + emp.getLastName() + " " + emp.getPatronymic() + " " + emp.getSalary());
            }
    }

    static void GetMaxSalaryEmployee(Employee[] employees, int salary){
        for(Employee emp : employees)
            if(salary < emp.getSalary()) {
                System.out.println(emp.getId() + " " + emp.getFirstName() + " " + emp.getLastName() + " " + emp.getPatronymic() + " " + emp.getSalary());
            }
    }
}
