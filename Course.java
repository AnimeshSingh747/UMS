import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Course {
    private String courseCode;
    private String name;
    private List<Student> students;
    private Teacher teacher;

    public Course(String courseCode, String name) {
        this.courseCode = courseCode;
        this.name = name;
        this.students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<String> getStudents() {
        List<String> studentNames = new ArrayList<>();
        for (Student student : students) {
            studentNames.add(student.name);
        }
        return studentNames;
    }

    public Exam conductExam(String examName) {
        return new Exam(examName, students);
    }

    public Map<String, Integer> generateReport(Exam exam) {
        Map<String, Integer> report = new HashMap<>();
        for (Student student : students) {
            int marks = exam.getMarks(student);
            report.put(student.name, marks);
        }
        return report;
    }
}
