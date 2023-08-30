import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CourseSessionTest {
    private final Date meaninglessDate = new Date();
    @Test
    public void testENGLDept(){
        CourseSession session = new CourseSession("ENGL", "101", meaninglessDate);
        assertEquals("ENGL", session.getDept());
        assertEquals("101", session.getCourseNum());
    }

    @Test
    public void testScienceDept() {
        CourseSession session = new CourseSession("SCIN", "202", meaninglessDate);
        assertEquals("SCIN", session.getDept());
        assertEquals("202", session.getCourseNum());
    }

    @Test
    public void testZeroStudents(){
        CourseSession session = new CourseSession("ENGL", "101", meaninglessDate);
        assertEquals(0, session.getNumberOfStudents());
    }

    @Test
    public void testEnrollingOneStudents(){
        CourseSession session = new CourseSession("ENGL", "102", meaninglessDate);
        Student student1 = new Student("FooBar Name");
        session.enroll(student1);
        assertEquals(1, session.getNumberOfStudents());
    }
    @Test
    public void testingStartDate(){
        int year = 2023;
        int month = 0;
        int date = 1;
        Date startDate = new Date(year,month,date);
        CourseSession session = new CourseSession("ENGL","102",startDate);
        
        Date endDate = new Date(year,3,23);
        assertEquals(endDate, session.getEndDate());
    }

    @Test
    public void testRosterReport(){
        CourseSession session = new CourseSession("ENGL", "102", meaninglessDate);
        session.enroll(new Student("A"));
        session.enroll(new Student("B"));

        String expectedRosterReport = "A\nB\n2";
        assertEquals(expectedRosterReport, session.getRosterReport());
    }
}
