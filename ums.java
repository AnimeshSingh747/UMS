// import java.util.ArrayList;
// import java.util.HashMap;
// import java.util.List;
// import java.util.Map;

// class Person {
//     protected String name;
//     protected int age;
//     protected String gender;

//     public Person(String name, int age, String gender) {
//         this.name = name;
//         this.age = age;
//         this.gender = gender;
//     }
// }

// class Student extends Person {
//     private int studentId;
//     private List<Course> courses;

//     public Student(int studentId, String name, int age, String gender) {
//         super(name, age, gender);
//         this.studentId = studentId;
//         this.courses = new ArrayList<>();
//     }

//     public void registerCourse(Course course) {
//         courses.add(course);
//         course.addStudent(this);
//     }

//     public void deregisterCourse(Course course) {
//         if (courses.contains(course)) {
//             courses.remove(course);
//             course.removeStudent(this);
//         }
//     }

//     public List<String> displayCourses() {
//         List<String> courseNames = new ArrayList<>();
//         for (Course course : courses) {
//             courseNames.add(course.getName());
//         }
//         return courseNames;
//     }
// }

// class Teacher extends Person {
//     private int teacherId;
//     private List<Course> coursesTaught;

//     public Teacher(int teacherId, String name, int age, String gender) {
//         super(name, age, gender);
//         this.teacherId = teacherId;
//         this.coursesTaught = new ArrayList<>();
//     }

//     public void assignCourse(Course course) {
//         coursesTaught.add(course);
//         course.setTeacher(this);
//     }

//     public List<String> displayCoursesTaught() {
//         List<String> courseNames = new ArrayList<>();
//         for (Course course : coursesTaught) {
//             courseNames.add(course.getName());
//         }
//         return courseNames;
//     }
// }

// class Course {
//     private String courseCode;
//     private String name;
//     private List<Student> students;
//     private Teacher teacher;

//     public Course(String courseCode, String name) {
//         this.courseCode = courseCode;
//         this.name = name;
//         this.students = new ArrayList<>();
//     }

//     public String getName() {
//         return name;
//     }

//     public void addStudent(Student student) {
//         students.add(student);
//     }

//     public void removeStudent(Student student) {
//         students.remove(student);
//     }

//     public void setTeacher(Teacher teacher) {
//         this.teacher = teacher;
//     }

//     public List<String> getStudents() {
//         List<String> studentNames = new ArrayList<>();
//         for (Student student : students) {
//             studentNames.add(student.name);
//         }
//         return studentNames;
//     }

//     public Exam conductExam(String examName) {
//         return new Exam(examName, students);
//     }

//     public Map<String, Integer> generateReport(Exam exam) {
//         Map<String, Integer> report = new HashMap<>();
//         for (Student student : students) {
//             int marks = exam.getMarks(student);
//             report.put(student.name, marks);
//         }
//         return report;
//     }
// }

// class Exam {
//     private String name;
//     private Map<Student, Integer> marks;

//     public Exam(String name, List<Student> students) {
//         this.name = name;
//         this.marks = new HashMap<>();
//         for (Student student : students) {
//             marks.put(student, null);
//         }
//     }

//     public void assignMarks(Student student, int marks) {
//         if (this.marks.containsKey(student)) {
//             this.marks.put(student, marks);
//         }
//     }

//     public int getMarks(Student student) {
//         return marks.get(student);
//     }
// }

// public class ums {
//     public static void main(String[] args) {

//         Student student1 = new Student(1, "Animesh", 22, "Male");
//         Student student2 = new Student(2, "Avinash", 21, "Male");

//         Teacher teacher1 = new Teacher(101, "Dhruv jain", 35, "Male");

//         Course course1 = new Course("CS1011", "Introduction to OOPS");
//         Course course2 = new Course("CS1012", "Advanced Concepts");

//         student1.registerCourse(course1);
//         student2.registerCourse(course1);

//         teacher1.assignCourse(course1);

//         System.out.println(student1.displayCourses());
//         System.out.println(teacher1.displayCoursesTaught());

//         Exam exam1 = course1.conductExam("Midterm Exam");
//         exam1.assignMarks(student1, 90);
//         exam1.assignMarks(student2, 85);

//         Exam exam2 = course2.conductExam("Finalterm Exam");
//         exam2.assignMarks(student1, 70);
//         exam2.assignMarks(student2, 95);

//         Map<String, Integer> report = course1.generateReport(exam1);
//         System.out.println(report);
//     }
// }
