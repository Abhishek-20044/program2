public class Employee {
    String name;
    int id;
    double salary;
    int phonenum;
    String address;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.phonenum= phonenum;
        this.address= address;
    }

    public void displayInfo() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
        System.out.println("Employee phonenum: "+phonenum);
        System.out.println("Employee Adress: "+address);
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("xyz", 101, 50000.0, 12345678798, hubli);
        emp1.displayInfo();
    }
}
    

