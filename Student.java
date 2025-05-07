public class Student {
    String name;
    int age;
    String dob;

    Student(String name, int age, String dob) {
        this.name = name;
        this.age = age;
        this.dob = dob;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Date of Birth: " + dob);
    }

    public static void main(String[] args) {
        Student s = new Student("Arya", 19, "24-05-2004");
        s.display();
    }
}