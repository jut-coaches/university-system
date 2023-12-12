// Course.java

public class Course {
    private int courseId;
    private String name;
    private int credits;

    public Course(int courseId, String name, int credits) {
        this.courseId = courseId;
        this.name = name;
        this.credits = credits;
    }

    public void displayInfo() {
        System.out.println("Course ID: " + courseId);
        System.out.println("Name: " + name);
        System.out.println("Credits: " + credits);
    }
}
