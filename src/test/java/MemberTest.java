import org.junit.*;
import static org.junit.Assert.*;

public class MemberTest {
  @Test
  public void Member_instantiatesCorrectly_true() {
    Member testMember = new Member("Snowden", "h4x");
    assertEquals(true, testMember instanceof Member);
  }

  @Test
  public void Member_instantiatesWithName_String() {
    Member testMember = new Member("Snowden", "h4x");
    assertEquals("Snowden", testMember.getName());
  }

  @Test
  public void Member_instantiatesWithInterests_String() {
    Member testMember = new Member("Snowden", "h4x");
    assertEquals("h4x", testMember.getInterests());
  }
}
