import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Exam {
    private String name;
    private Map<Student, Integer> marks;

    public Exam(String name, List<Student> students) {
        this.name = name;
        this.marks = new HashMap<>();
        for (Student student : students) {
            marks.put(student, null);
        }
    }

    public void assignMarks(Student student, int marks) {
        if (this.marks.containsKey(student)) {
            this.marks.put(student, marks);
        }
    }

    public int getMarks(Student student) {
        return marks.get(student);
    }
}
