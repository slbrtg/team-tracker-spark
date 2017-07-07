import org.junit.*;
import static org.junit.Assert.*;

public class MemberTest {
  @Test
  public void Member_instantiatesCorrectly_true() {
    Member testMember = new Member("Mow the lawn");
    assertEquals(true, testMember instanceof Member);
  }

  @Test
  public void Member_instantiatesWithName_String() {
    Member testMember = new Member("Snowden");
    assertEquals("Mow the lawn", testMember.getDescription());
  }
}
