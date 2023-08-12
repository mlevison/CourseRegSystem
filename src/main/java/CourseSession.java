import java.util.ArrayList;

public class CourseSession {
    private final String dept;
    private final String courseNum;
    private final ArrayList<Student> studentList = new ArrayList<Student>();
    public CourseSession(String inDept, String inCourseNumber) {
        dept = inDept;
        courseNum = inCourseNumber;
    }

    public String getDept() {
        return dept;
    }

    public String getCourseNum() {
        return courseNum;
    }

    public int getNumberOfStudents() {
        return studentList.size();
    }

    public void enroll(Student student) {
        studentList.add(student);
    }
}
