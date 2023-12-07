import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Person {
    protected String name;
    protected int age;
    protected String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}

class Student extends Person {
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

class Teacher extends Person {
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

    public List<String> displayCoursesTaught() {
        List<String> courseNames = new ArrayList<>();
        for (Course course : coursesTaught) {
            courseNames.add(course.getName());
        }
        return courseNames;
    }
}

class Course {
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

}