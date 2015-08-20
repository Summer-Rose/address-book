import org.junit.*;
import static org.junit.Assert.*;

public class PhoneTest {

  @Test
  public void phone_checkThatInstantiatesCorrectly_true() {
    Phone newPhone = new Phone("space", "111-222-3334");
    assertEquals(true, newPhone instanceof Phone);
  }
  @Test
  public void getNumber_checkThatReturnsCorrectNumber() {
    Phone newPhone = new Phone("banana", "111-777-8008");
    assertEquals("111-777-8008", newPhone.getNumber());
  }
    @Test
  public void getNumber_checkThatReturnsCorrectType() {
    Phone newPhone = new Phone("banana", "111-777-8008");
    assertEquals("banana", newPhone.getType());
  }
}
