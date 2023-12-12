// UniversitySystem.java

public class UniversitySystem {
    public static void main(String[] args) {
        // Create students
        Student student1 = new Student(1, "Alice", "alice@example.com");
        Student student2 = new Student(2, "Bob", "bob@example.com");

        // Create courses
        Course course1 = new Course(101, "Java Programming", 3);
        Course course2 = new Course(102, "Database Management", 4);

        // Perform registrations
        Registration registration1 = new Registration(1001, student1, course1);
        Registration registration2 = new Registration(1002, student2, course2);

        // Display information
        System.out.println("Registration Information:");
        registration1.displayInfo();
        System.out.println();
        registration2.displayInfo();
    }
}
