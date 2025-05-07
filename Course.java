public class Course {
    int sem;
    int marks;
    String sub;

    Course(int sem, int marks, String sub) {
        this.sem = sem;
        this.marks = marks;
        this.sub = sub;
    }

    void display() {
        System.out.println("Semester: " + sem);
        System.out.println("Marks: " + marks);
        System.out.println("Subject: " + sub);
    }

    public static void main(String[] args) {
        Course c = new Course(1, 25, "BDA");
        Course c1 = new Course(1, 30, "DevOps");

        c.display();
        c1.display();
    }
}