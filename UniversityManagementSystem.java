import java.util.Map;

public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Example Usage
        Student student1 = new Student(1, "Anisha", 20, "Female");
        Student student2 = new Student(2, "Animesh", 21, "Male");

        Teacher teacher1 = new Teacher(101, "Jain", 35, "Male");

        Course course1 = new Course("CS101", "Introduction to Computer Science");
        Course course2 = new Course("MATH201", "Advanced Mathematics");

        student1.registerCourse(course1);
        student2.registerCourse(course1);

        teacher1.assignCourse(course1);

        System.out.println(student1.displayCourses());
        System.out.println(teacher1.displayCoursesTaught()); 

        Exam exam1 = course1.conductExam("Midterm Exam");
        exam1.assignMarks(student1, 90);
        exam1.assignMarks(student2, 85);

        Map<String, Integer> report = course1.generateReport(exam1);
        System.out.println(report);
    }
}
