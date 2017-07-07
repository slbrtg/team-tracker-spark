import org.junit.*;
import static org.junit.Assert.*;

public class TeamTest {
  @Test
  public void team_instantiatesCorrectly_true() {
    Team testTeam = new Team("script jockeys");
    assertEquals(true, testTeam instanceof Team);
  }

  @Test
  public void getName_teamInstantiatesWithName_javakids() {
    Team testTeam = new Team("java kids");
    assertEquals("java kids", testTeam.getName());
  }

  @Test
  public void all_returnsAllInstancesOfTeam_true() {
    Team firstTeam = new Team("script jockeys");
    Team secondTeam = new Team("java kids");
    assertEquals(true, firstTeam.getAll().contains(firstTeam));
    assertEquals(true, secondTeam.getAll().contains(secondTeam));
  }

  @Test
  public void addToTeam_addsMemberToTeam_true() {
    Team testTeam = new Team("script jockeys");
    Member testMember = new Member("Snowden", "h4x");
    testTeam.addToTeam(testMember);
    assertTrue(testTeam.getMembers().contains(testMember));
  }
}
