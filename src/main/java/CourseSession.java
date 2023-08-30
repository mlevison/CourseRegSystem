import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CourseSession {
    private final String dept;
    private final String courseNum;
    private final ArrayList<Student> studentList = new ArrayList<Student>();
    private final Date startDate;
    public CourseSession(String inDept, String inCourseNumber, Date inStartDate) {
        dept = inDept;
        courseNum = inCourseNumber;
        startDate = inStartDate;
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

    public Date getEndDate() {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(startDate);
        int numberOfDays = 16 * 7;
        calendar.add(Calendar.DAY_OF_YEAR, numberOfDays);
        return calendar.getTime();
    }

    public String getRosterReport() {
        StringBuilder buffer = new StringBuilder();

        Student student = studentList.get(0);
        buffer.append(student.getName());
        buffer.append('\n');

        student = studentList.get(1);
        buffer.append(student.getName());
        buffer.append('\n');

        buffer.append(studentList.size());

        return buffer.toString();
    }
}
