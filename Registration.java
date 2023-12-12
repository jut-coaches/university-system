// Registration.java

public class Registration {
    private int registrationId;
    private Student student;
    private Course course;

    public Registration(int registrationId, Student student, Course course) {
        this.registrationId = registrationId;
        this.student = student;
        this.course = course;
    }

    public void displayInfo() {
        System.out.println("Registration ID: " + registrationId);
        student.displayInfo();
        course.displayInfo();
    }
}
