import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test
    public void testFullName(){
        assertEquals("Zhang, Mengyuan", SkillDemo.fullName("Mengyuan", "Zhang"));
        // This test will pass
    }
}
