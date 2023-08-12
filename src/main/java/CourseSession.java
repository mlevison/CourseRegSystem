
public class CourseSession {
    private final String dept;
    private final String courseNum;
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
}
