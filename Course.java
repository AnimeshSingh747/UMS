import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Course {
    private String courseCode;
    private String name;
    private List<Student> students;
    private Teacher teacher;
    private Map<String, Integer> enrollmentCount;
    
    public Course(String courseCode, String name) {
        this.courseCode = courseCode;
        this.name = name;
        this.students = new ArrayList<>();
        this.enrollmentCount = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student student) {
        students.add(student);
        enrollmentCount.put(name, enrollmentCount.getOrDefault(name, 0) + 1);
    }

    public void removeStudent(Student student) {
        students.remove(student);
        enrollmentCount.put(name, enrollmentCount.getOrDefault(name, 0) - 1);
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

    public Map<String, Integer> getEnrollmentCount() {
        return enrollmentCount;
    }

    public Teacher getTeacher() {
        return teacher;
    }
}
