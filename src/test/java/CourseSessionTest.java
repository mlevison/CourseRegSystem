import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CourseSessionTest {
    @Test
    public void testENGLDept(){
        CourseSession session = new CourseSession("ENGL", "101");
        assertEquals("ENGL", session.getDept());
        assertEquals("101", session.getCourseNum());
    }

    @Test
    public void testScienceDept() {
        CourseSession session = new CourseSession("SCIN", "202");
        assertEquals("SCIN", session.getDept());
        assertEquals("202", session.getCourseNum());
    }

    @Test
    public void testZeroStudents(){
        CourseSession session = new CourseSession("ENGL", "101");
        assertEquals(0, session.getNumberOfStudents());
    }

    @Test
    public void testEnrollingOneStudents(){
        CourseSession session = new CourseSession("ENGL", "102");
        Student student1 = new Student("FooBar Name");
        session.enroll(student1);
        assertEquals(1, session.getNumberOfStudents());
    }
}
