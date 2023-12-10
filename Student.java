import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private int studentId;
    private List<Course> courses;

    public Student(int studentId, String name, int age, String gender) {
        super(name, age, gender);
        this.studentId = studentId;
        this.courses = new ArrayList<>();
    }

    public void registerCourse(Course course) {
        courses.add(course);
        course.addStudent(this);
    }

    public void deregisterCourse(Course course) {
        if (courses.contains(course)) {
            courses.remove(course);
            course.removeStudent(this);
        }
    }

    public List<String> displayCourses() {
        List<String> courseNames = new ArrayList<>();
        for (Course course : courses) {
            courseNames.add(course.getName());
        }
        return courseNames;
    }
}