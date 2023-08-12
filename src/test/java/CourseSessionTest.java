import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CourseSessionTest {
    @Test
    public void testENGLDept(){
        CourseSession session = new CourseSession("ENGL", "101");
        assertEquals("ENGL", session.getDept());
    }

    @Test
    public void testScienceDept() {
        CourseSession session = new CourseSession("SCIN", "202");
        assertEquals("SCIN", session.getDept());
    }
}
