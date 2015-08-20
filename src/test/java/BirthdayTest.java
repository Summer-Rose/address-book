import org.junit.*;
import static org.junit.Assert.*;

public class BirthdayTest {

  @Test
  public void birthday_instantiatesCorrectly() {
    Birthday testBirthday = new Birthday("January", 21, 1987);
    assertEquals(true, testBirthday instanceof Birthday);
  }

  @Test
  public void birthday_getsCorrectMonth() {
    Birthday testBirthday = new Birthday("January", 21, 1987);
    assertEquals("January", testBirthday.getMonth());
  }
  @Test
  public void birthday_getsCorrectYear() {
    Birthday testBirthday = new Birthday("January", 21, 1987);
    assertEquals(1987, testBirthday.getYear());
  }
}
