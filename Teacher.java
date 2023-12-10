import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {
    private int teacherId;
    private List<Course> coursesTaught;

    public Teacher(int teacherId, String name, int age, String gender) {
        super(name, age, gender);
        this.teacherId = teacherId;
        this.coursesTaught = new ArrayList<>();
    }

    public void assignCourse(Course course) {
        coursesTaught.add(course);
        course.setTeacher(this);
    }

    public List<Course> displayCoursesTaught() {
        return coursesTaught;
    }
}
