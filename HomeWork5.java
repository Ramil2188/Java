/**
Java 1. HomeWork 5
@author Ramil'
@version 30.01.2022
*/

class HomeWork5 {

    public static void main (String[] args) {
        Employee[] employees = {
            new Employee("Ivanov Ivan","Enginer",
                "iivanov@mail.com", "2312312", 30000,30),
            new Employee("Petrov Petr","Lead Engineer",
                "ppetrov@mail.com", "2365113", 42000, 39),
            new Employee("Vasilev Vasil", "Head of Deparment",
                "vvasilev@mail.com","2365001", 55000, 55),
            new Employee("Sidorov Sidor","Assistant",
                "ssidorov@mail.com", "2365223", 25000, 42),
            new Employee("Sergeev Sergey","Trainee","ssergeev@mail.com","2365113", 15000, 25)
    };

        for (Employee employee : employees) {
            if (employee.getAge() > 40) {
                System.out.println(employee);
            }
        }
    }
}

class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;


    public Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return (name +
            "\n| Position: " + position +
            "\n| Email: " + email +
            "\n| Phone: " +phone +
            "\n| Salary: " + salary+
            "\n|  " + age);
            
    }
}