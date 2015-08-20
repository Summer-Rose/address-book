import org.junit.*;
import static org.junit.Assert.*;

public class PhoneTest {
  @Test
  public void phone_checkThatInstantiatesCorrectly_true() {
    Phone newPhone = new Phone("space", "111-222-3334");
    assertEquals(true, newPhone instanceof Phone);
  }
}
